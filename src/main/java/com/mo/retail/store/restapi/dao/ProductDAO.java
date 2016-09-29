package com.mo.retail.store.restapi.dao;

import java.util.List;

import com.mo.retail.store.restapi.model.Category;
import com.mo.retail.store.restapi.model.Product;

/**
 * Product Data Access Object
 * 
 * @author vinit-prajapati
 *
 */
public interface ProductDAO {

	/**
	 * Returns all products
	 * 
	 * @return List<Product>
	 */
	public List<Product> getAllProducts();

	/**
	 * Returns all products by category
	 * 
	 * @param category
	 * @return List<Product>
	 */
	public List<Product> getProductByCategory(final Category category);

	/**
	 * Get Product by Id
	 * 
	 * @param id
	 * @return Product
	 */
	public Product getProductById(final int id);

}
