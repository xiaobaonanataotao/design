package com.atguigu.principle.liskov;

public class Liskov {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("11+3=" + a.fun1(11, 3));
        B b = new B();
        System.out.println("11+3=" + b.fun1(11, 3));
    }
}

class A {
    public int fun1(int num, int num1) {
        return num + num1;
    }
}

//当B继承A的时候
class B extends A {
    //    无意识的重写了fun1的方法
    public int fun1(int num1, int num2) {
        return num1 - num2;
    }
}