package com.mo.retail.store.restapi.model;

import java.util.List;

/**
 * Order Model
 * 
 * @author vinit-prajapati
 *
 */
public class Order {

	private String invoiceNumber;
	private List<InvoicedProduct> invoicedProducts;
	private int numberOfItems;
	private double grossBill;

	/**
	 * @return the invoiceNumber
	 */
	public String getInvoiceNumber() {
		return invoiceNumber;
	}

	/**
	 * @param invoiceNumber
	 *            the invoiceNumber to set
	 */
	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	/**
	 * @return the invoicedProducts
	 */
	public List<InvoicedProduct> getInvoicedProducts() {
		return invoicedProducts;
	}

	/**
	 * @param invoicedProducts
	 *            the invoicedProducts to set
	 */
	public void setInvoicedProducts(List<InvoicedProduct> invoicedProducts) {
		this.invoicedProducts = invoicedProducts;
	}

	/**
	 * @return the numberOfItems
	 */
	public int getNumberOfItems() {
		return numberOfItems;
	}

	/**
	 * @param numberOfItems
	 *            the numberOfItems to set
	 */
	public void setNumberOfItems(int numberOfItems) {
		this.numberOfItems = numberOfItems;
	}

	/**
	 * @return the grossBill
	 */
	public double getGrossBill() {
		return grossBill;
	}

	/**
	 * @param grossBill
	 *            the grossBill to set
	 */
	public void setGrossBill(double grossBill) {
		this.grossBill = grossBill;
	}

}
