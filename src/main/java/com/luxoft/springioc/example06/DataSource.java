package com.luxoft.springioc.example06;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class DataSource {
  String driverClassName;
  String url;
  String username;
  String password;
}
