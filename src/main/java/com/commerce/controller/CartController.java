package com.commerce.controller;

import com.commerce.entity.Cart;
import com.commerce.service.impl.CartServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("cart")
public class CartController {

    private CartServicesImpl cartServices;

    @Autowired
    public CartController(CartServicesImpl cartServices) {
        this.cartServices = cartServices;
    }

    @PostMapping(value = "/save", produces = "application/json")
    public Cart insertCart(@RequestBody Cart cart) {
        return cartServices.insert(cart);
    }

}
