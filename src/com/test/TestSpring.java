package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pojo.Category;
import com.pojo.Product;
import com.service.ProductService;

public class TestSpring {

	public static void main(String[] args) {
		//ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});

		/*Category c = (Category)context.getBean("c");
		System.out.println(c.getName());*/
		/*Product p = (Product)context.getBean("p");
		System.out.println(p.getName());
		System.out.println(p.getCategory().getName());*/
		ApplicationContext context = new ClassPathXmlApplicationContext(
         new String[] { "applicationContext.xml" });
        ProductService s = (ProductService) context.getBean("s");
        s.doService();
	}	

}
