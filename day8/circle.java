package shapes;

public class circle {
    double R;
    double Pi = 3.14;
    double A;

    public circle(double R){
        this.R = R;
    }
    void calculateArea(){
        A = Pi * R * R ;
    }
    void displayArea(){
        System.out.println("the area of the circle is: "+A);
    }
    
}
