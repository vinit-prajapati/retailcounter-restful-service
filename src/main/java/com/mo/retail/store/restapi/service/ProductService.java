package com.mo.retail.store.restapi.service;

import java.util.List;

import com.mo.retail.store.restapi.model.Category;
import com.mo.retail.store.restapi.model.Product;

/**
 * Product Service
 * 
 * @author vinit-prajapati
 *
 */
public interface ProductService {

	/**
	 * Returns all products
	 * 
	 * @return List<Prodict>
	 */
	public List<Product> getAllProdcuts();
	
	/**
	 * Returns products by category
	 * 
	 * @param category
	 * @return List<Prodict>
	 */
	public List<Product> getProductByCategory(final Category category);
}
