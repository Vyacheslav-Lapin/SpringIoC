package com.luxoft.springioc.temp.shop.bl;

import com.luxoft.springioc.temp.shop.Product;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Shop {
    StorageService service;

    public void addToStorage(Product p) {
        this.service.store(p);
    }
}
