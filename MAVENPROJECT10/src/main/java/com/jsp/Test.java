package com.jsp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
	public static void main(String[] args) 
	{
	    ClassPathXmlApplicationContext c1= new ClassPathXmlApplicationContext("com/jsp/Sample.xml");
	    System.out.println(c1.getBean("sample"));
		
	}

}
