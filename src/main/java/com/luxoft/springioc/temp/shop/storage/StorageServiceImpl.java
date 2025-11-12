package com.luxoft.springioc.temp.shop.storage;

import com.luxoft.springioc.temp.shop.Product;
import com.luxoft.springioc.temp.shop.bl.StorageService;

import static java.lang.IO.*;

public class StorageServiceImpl implements StorageService {
  public void store(Product p) {
    println("stored: " + p.getName());
  }
}
