package com.atguigu.principle.liskov.improve;

public class Liskov {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.fun2(10, 10));
        System.out.println(  b.fun(10, 10));
    }
}
//继承的原来是让子类同时拥有父类的方法在写代码的时候
// 尽量继承一个空的父类这样可以实现给子类添加方法 使用
class Base {
    public int fun2(int m, int n) {
        return n * m;
    }
}

class A extends Base {
    public int fun(int num, int num1) {
        return num + num1;
    }
}

class B extends Base {
    private A a=new A();

    public int fun(int a, int b) {
        return this.a.fun(a, b);
    }
}