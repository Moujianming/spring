package com.pojo;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;

public class Product {

	private int id;
	private String name;
	//@Autowired
	@Resource(name="c")
	private Category category;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Category getCategory() {
		System.out.println("get category method");
		return category;
	}
	//@Autowired
	public void setCategory(Category category) {
		System.out.println("set category method");
		this.category = category;
	}
	
}
