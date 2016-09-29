package com.mo.retail.store.restapi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mo.retail.store.restapi.dao.OrderDAO;
import com.mo.retail.store.restapi.dao.ProductDAO;
import com.mo.retail.store.restapi.model.CheckoutProduct;
import com.mo.retail.store.restapi.model.InvoicedProduct;
import com.mo.retail.store.restapi.model.Order;
import com.mo.retail.store.restapi.model.Product;
import com.mo.retail.store.restapi.util.Utility;

/**
 * Order Service Implementation
 * 
 * @author vinit-prajapati
 *
 */
@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private ProductDAO productDAO;

	@Autowired
	private OrderDAO orderDAO;

	/**
	 * {@inheritDoc}
	 */
	public Order saveOrder(final List<CheckoutProduct> checkoutProducts) {
		final Order order = getOrder(checkoutProducts);
		orderDAO.saveOrder(order);
		return order;
	}

	/**
	 * {@inheritDoc}
	 */
	public Order getOrder(final String invoiceNumber) {
		return orderDAO.getOrder(invoiceNumber);
	}

	/**
	 * {@inheritDoc}
	 */
	public List<Order> getAllOrders() {
		return orderDAO.getAllOrders();
	}

	/**
	 * Create Order from CheckOut products
	 * 
	 * @param checkoutProducts
	 * @return Order
	 */
	private Order getOrder(final List<CheckoutProduct> checkoutProducts) {

		final Order order = new Order();
		order.setInvoiceNumber(Utility.getNextInvoiceNumber());
		double grossBill = 0;

		List<InvoicedProduct> invoicedProducts = new ArrayList<InvoicedProduct>();

		for (CheckoutProduct checkoutProduct : checkoutProducts) {
			// get Product details from DB
			final Product product = productDAO.getProductById(checkoutProduct.getId());

			final double productTotalUnitPrice = product.getUnitPrice() * checkoutProduct.getQuantity();
			final double productTotalSalesTax = product.getCategory().getSalesTax() * product.getUnitPrice()
					* checkoutProduct.getQuantity() / 100;

			grossBill += productTotalUnitPrice + productTotalSalesTax;

			// Create Invoiced product
			final InvoicedProduct invoicedProduct = new InvoicedProduct(product, checkoutProduct.getQuantity(),
					productTotalUnitPrice, productTotalSalesTax);

			invoicedProducts.add(invoicedProduct);
		}

		order.setInvoicedProducts(invoicedProducts);
		order.setNumberOfItems(invoicedProducts.size());
		order.setGrossBill(grossBill);

		return order;

	}

}
