package com.luxoft.springioc.example26;

import org.springframework.beans.factory.*;

public class Bean1 implements InitializingBean, DisposableBean  {

	@Override
	public void afterPropertiesSet() {
		System.out.println("Inside afterPropertiesSet");
	}

	@Override
	public void destroy() {
		System.out.println("Inside destroy");
	}
}
