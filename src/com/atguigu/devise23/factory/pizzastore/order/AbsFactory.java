package com.atguigu.devise23.factory.pizzastore.order;

import com.atguigu.devise23.factory.pizzastore.pizza.Pizza;

public interface AbsFactory {
    /**
     * 让下面的子工程创建
     */
    public Pizza createPizza(String orderType);
}
