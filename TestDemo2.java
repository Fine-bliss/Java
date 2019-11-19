/*
* 包含抽象方法的类叫做抽象类
* 抽象类和普通类最大的区别 包含抽象方法
* 抽象类不能别实例化也就是不能new
* 抽象类存在的意义：肯定被继承
* 抽象类一旦被继承就要重写抽象方法
* 如果一个类继承了抽象类 如果不想重写抽象类的方法，那么当前类需要设计为抽象类->可以选择重写也可以不重写
* 提前检查代码的错误
* final
* */
abstract class Shape2{
    /*private void func(){
        System.out.println("func()");
    }*/
    public abstract void draw();//抽象方法
}
class Rect2 extends Shape2{
   @Override
    public void draw() {
        System.out.println("♦");
    }
}
/*class Rect3 extends Rect2 {
    @Override
    public void draw() {
        System.out.println("♦");
    }
}*/
class Cycle2 extends Shape2{
    @Override
    public void draw() {
        System.out.println("⭕");
    }
}
class Flower2 extends Shape2{
    @Override
    public void draw() {
        System.out.println("❀");
    }
}
public class TestDemo2 {
    public static void drawMap(Shape2 shape2){
        shape2.draw();
    }
    public static void main(String[] args) {
        Rect2 rect2 = new Rect2();
        Cycle2 cycle2 = new Cycle2();
        Flower2 flower2 = new Flower2();
        drawMap(rect2);
        drawMap(cycle2);
        drawMap(flower2);
    }
}
