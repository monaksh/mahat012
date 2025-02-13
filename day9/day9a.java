import java.io.StringBufferInputStream;

class Employee{
    String name;
    int salary;

    public Employee(String name,int salary){
        this.name=name;
        this.salary=salary;
    }
}
class Manager extends Employee{
    String department;

    public Manager(String name, int salary,String department) {
            super(name, salary);
            this.department=department;
        }
        void display(){
            System.out.println("name: "+name);
            System.out.println("salary: "+salary);
            System.out.println("department: "+department);
        }
}
public class day9a{
    public static void main(String[] args) {
        Manager m = new Manager("rahul",5000,"IT");
        m.display();
    }
}