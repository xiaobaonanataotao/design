package com.atguigu.devise23.factory.pizzastore.order;

import com.atguigu.devise23.factory.pizzastore.pizza.Pizza;

public interface AbsFactory {
    /**
     * ��������ӹ��̴���
     */
    public Pizza createPizza(String orderType);
}
