package com.commerce.repository;

import com.commerce.entity.Cart;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartRepository extends CrudRepository<Cart, Long> {
    List<Cart> findAllByTransactionNumberAndCustomerid(String transactionNumber, int customerid);
}
