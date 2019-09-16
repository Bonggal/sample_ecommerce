package com.commerce.service.api;

import com.commerce.entity.Cart;
import com.commerce.entity.Transaction;

import java.util.List;

public interface CartService {
    Cart insert(Cart cart);
    List<Cart> findAllByTransactionNumberAndCustomerid(String transaction_number, int customerid);
}
