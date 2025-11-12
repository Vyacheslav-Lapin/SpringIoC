package com.luxoft.springioc.example29;

import org.springframework.context.ApplicationEvent;

public class CustomEvent extends ApplicationEvent
{
    private String from;

    public CustomEvent(Object source, String from)
    {
        super(source);
        this.from = from;
    }

    public String getFrom() {
        return from;
    }
}
