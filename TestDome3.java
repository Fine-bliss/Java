/*
* 定义的方法默认为public abstract
* 接口里面的成员变量属性默认为public static final
* 以后写的话尽量简洁->不用加上面所列内容
* 类和接口的关系：->是实现implements
* 一旦被实现 必须重写
* */

package com.bit;
interface IShape{
    void draw();
}
class Rect implements IShape{
    @Override
    public void draw() {
        System.out.println("♦");
    }
}
class Cycle implements IShape{
    @Override
    public void draw() {
        System.out.println("⭕");
    }
}
class Flower implements IShape{
    @Override
    public void draw() {
        System.out.println("❀");
    }
}
public class TestDome3 {
    public static void drawMap(IShape shape){

        shape.draw();
    }
    public static void main(String[] args) {
        IShape shape = new Rect();
        Cycle cycle = new Cycle();
        drawMap(shape);
        drawMap(cycle);
    }
}
