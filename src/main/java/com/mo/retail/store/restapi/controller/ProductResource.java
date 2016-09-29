package com.mo.retail.store.restapi.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mo.retail.store.restapi.model.Category;
import com.mo.retail.store.restapi.model.Product;
import com.mo.retail.store.restapi.service.ProductService;
import com.mo.retail.store.restapi.util.AppConstants;

/**
 * Product Resource
 * 
 * @author vinit-prajapati
 *
 */
@RestController
@RequestMapping(value = AppConstants.PRODUCT)
public class ProductResource {

	private static final Logger LOGGER = Logger.getLogger(ProductResource.class);

	@Autowired
	private ProductService productService;

	/**
	 * Returns all products
	 * 
	 * @return List<Product>
	 */
	@RequestMapping(method = RequestMethod.GET, value = AppConstants.ALL)
	public @ResponseBody ResponseEntity<List<Product>> getAllProducts() {
		LOGGER.debug("Product resource: get all products");

		return new ResponseEntity<List<Product>>(productService.getAllProdcuts(), HttpStatus.OK);

	}

	/**
	 * Returns all products by category
	 * 
	 * @param strCategory
	 *            category
	 * @return List<Product>
	 */
	@RequestMapping(method = RequestMethod.GET, value = AppConstants.PRODUCT_BY_CATEGORY)
	public @ResponseBody ResponseEntity<List<Product>> getAllProducts(
			@PathVariable("category") final String strCategory) {
		LOGGER.debug("Product resource: get products by category");

		final Category category = Category.valueOf(strCategory);
		final List<Product> products = productService.getProductByCategory(category);
		return new ResponseEntity<List<Product>>(products, HttpStatus.OK);
	}

	/**
	 * Returns product categories
	 * 
	 * @return Category[]
	 */
	@RequestMapping(method = RequestMethod.GET, value = AppConstants.CATEGORY)
	public @ResponseBody ResponseEntity<Category[]> getProductCategories() {
		LOGGER.debug("Product resource: get all product categories");

		return new ResponseEntity<Category[]>(Category.values(), HttpStatus.OK);

	}

}
