package com.atguigu.devise23.factory.pizzastore.order;


import com.atguigu.devise23.factory.pizzastore.pizza.LDCheesePizza;
import com.atguigu.devise23.factory.pizzastore.pizza.LDPepperPizza;
import com.atguigu.devise23.factory.pizzastore.pizza.Pizza;

public class LDFactory implements AbsFactory {
    Pizza pizza = null;

    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("~使用的是抽象工厂模式~");

        if (orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new LDPepperPizza();
        }
        return pizza;
    }

}
