package com.DecHomeOr.service;

import com.DecHomeOr.model.Cart;
import com.DecHomeOr.model.CartItem;

public interface CartItemService {

    void addCartItem(CartItem cartItem);

    void removeCartItem(CartItem cartItem);

    void removeAllCartItems(Cart cart);

    CartItem getCartItemByProductId(int productId);

}
