class Student{
    int id;
    String name;
    int marks;

    public Student(int id,String name,int marks){
        this.id=id;
        this.name=name;
        this.marks=marks;
    }

    void display(){
        System.out.println("id: "+id,"name: "+name,"marks: "+marks);
    }
}
public class StudentDetails {
    public static void day13b(String[] args) {
        Student[] students = {
        new Student(102, "Priya", 72),
        new Student(103, "Amit", 78),
        new Student(104, "Neha", 65),
        new Student(105, "Vikram", 90)
        };

        System.out.println("Students with marks greater than 75:");
        for (Student s : students) {
            if (s.marks > 75) {
                s.display();
            }
        }
    }
}
