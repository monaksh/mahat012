class Shapes{
    void draw(){
        System.out.println("drawing a shape");
    }
}
class Circle extends Shapes{
    //overriding 1st
    void draw(){
        System.out.println("drawing a circle");
    }
}
class Rectangle extends Circle{
    //overriding 2nd
    void draw(){
        System.out.println("drawing a rectangle");
    }
} 
public class Day9d{
    public static void main(String[] args) {
        Shapes s = new Shapes();
        s.draw();
        Circle c = new Circle();
        c.draw();
        Rectangle r = new Rectangle();
        r.draw();


    }
}

