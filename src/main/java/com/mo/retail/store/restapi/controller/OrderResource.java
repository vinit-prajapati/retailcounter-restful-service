package com.mo.retail.store.restapi.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mo.retail.store.restapi.model.CheckoutProduct;
import com.mo.retail.store.restapi.model.Order;
import com.mo.retail.store.restapi.service.OrderService;
import com.mo.retail.store.restapi.util.AppConstants;

/**
 * Order Resource
 * 
 * @author vinit-prajapati
 */
@RestController
@RequestMapping(value = AppConstants.ORDER)
public class OrderResource {

	private static final Logger LOGGER = Logger.getLogger(OrderResource.class);

	@Autowired
	private OrderService orderService;

	/**
	 * Creates order from provided products
	 * 
	 * @param checkoutProducts
	 * @return order
	 */
	@RequestMapping(method = RequestMethod.PUT)
	public @ResponseBody ResponseEntity<Order> saveOrder(@RequestBody final ArrayList<CheckoutProduct> checkoutProducts) {
		LOGGER.debug("Order resource: Save Order");

		return new ResponseEntity<Order>(orderService.saveOrder(checkoutProducts), HttpStatus.OK);

	}

	/**
	 * Retrieves order based on invoice number
	 * 
	 * @param invoiceNumber
	 * @return order
	 */
	@RequestMapping(value = AppConstants.INVOICE_NUMBER, method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<Order> getOrder(@PathVariable("invoicenumber") final String invoiceNumber) {
		LOGGER.debug("Order resource: Get Order By Invoice ID");

		return new ResponseEntity<Order>(orderService.getOrder(invoiceNumber), HttpStatus.OK);

	}

	/**
	 * Returns all orders
	 * 
	 * @return List<Order>
	 */
	@RequestMapping(value = AppConstants.ALL, method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<List<Order>> getAllProducts() {
		LOGGER.debug("Order resource: get all orders");

		return new ResponseEntity<List<Order>>(orderService.getAllOrders(), HttpStatus.OK);

	}
}
