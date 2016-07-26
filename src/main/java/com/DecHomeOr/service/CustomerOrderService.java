package com.DecHomeOr.service;

import com.DecHomeOr.model.CustomerOrder;

public interface CustomerOrderService {

    void addCustomerOrder(CustomerOrder customerOrder);

    double getCustomerOrderGrandTotal(int cartId);
}
