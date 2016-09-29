package com.mo.retail.store.restapi.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.mo.retail.store.restapi.db.InMemoryDatabase;
import com.mo.retail.store.restapi.model.Order;

/**
 * Order DAO Implementation
 * 
 * @author vinit-prajapati
 *
 */
@Repository
public class OrderDAOImpl implements OrderDAO {

	/**
	 * {@inheritDoc}
	 */
	public void saveOrder(Order order) {
		getAllOrders().add(order);
	}

	/**
	 * {@inheritDoc}
	 */
	public List<Order> getAllOrders() {
		return InMemoryDatabase.ORDERS;
	}

	/**
	 * {@inheritDoc}
	 */
	public Order getOrder(final String invoiceNumber) {
		List<Order> orders = getAllOrders();

		for (Order order : orders) {
			if (order.getInvoiceNumber().equals(invoiceNumber))
				return order;
		}
		return null;
	}

}
