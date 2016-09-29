package com.mo.retail.store.restapi.dao;

import java.util.List;

import com.mo.retail.store.restapi.model.Order;

/**
 * Order Data Access Object
 * 
 * @author vinit-prajapati
 *
 */
public interface OrderDAO {

	/**
	 * Save Order
	 * 
	 * @param order
	 */
	public void saveOrder(final Order order);
	
	/**
	 * Returns order based on invoice number
	 * 
	 * @param invoiceNumber
	 * @return Order
	 */
	public Order getOrder(final String invoiceNumber);

	/**
	 * Returns all orders
	 * 
	 * @return List<Order>
	 */
	public List<Order> getAllOrders();

}
