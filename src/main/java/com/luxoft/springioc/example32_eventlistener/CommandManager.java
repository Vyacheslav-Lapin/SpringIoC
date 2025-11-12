package com.luxoft.springioc.example32_eventlistener;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

@Setter
@Getter
@Accessors(chain = false)
public class CommandManager implements ApplicationContextAware {
  ApplicationContext applicationContext;
}
