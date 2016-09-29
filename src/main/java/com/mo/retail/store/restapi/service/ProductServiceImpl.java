package com.mo.retail.store.restapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mo.retail.store.restapi.dao.ProductDAO;
import com.mo.retail.store.restapi.model.Category;
import com.mo.retail.store.restapi.model.Product;

/**
 * Product Service Implementation
 * 
 * @author vinit-prajapati
 *
 */
@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDAO productDAO;

	/**
	 * {@inheritDoc}
	 */
	public List<Product> getAllProdcuts() {
		return productDAO.getAllProducts();
	}

	/**
	 * {@inheritDoc}
	 */
	public List<Product> getProductByCategory(final Category category) {
		return productDAO.getProductByCategory(category);
	}

}
