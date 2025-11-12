package com.luxoft.springioc.example29;

import org.springframework.context.ApplicationListener;

public class Bean implements ApplicationListener<CustomEvent>
{

	@Override
	public void onApplicationEvent(CustomEvent event) {
		System.out.println("CustomEvent received: " + event.getSource() +
				" from: " + event.getFrom());
	}

}
