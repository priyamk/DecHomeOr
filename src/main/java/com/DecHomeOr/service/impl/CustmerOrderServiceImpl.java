package com.DecHomeOr.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DecHomeOr.dao.CustomerOrderDao;
import com.DecHomeOr.model.Cart;
import com.DecHomeOr.model.CartItem;
import com.DecHomeOr.model.CustomerOrder;
import com.DecHomeOr.service.CartService;
import com.DecHomeOr.service.CustomerOrderService;


@Service
public class CustmerOrderServiceImpl implements CustomerOrderService{

    @Autowired
    private CustomerOrderDao customerOrderDao;

    @Autowired
    private CartService cartService;

    public void addCustomerOrder(CustomerOrder customerOrder){
        customerOrderDao.addCustomerOrder(customerOrder);
    }

    public double getCustomerOrderGrandTotal(int cartId){
        double grandTotal = 0;
        Cart cart = cartService.getCartById(cartId);
        List<CartItem> cartItems = cart.getCartItems();

        for (CartItem item : cartItems){
            grandTotal += item.getTotalPrice();
        }

        return grandTotal;
    }

} // The End of Class;
