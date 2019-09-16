package com.commerce.service.api;

import com.commerce.entity.Transaction;

import java.util.ArrayList;

public interface TransactionService {
    Transaction insert(int customerid, String transactionNumber);
    ArrayList<Transaction> findAll();
    Transaction findByIdtransaction(int idTransaction);
}
