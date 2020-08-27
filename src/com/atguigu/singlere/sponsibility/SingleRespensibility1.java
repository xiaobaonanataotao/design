package com.atguigu.singlere.sponsibility;

public class SingleRespensibility1 {
    public static void main(String[] args) {
        Vehicle v=new Vehicle();
        v.runWater("轮船");
        v.run("汽车");
        v.runAri("飞机");


    }
}
//在run方法中违反了单一原则
//解决方法在不同的方法中创建不同的类
//class Vehicle{
//    public void run (String verhiche){
//        System.out.println(verhiche+"在路上");
//    }
//}
//解决方法三
//方法级别的单一职责
class Vehicle{
    public void run (String verhiche){
        System.out.println(verhiche+"在路上");
    }  public void runAri (String verhiche){
        System.out.println(verhiche+"在路上");
    }public void runWater (String verhiche){
        System.out.println(verhiche+"在路上");
    }
}