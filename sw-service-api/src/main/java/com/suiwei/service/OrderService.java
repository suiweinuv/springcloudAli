package com.suiwei.service;


import com.suiwei.entity.Order;

public interface OrderService {

    Order saveOrderInfo(Order order);

    Order saveOrderInfo2(Integer bookId);
}
