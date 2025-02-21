//  Stack = this is the collection of array works on the principle of "LIFO" (last in first out)
import java.util.Stack;
public class LearnStack{
    public static void main(String[] args) {
        Stack<String>animal=new Stack<>();
        animal.push("Lion");
        animal.push("Dog");
        animal.push("Horse");
        animal.push("Cat");

        System.out.println("Stack: "+animal );
        System.out.println(animal.peek()); // top element in the stack "cat"
        animal.pop(); // remove top element inn the stack, now top element is "Horse"
        System.out.println("stack: "+animal);

    }
}