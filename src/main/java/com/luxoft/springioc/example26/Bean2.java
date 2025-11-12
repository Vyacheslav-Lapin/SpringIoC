package com.luxoft.springioc.example26;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;

public class Bean2 implements BeanFactoryAware, BeanNameAware  {

	@Override
	public void setBeanName(String beanName) {
		System.out.println(beanName +" bean has been initialized." );	
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("Bean factory " + beanFactory + " has been initialized." );
		System.out.println("bean is singleton: " + beanFactory.isSingleton("bean1"));
		System.out.println("bean is prototype: " + beanFactory.isPrototype("bean2"));
	}

}
