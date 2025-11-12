package com.luxoft.springioc.temp.shop;

import com.luxoft.springioc.temp.shop.bl.Shop;
import com.luxoft.springioc.temp.shop.bl.StorageService;
import com.luxoft.springioc.temp.shop.storage.SuperStorage;

public class Demo {

  static void main() {
        Product tv = new Product("TV");
        Product axe = new Product("AXE");

        StorageService storageService = new SuperStorage();

        StorageService storageFilter = new StorageFilter(storageService);

        Shop shop = new Shop();
        shop.setService(storageFilter);

        shop.addToStorage(tv);
        shop.addToStorage(axe);
    }
}
