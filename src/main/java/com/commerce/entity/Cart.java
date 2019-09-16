package com.commerce.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cart {

    @Id
    private int idcart;
    private int customerid;
    private int productid;
    private int quantity;
    @Column(name="transaction_number")
    private String transactionNumber;

    public Cart(int idcart, int customerid, int productid, int quantity, String transactionNumber) {
        this.idcart = idcart;
        this.customerid = customerid;
        this.productid = productid;
        this.quantity = quantity;
        this.transactionNumber = transactionNumber;
    }

    public Cart(){}

    public int getIdcart() {
        return idcart;
    }

    public void setIdcart(int idcart) {
        this.idcart = idcart;
    }

    public int getCustomerid() {
        return customerid;
    }

    public void setCustomerid(int customerid) {
        this.customerid = customerid;
    }

    public int getProductid() {
        return productid;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getTransactionNumber() {
        return transactionNumber;
    }

    public void setTransactionNumber(String transactionNumber) {
        this.transactionNumber = transactionNumber;
    }
}
