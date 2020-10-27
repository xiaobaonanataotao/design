package com.atguigu.principle.inversion.improve;

public class DependencyPass {
    public static void main(String[] args) {
        ChengHong chengHong = new ChengHong();
//        一参数依赖
//        OpenAndClose openAndClose = new OpenAndClose();
//        openAndClose.open(chengHong);
//        二构造器依赖
//        OpenAndClose openAndClose = new OpenAndClose(chengHong);
//        openAndClose.open();
//        三通过setter方法进行传入
        OpenAndClose openAndClose=new OpenAndClose();
        openAndClose.setter(chengHong);
        openAndClose.open();
    }

}

/*
//方式1：通过接口传递实现依赖
//开关的接口
interface IOpenAndClose {
    public void open(ITV itv);
}

//ITV接口
interface ITV {
    public void play();
}

class ChengHong implements ITV {

    @Override
    public void play() {
        System.out.println("打开长虹电视");
    }
}

//实现接口
class OpenAndClose implements IOpenAndClose {
    @Override
    public void open(ITV itv) {
        itv.play();
    }
}
*/


/*
//方式二通过构造器传入依赖
interface IOpenAndClose {
    public void open();
}

//ITV接口
interface ITV {
    public void play();
}

class OpenAndClose implements IOpenAndClose {
    public ITV itv;

    public OpenAndClose(ITV itv) {
        this.itv = itv;
    }

    @Override
    public void open() {
        this.itv.play();
    }
}


class ChengHong implements ITV {

    @Override
    public void play() {
        System.out.println("打开长虹电视");
    }
}
*/
//三通过setter方法传递
interface IOpenAndClose {
    public void open();

    //通过setter方法进行传递
    public void setter(ITV itv);
}

class OpenAndClose implements IOpenAndClose {
    private ITV itv;

    @Override
    public void open() {
        this.itv.play();
    }

    @Override
    public void setter(ITV itv) {
        this.itv = itv;
    }
}

interface ITV {
    public void play();
}

class ChengHong implements ITV {

    @Override
    public void play() {
        System.out.println("打开长虹电视");
    }
}

