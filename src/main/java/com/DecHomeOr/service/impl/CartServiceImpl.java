package com.DecHomeOr.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DecHomeOr.dao.CartDao;
import com.DecHomeOr.model.Cart;
import com.DecHomeOr.service.CartService;
@Service
public class CartServiceImpl implements CartService{

    @Autowired
    private CartDao cartDao;

    public Cart getCartById(int cartId){
        return cartDao.getCartById(cartId);
    }

    public void update(Cart cart){
        cartDao.update(cart);
    }

} // The End of Class;
