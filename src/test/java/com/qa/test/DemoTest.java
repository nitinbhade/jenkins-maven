package com.qa.test;
import org.testng.Assert;
import org.testng.annotations.Test;



public class DemoTest {
	
	@Test
	public void sum(){
		int a = 30;
		int b = 20;
		System.out.println("Sum");
		Assert.assertEquals(50, a+b);
		
	}
	
	@Test
	public void sub(){
		int a = 30;
		int b = 20;
		System.out.println("Subtract");
		Assert.assertEquals(10, a-b);
	}
	
	@Test
	public void mul(){
		int a = 3;
		int b = 2;
		System.out.println("Multiplication");
		Assert.assertEquals(6, a*b);
		
	}
	
	@Test
	public void div(){
		int a = 10;
		int b = 5;
		System.out.println("Division");
		Assert.assertEquals(2, a/b);
		
	}

}
