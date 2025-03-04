package mahat012.day24;
import java.lang.Thread;

class A extends Threads {
    public void run(){
        System.out.println("Hello from Thread class");
    }    
}
public class day24b{
    public static void main(String[] args) {
        A obj = new A();
        Thread thread = new Thread();
        thread.start();
    }
}
