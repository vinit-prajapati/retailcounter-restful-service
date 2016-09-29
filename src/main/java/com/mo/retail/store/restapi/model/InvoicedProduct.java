package com.mo.retail.store.restapi.model;

/**
 * Invoiced product
 * 
 * @author vinit-prajapati
 *
 */
public class InvoicedProduct extends Product {

	private int quantity;
	private double totalProductPrice;
	private double totalProductSalesTax;

	public InvoicedProduct(final Product product, int quantity, double totalProductPrice, double totalProductSalesTax) {
		super(product.getId(), product.getName(), product.getUnitPrice(), product.getCategory());
		this.quantity = quantity;
		this.totalProductPrice = totalProductPrice;
		this.totalProductSalesTax = totalProductSalesTax;
	}

	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity
	 *            the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/**
	 * @return the totalProductPrice
	 */
	public double getTotalProductPrice() {
		return totalProductPrice;
	}

	/**
	 * @param totalProductPrice
	 *            the totalProductPrice to set
	 */
	public void setTotalProductPrice(double totalProductPrice) {
		this.totalProductPrice = totalProductPrice;
	}

	/**
	 * @return the totalProductSalesTax
	 */
	public double getTotalProductSalesTax() {
		return totalProductSalesTax;
	}

	/**
	 * @param totalProductSalesTax
	 *            the totalProductSalesTax to set
	 */
	public void setTotalProductSalesTax(double totalProductSalesTax) {
		this.totalProductSalesTax = totalProductSalesTax;
	}

}
