package com.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.pojo.Category;

public class TestSpring2 {
	
	
	
	@RunWith(SpringJUnit4ClassRunner.class)
	@ContextConfiguration("classpath:applicationContext.xml")
	public class TestSpring {
	    @Autowired
	    Category c;
	 
	    @Test
	    public void test(){
	        System.out.println(c.getName());
	    }
     }
}