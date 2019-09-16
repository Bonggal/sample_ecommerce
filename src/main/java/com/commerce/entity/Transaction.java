package com.commerce.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Transaction {
    @Id
    private int idtransaction;
    private String transactionNumber;
    private int customerid;
    private int price;

    public Transaction(){}

    public Transaction( String transactionNumber, int customerid, int price) {
        this.transactionNumber = transactionNumber;
        this.customerid = customerid;
        this.price = price;
    }

    public int getIdtransaction() {
        return idtransaction;
    }

    public void setIdtransaction(int idtransaction) {
        this.idtransaction = idtransaction;
    }

    public String getTransactionNumber() {
        return transactionNumber;
    }

    public void setTransactionNumber(String transactionNumber) {
        this.transactionNumber = transactionNumber;
    }

    public int getCustomerid() {
        return customerid;
    }

    public void setCustomerid(int customerid) {
        this.customerid = customerid;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
