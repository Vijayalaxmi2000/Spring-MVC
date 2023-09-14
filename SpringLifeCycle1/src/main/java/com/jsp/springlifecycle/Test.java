package com.jsp.springlifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
	public static void main(String[] args) 
	{
		ClassPathXmlApplicationContext c1=
				new ClassPathXmlApplicationContext("com/jsp/springlifecycle/Employee.xml");
		
		System.out.println(c1.getBean("employee"));
		if(c1!=null)
		{
			c1.close();
		}
		
	}

}
