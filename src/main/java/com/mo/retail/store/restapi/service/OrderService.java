package com.mo.retail.store.restapi.service;

import java.util.List;

import com.mo.retail.store.restapi.model.CheckoutProduct;
import com.mo.retail.store.restapi.model.Order;

/**
 * Order Service
 * 
 * @author vinit-prajapati
 *
 */
public interface OrderService {

	/**
	 * Save Order
	 * 
	 * @param checkoutProducts
	 * @return Order
	 */
	public Order saveOrder(final List<CheckoutProduct> checkoutProducts);

	/**
	 * Get Order
	 * 
	 * @param invoiceNumber
	 * @return Order
	 */
	public Order getOrder(final String invoiceNumber);

	/**
	 * Returns all Order
	 * 
	 * @return List<Order>
	 */
	public List<Order> getAllOrders();

}
