package com.mo.retail.store.restapi.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.mo.retail.store.restapi.db.InMemoryDatabase;
import com.mo.retail.store.restapi.model.Category;
import com.mo.retail.store.restapi.model.Product;

/**
 * Product DAO Implementation
 * 
 * @author vinit-prajapati
 *
 */
@Repository
public class ProductDAOImpl implements ProductDAO {

	/**
	 * {@inheritDoc}
	 */
	public List<Product> getAllProducts() {
		return InMemoryDatabase.PRODUCTS;
	}

	/**
	 * {@inheritDoc}
	 */
	public List<Product> getProductByCategory(Category category) {
		List<Product> categoryProducts = new ArrayList<Product>();

		for (Product prodcut : getAllProducts()) {
			if (prodcut.getCategory().equals(category)) {
				categoryProducts.add(prodcut);
			}
		}
		return categoryProducts;
	}

	/**
	 * {@inheritDoc}
	 */
	public Product getProductById(int id) {
		for (Product prodcut : getAllProducts()) {
			if (prodcut.getId() == id) {
				return prodcut;
			}
		}
		return null;
	}

}
