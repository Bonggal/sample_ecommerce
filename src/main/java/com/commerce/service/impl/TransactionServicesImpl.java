package com.commerce.service.impl;

import com.commerce.entity.Cart;
import com.commerce.entity.Product;
import com.commerce.entity.Transaction;
import com.commerce.repository.CartRepository;
import com.commerce.repository.ProductRepository;
import com.commerce.repository.TransactionRepository;
import com.commerce.service.api.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TransactionServicesImpl implements TransactionService {

    private TransactionRepository transactionRepository;
    private CartRepository cartRepository;
    private ProductRepository productRepository;

    @Autowired
    public TransactionServicesImpl(TransactionRepository transactionRepository, CartRepository cartRepository, ProductRepository productRepository) {
        this.transactionRepository = transactionRepository;
        this.cartRepository = cartRepository;
        this.productRepository = productRepository;
    }

    @Override
    public Transaction insert(int customerid, String transactionNumber) {
        int price = 0;

        List<Cart> cartList = cartRepository.findAllByTransactionNumberAndCustomerid(transactionNumber, customerid);

        for (Cart cart : cartList) {
            Product product = productRepository.findByIdproduct(cart.getProductid());
            price = price + (cart.getQuantity() * product.getPrice());
        }

        Transaction transaction = new Transaction(transactionNumber, customerid, price);
        return transactionRepository.save(transaction);
    }

    @Override
    public ArrayList<Transaction> findAll() {
        return transactionRepository.findAll();
    }

    @Override
    public Transaction findByIdtransaction(int idTransaction) {
        return transactionRepository.findAllByIdtransaction(idTransaction);
    }
}
