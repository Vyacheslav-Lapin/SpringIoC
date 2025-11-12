package com.luxoft.springioc.example28;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanCreationException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class InitHelloWorld implements BeanPostProcessor {
	
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("BeforeInitialization : " + beanName);
		if (bean instanceof HelloWorld) {
			HelloWorld hw = (HelloWorld) bean;
			if (hw.getMessage().isEmpty())
				throw new BeanCreationException("message should not be empty");
			hw.setMessage(hw.getMessage() + " !!!!!");
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
      System.out.println("AfterInitialization : " + beanName);
		if (bean instanceof HelloWorld) {
			HelloWorld hw = (HelloWorld) bean;
			if (hw.getMessage().isEmpty()) throw new BeanCreationException("error in message");
			hw.setMessage(hw.getMessage() + " !!!!!");
		}
      return bean;
    }

}
