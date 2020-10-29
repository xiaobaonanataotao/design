package com.atguigu.devise23.singleton;

public class SingletonTest01 {
    public static void main(String[] args) {
//        /**懒汉模式*/
//        Singleton lazy = Singleton.getInstance();
//        Singleton lazy1 = Singleton.getInstance();
//        System.out.println(lazy == lazy1);
//        /**饿汉模式*/
//        Singleton1 singleton11 = Singleton1.getInstance();
//        Singleton1 singleton12 = Singleton1.getInstance();
//        System.out.println(singleton11 == singleton12);
//        /**枚举*/
        Singleton02 singleton02=Singleton02.SINGLETONl;
        Singleton02 singleton03=Singleton02.SINGLETONl;
        Singleton02.SINGLETONl.say();
        System.out.println(singleton02.hashCode());
        System.out.println(singleton03.hashCode());
//        /**内部类单例*/
//        Singleton01 singleton01=Singleton01.getInstance();
//        Singleton01 singleton02=Singleton01.getInstance();
//        System.out.println(singleton01.hashCode());
//        System.out.println(singleton02.hashCode());
    }

}

/**
 * 懒汉模式
 */
class Singleton {
    /**
     * 1.构造方法私有化
     */
    private Singleton() {
    }

    ;
    /**
     * 2.内部创建对象
     */
    private final static Singleton singleton = new Singleton();

    /**
     * 3.提供一个公有的静态方法，放回对象
     */
    public static Singleton getInstance() {
        return singleton;
    }
}


/**
 * 懒汉模式线程不安全模式
 */
class Lazy01 {
    private static Lazy01 lazy01;

    /**
     * 1.构造方法私有化
     */
    private Lazy01() {
    }

    ;


    /**
     * 提供一个公共方法只有在执行到此方法的是时候才执行
     */
    public static Lazy01 getInstance() {

        if (lazy01 == null) {
            lazy01 = new Lazy01();
        }
        return lazy01;
    }
}

/**
 * 懒汉模式线程安全模式
 */
class Lazy02 {
    private static Lazy02 lazy02;

    /**
     * 1.构造方法私有化
     */
    private Lazy02() {
    }

    ;


    /**
     * 提供一个公共方法只有在执行到此方法的是时候才执行
     * 加上同步代码块
     */
    public static synchronized Lazy02 getInstance() {

        if (lazy02 == null) {
            lazy02 = new Lazy02();
        }
        return lazy02;
    }
}

/**
 * 双重检索模式
 */
class Lazy03 {
    private static Lazy03 lazy03;

    /**
     * 1.构造方法私有化
     */
    private Lazy03() {
    }

    ;


    /**
     * 提供一个公共方法只有在执行到此方法的是时候才执行
     * 加上同步代码块
     */
    public static synchronized Lazy03 getInstance() {

        if (lazy03 == null) {
            synchronized (Lazy03.class) {
                if (lazy03 == null) {
                    lazy03 = new Lazy03();
                }
            }
        }
        return lazy03;
    }
}

/**
 * 静态内部类
 */
class Singleton01 {

    /**
     * 1.构造方法私有化
     */
    private Singleton01() {
    }

    ;

    /**
     * 2.内部类直接new出一个外部类的对象
     */
    private static class SingletonLazy {
        private static final Singleton01 SINGLETON01 = new Singleton01();
    }

    public static Singleton01 getInstance() {
        return SingletonLazy.SINGLETON01;
    }
}

/**
 * 枚举
 */
enum Singleton02 {
    SINGLETONl;
    public void say(){
        System.out.println("==================");
    }
}

/**
 * 饿汉模式
 */
class Singleton1 {


    /**
     * 1.构造方法私有化
     */
    private Singleton1() {
    }

    ;
    /**
     * 2.本类内部创建实例对象
     */
    private static Singleton1 singleton1;

    /**3.在静态代码块种创建对象*/
    static {
        singleton1 = new Singleton1();
    }

    /**
     * 4.提供一个公共的方法放回对象
     */
    public static Singleton1 getInstance() {
        return singleton1;
    }
}
