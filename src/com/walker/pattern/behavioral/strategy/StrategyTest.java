package com.walker.pattern.behavioral.strategy;

import com.walker.pattern.behavioral.strategy.source.Order;
import com.walker.pattern.behavioral.strategy.source.OrderAsynchronous;
import com.walker.pattern.behavioral.strategy.source.OrderInfo;
import com.walker.pattern.behavioral.strategy.source.OrderSynchronous;

public class StrategyTest {

    public static void main(String[] args) {
        Order order = new Order();
        order.setOrderStrategy(new OrderAsynchronous());
        order.loadStrategy().insert(new OrderInfo());

        order.setOrderStrategy(new OrderSynchronous());
        order.loadStrategy().insert(new OrderInfo());
    }

}
