package com.service;

import org.springframework.stereotype.Component;

@Component("s")
public class ProductService {

	public void doService()
	{
		System.out.println("do service");
	}
}
