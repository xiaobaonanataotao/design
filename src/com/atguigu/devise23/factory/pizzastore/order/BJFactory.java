package com.atguigu.devise23.factory.pizzastore.order;

import com.atguigu.devise23.factory.pizzastore.pizza.BJCheesePizza;
import com.atguigu.devise23.factory.pizzastore.pizza.BJPepperPizza;
import com.atguigu.devise23.factory.pizzastore.pizza.Pizza;

public class BJFactory implements AbsFactory {
    Pizza pizza;

    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("~ʹ�õ��ǳ��󹤳�ģʽ~");
        // TODO Auto-generated method stub
        if(orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (orderType.equals("pepper")){
            pizza = new BJPepperPizza();
        }
        return null;
    }
}
