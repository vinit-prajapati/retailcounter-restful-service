package com.mo.retail.store.restapi.db;

import java.util.ArrayList;
import java.util.List;

import com.mo.retail.store.restapi.model.Category;
import com.mo.retail.store.restapi.model.Order;
import com.mo.retail.store.restapi.model.Product;

/**
 * In memory database Hold products & orders in arraylist
 * 
 * @author vinit-prajapati
 *
 */
public class InMemoryDatabase {

	public static final List<Product> PRODUCTS = new ArrayList<Product>();
	public static final List<Order> ORDERS = new ArrayList<Order>();

	static {
		PRODUCTS.add(new Product(1, "Biscuits", 22, Category.CATEGORY_A));
		PRODUCTS.add(new Product(2, "Chocolates", 35, Category.CATEGORY_A));
		PRODUCTS.add(new Product(3, "Bread", 30, Category.CATEGORY_A));
		PRODUCTS.add(new Product(4, "Milk", 25, Category.CATEGORY_A));
		PRODUCTS.add(new Product(5, "Butter", 65, Category.CATEGORY_A));

		PRODUCTS.add(new Product(6, "Sugar", 38, Category.CATEGORY_B));
		PRODUCTS.add(new Product(7, "Oil", 110, Category.CATEGORY_B));
		PRODUCTS.add(new Product(8, "Cow Ghee", 450, Category.CATEGORY_B));
		PRODUCTS.add(new Product(9, "Wheat Flour", 40, Category.CATEGORY_B));
		PRODUCTS.add(new Product(10, "Rice", 70, Category.CATEGORY_B));

		PRODUCTS.add(new Product(11, "Apple", 120, Category.CATEGORY_C));
		PRODUCTS.add(new Product(12, "Banana", 40, Category.CATEGORY_C));
		PRODUCTS.add(new Product(13, "Kiwi", 180, Category.CATEGORY_C));
		PRODUCTS.add(new Product(14, "Orange", 60, Category.CATEGORY_C));
		PRODUCTS.add(new Product(15, "Mango", 100, Category.CATEGORY_C));
	}

}
