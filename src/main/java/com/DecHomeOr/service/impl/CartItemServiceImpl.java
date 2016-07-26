package com.DecHomeOr.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DecHomeOr.dao.CartItemDao;
import com.DecHomeOr.model.Cart;
import com.DecHomeOr.model.CartItem;
import com.DecHomeOr.service.CartItemService;
@Service
public class CartItemServiceImpl implements CartItemService{

    @Autowired
    private CartItemDao cartItemDao;

    public void addCartItem(CartItem cartItem){
        cartItemDao.addCartItem(cartItem);
    }

    public void removeCartItem(CartItem cartItem){
        cartItemDao.removeCartItem(cartItem);
    }

    public void removeAllCartItems(Cart cart){
        cartItemDao.removeAllCartItems(cart);
    }

    public CartItem getCartItemByProductId(int productId){
        return cartItemDao.getCartItemByProductId(productId);
    }

} // The End of Class;
