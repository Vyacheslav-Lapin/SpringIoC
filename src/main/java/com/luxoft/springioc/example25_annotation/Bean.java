package com.luxoft.springioc.example25_annotation;

import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Data
@Service("bean")
@Scope("prototype")
public class Bean {
  int a;
  int b;
  int c;
}
