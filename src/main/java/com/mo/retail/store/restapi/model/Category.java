package com.mo.retail.store.restapi.model;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * Category types
 * 
 * @author vinit-prajapati
 *
 */
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum Category {

	CATEGORY_A("Category A", 10.0), CATEGORY_B("Category B", 20.0), CATEGORY_C("Category C", 0.0);

	private String categoryName;
	private double salesTax;

	/**
	 * @param categoryName
	 * @param serviceTax
	 */
	private Category(String categoryName, double serviceTax) {
		this.categoryName = categoryName;
		this.salesTax = serviceTax;
	}

	/**
	 * @return the categoryName
	 */
	public String getCategoryName() {
		return categoryName;
	}

	/**
	 * @param categoryName
	 *            the categoryName to set
	 */
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	/**
	 * @return the serviceTax
	 */
	public double getSalesTax() {
		return salesTax;
	}

	/**
	 * @param serviceTax
	 *            the serviceTax to set
	 */
	public void setSalesTax(double serviceTax) {
		this.salesTax = serviceTax;
	}

}
