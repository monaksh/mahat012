class Person{
    String name;
    int age;

    public Person( String name, int age){
        this.name=name;
        this.age=age;
    }
}
public class day6ab{
    public static void main(String[] args) {
        Person p1 = new Person("monaksh",20);
        Person p2 = new Person("rahul",99);
        System.out.println(p1.name);
        System.out.println(p1.age);
        System.out.println(p2.name);
        System.out.println(p2.age);

    }
}