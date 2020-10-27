package com.atguigu.principle.inversion;

public class DependecyInversion {
    public static void main(String[] args) {
        Person p = new Person();
        p.receive(new Email());
    }
}

class Email {
    public String getInfo() {
        return "你有一个电子邮件信息";
    }
}
//分析
//1.简单比较容易得到自己想要的结果
//2.如果我们新增微信、短信、等等则需要增加新类，则同时添加person对应的方法
//3.解题思路：引入一个IReceiver接口，表示接收者，这样Person与接口IReceiver发生依赖
//因为Email WeiXin等等属于接口范围，他们各自实现IReceiver接口就可以了
class Person {
    public void receive(Email email) {
        System.out.println(email.getInfo());
    }
}