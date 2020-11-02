package com.atguigu.devise23.builder.improve;

public abstract class HouseBuilder {
    protected House house = new House();

    /**
     * 将建造房子的方法抽象出来
     */
    public abstract void buildBasic();

    public abstract void buildWalls();

    public abstract void roofed();

    /**
     * 建造房子好， 将产品(房子) 返回
     */
    public House buildHouse() {
        return house;
    }
}
