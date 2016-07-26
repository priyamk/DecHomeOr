package com.DecHomeOr.service;

import com.DecHomeOr.model.Cart;

public interface CartService {

    Cart getCartById(int cartId);

    void update(Cart cart);
}

