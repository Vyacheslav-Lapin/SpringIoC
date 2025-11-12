package com.luxoft.springioc.example02;

import lombok.Setter;

import java.util.Arrays;

import static java.lang.IO.*;

public interface Service {
  void printNames();
}

@Setter
class ServiceBean implements Service {
  Dao dao;

  @Override
  public void printNames() {
    println(Arrays.toString(dao.getData()));
  }
}
