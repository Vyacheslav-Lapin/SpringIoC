package com.luxoft.springioc.example33;

import java.util.Locale;

import org.springframework.cglib.core.Local;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Localization
{

    public static void main(String[] args)
    {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("example33/localization.xml");

        String nameEnglish =
                context.getMessage("customer.name",
                        new Object[]{27, "http://www.luxoft.com"}, Locale.getDefault());

        String address =
                context.getMessage("customer.address", null, Locale.getDefault());

        System.out.println(address);
        System.out.println("Customer name (English) : " + nameEnglish);

        String nameGerman = context.getMessage("customer.name",
                new Object[]{28, "http://www.luxoft.com"}, Locale.GERMAN);

        System.out.println("Customer name (German) : " + nameGerman);

        context.close();

    }

}
