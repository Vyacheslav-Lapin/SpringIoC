package com.luxoft.springioc.example34;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * VM options
 * -Dspring.profiles.active=dev
 * -Dspring.profiles.active=production
 */
public class Main {
	
	public static void main(String args[]) {
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("classpath:example34/*.xml");
		
		context.getEnvironment().setActiveProfiles("dev");
		context.refresh();

		Bean bean = (Bean)context.getBean("bean");

		System.out.println("a=" + bean.getA());

		context.close();
    }
}
