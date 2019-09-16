package com.commerce.service.impl;

import com.commerce.entity.Cart;
import com.commerce.repository.CartRepository;
import com.commerce.service.api.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServicesImpl implements CartService {

    private CartRepository cartRepository;

    @Autowired
    public CartServicesImpl(CartRepository cartRepository){
        this.cartRepository = cartRepository;
    }

    @Override
    public Cart insert(Cart cart) {
        return cartRepository.save(cart);
    }

    @Override
    public List<Cart> findAllByTransactionNumberAndCustomerid(String transaction_number, int customerid) {
        return cartRepository.findAllByTransactionNumberAndCustomerid(transaction_number, customerid);
    }

}
