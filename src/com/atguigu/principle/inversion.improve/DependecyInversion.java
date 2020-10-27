package com.atguigu.principle.inversion.improve;

public class DependecyInversion {
    public static void main(String[] args) {
        Person p = new Person();
        p.receive(new Email());
        p.receive(new WeiXin());
    }
}

class Email implements IReceiver {
    public String getInfo() {
        return "你有一个电子邮件信息";
    }
}

class WeiXin implements IReceiver {
    public String getInfo() {
        return "你有一个微信信息";
    }
}

interface IReceiver {
    public String getInfo();
}

//分析
//1.简单比较容易得到自己想要的结果
//2.如果我们新增微信、短信、等等则需要增加新类，则同时添加person对应的方法
//3.解题思路：引入一个IReceiver接口，表示接收者，这样Person与接口IReceiver发生依赖
//因为Email WeiXin等等属于接口范围，他们各自实现IReceiver接口就可以了
class Person {
    public void receive(IReceiver ireceiver) {
        System.out.println(ireceiver.getInfo());
    }
}