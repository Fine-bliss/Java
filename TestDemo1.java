import java.util.concurrent.Callable;

class Shape{
    public void draw(){

    }
}
class Rect extends Shape{
    @Override
    public void draw() {
        super.draw();
        System.out.println("♦");
    }
}
class Cycle extends Shape{
    @Override
    public void draw() {
        super.draw();
        System.out.println("⭕");
    }
}
class Flower extends Shape{
    @Override
    public void draw() {
        super.draw();
        System.out.println("❀");
    }
}
public class TestDemo {
    public static void drawMap(Shape shape){

        shape.draw();
    }
    public static void main(String[] args) {
      /* Rect rect = new Rect();
       Cycle cycle = new Cycle();
       Flower flower = new Flower();
       drawMap(rect);
       drawMap(cycle);
       drawMap(flower);*/
      Shape shape1 = new Rect();
      Shape shape2 = new Cycle();
      Shape shape3 = new Flower();
      drawMap(shape1);
      drawMap(shape2);
      drawMap(shape3);
    }
}
