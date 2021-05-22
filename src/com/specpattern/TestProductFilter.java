package com.specpattern;

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
		ColorSpecification colorSpecification = new ColorSpecification(Color.GREEN);
		System.out.println(prodFilter.filter(productList, colorSpecification));
		
		SizeSpecification sizeSpecification  = new SizeSpecification(Size.MEDIUM);
		System.out.println(prodFilter.filter(productList, sizeSpecification));
		
		ColorSpecification redColorSpecification = new ColorSpecification(Color.RED);
		SizeSpecification largeSizeSpecification  = new SizeSpecification(Size.LARGE);
		System.out.println(prodFilter.filter(productList, new AndFilterSpecification<Product>(redColorSpecification,largeSizeSpecification)));
	}
}
