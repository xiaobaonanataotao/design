package com.atguigu.principle.ocp.improve;

import java.awt.*;

public class Ocp {
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Triangle());
        graphicEditor.drawShape(new Other());
    }
}

//基类绘图Shape
abstract class Shape {
    int m_type;

    //    抽象类
    public abstract void drow();

    //抽象可以有抽象方法和非抽象方法
    public void s() {
        System.out.println("111111");
    }
}

//这是一个绘图类
class GraphicEditor {
    //    接受shape对象，调用draw方法
    public void drawShape(Shape s) {
        s.drow();
    }
}

class Circle extends Shape {

    @Override
    public void drow() {
        System.out.println("圆形");
    }
}

class Triangle extends Shape {
    @Override
    public void drow() {
        System.out.println("三角形");
    }
}

class Other extends Shape {
    @Override
    public void drow() {
        System.out.println("新添加");
    }
}