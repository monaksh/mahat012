public class Vehicle{
    private int speed;
    private String company;

    
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }
}
    class Car extends Vehicle {

    }

    class Bike extends Vehicle {

    }
    public class Main{
    public static void main(String[]args){
        Car car= new Car();
        System.out.println(car.getSpeed());
        Bike bike = new Bike();
        System.out.println(bike.getSpeed());

      }

  }

