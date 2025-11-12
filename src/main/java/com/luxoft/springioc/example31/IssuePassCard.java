package com.luxoft.springioc.example31;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class IssuePassCard implements ApplicationListener<EmployeeRegistrationEvent> {
	
	public void onApplicationEvent(EmployeeRegistrationEvent event) {
		System.out.println("Pass is issued for Employee " + event.getEmployee().getSurname() + " " + event.getEmployee().getFirstName() +
				" is saved into the database");
	}

}
