package com.commerce.controller;

import com.commerce.entity.Transaction;
import com.commerce.service.impl.TransactionServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("transaction")
public class TransactionController {

    private TransactionServicesImpl transactionServices;

    @Autowired
    public TransactionController(TransactionServicesImpl transactionServices) {
        this.transactionServices = transactionServices;
    }

    @PostMapping(value = "/insert", produces = "application/json")
    public Transaction insertTransaction(@RequestParam String transactionNumber, @RequestParam int customerid) {
        return transactionServices.insert(customerid, transactionNumber);
    }

    @GetMapping(value="/all", produces = "application/json")
    public ArrayList<Transaction> getAllTransaction(){
        return transactionServices.findAll();
    }

    @GetMapping(value="/transaction", produces = "application/json")
    public Transaction getTransaction(@RequestParam int idTransaction){
        return transactionServices.findByIdtransaction(idTransaction);
    }
}
