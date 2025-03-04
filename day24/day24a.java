package mahat012.day24;
class A implements Runnable {

    public void run(){
        System.out.println("Hello from Runnable thread");
    }    
}
public class day24a{
    public static void main(String[] args) {
        A obj = new A();
        Thread thread = new Thread(obj);
        thread.start();

    }
}