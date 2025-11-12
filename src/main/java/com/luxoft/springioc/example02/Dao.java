package com.luxoft.springioc.example02;

public interface Dao {
  String[] getData();
}

class DaoBean implements Dao {
  @Override
  public String[] getData() {
    return new String[]{"Inna", "Ivan", "Max", "Alina"};
  }
}
