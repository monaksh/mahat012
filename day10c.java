abstract class Appliances{
    public String  brand;
    abstract void turnOn();
    void Applicances(String brand){
        this.brand=brand;
    }
    void brand(){
        System.out.println("the brand is "+brand);
    }
}
class WashingMachine extends Appliances{
    void turnOn(){
        System.out.println("the washing machine is On");
    }
    void brand(){
        System.out.println("the brand of washing machine is LG");
    }
}
class Refrigerator extends Appliances{
    void turnOn(){
        System.out.println("the refrigerator is On");
    }
    void brand(){
        System.out.println("the brand of refrigerator is Samsung");
    }
}
public class day10c{
    public static void main(String[] args) {
        Appliances w = new WashingMachine();
        w.turnOn();
        w.brand();
        Appliances r = new Refrigerator();
        r.turnOn();
        r.brand();
    }
} 
