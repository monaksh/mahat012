class person{
    String name;
    int age;

    // default constructor
    public person(){
        name = "unknown";
        age = 0;
    }
    
    // custom constructor
    public person(String name,int age){
        this.name=name;
        this.age=age;
    }
}
class Student extends person{
    int StudentId;
    public Student(String name,int age,int StudentId){
        super(name,age);
        this.StudentId=StudentId;
    }
    void display(){
        System.out.println("name: "+name);
        System.out.println("age: "+age);
        System.out.println("StudentId: "+StudentId);
    }
}
public class day9B{
    public static void main(String[] args) {
        Student s1 = new Student("RAHUL", 20, 12345);
        s1.diplay();
    }
}