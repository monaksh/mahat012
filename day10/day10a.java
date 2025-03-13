import mahat012.day26.shapes;

abstract class shapes{
    abstract void area();
}
class rectangle extends shapes{
    int l;
    int b;

    public rectangle(int l, int b){
        this.l=l;
        this.b=b;
    }
    void area(){
        System.out.println("area of rectangle is: "+(l*b));
    }
}
class circle extends shapes{
    double r;

    public circle(double r){
        this.r=r;
    }
    void area(){
       System.out.println("area of circle is: "+(3.14*r*r));
    }
    }
    public class day10a{
        public static void main(String[] args) {
            rectangle r1 = new rectangle(20,30);
            circle c1 = new circle(5);       
            r1.area();
            c1.area();
    }
}