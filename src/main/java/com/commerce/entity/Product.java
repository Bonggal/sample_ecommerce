package com.commerce.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
    @Id
    private int idproduct;
    private String name;
    private int quantity;
    private int price;

    public int getIdproduct() {
        return idproduct;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPrice() {
        return price;
    }
}
