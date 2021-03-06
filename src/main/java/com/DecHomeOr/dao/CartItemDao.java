package com.DecHomeOr.dao;

import com.DecHomeOr.model.Cart;
import com.DecHomeOr.model.CartItem;

public interface CartItemDao 
{
	void addCartItem(CartItem cartItem);

void removeCartItem(CartItem cartItem);

void removeAllCartItems(Cart cart);

CartItem getCartItemByProductId(int productId);
}
