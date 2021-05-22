package com.antipattern;

import java.util.ArrayList;
import java.util.List;

public class TestProductFilter {
	public static void main(String args[]) {
		List<Product> productList = new ArrayList<Product>() {{
			add(new Product("Iphone",Color.GREEN,Size.SMALL));
			add(new Product("Samsung",Color.BLUE,Size.MEDIUM));
			add(new Product("Oneplus",Color.RED,Size.LARGE));
		}};
		ProductFilter prodFilter = new ProductFilter();
		System.out.println(prodFilter.filterByColor(productList, Color.GREEN));
		System.out.println(prodFilter.filterBySize(productList, Size.MEDIUM));
		System.out.println(prodFilter.filterBySizeAndColor(productList, Color.RED, Size.LARGE));
	}
}
