package com.commerce.repository;

import com.commerce.entity.Transaction;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface TransactionRepository extends CrudRepository<Transaction,String> {
    ArrayList<Transaction> findAll();
    Transaction findAllByIdtransaction(int IdTransaction);
}
