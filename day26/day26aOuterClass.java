public class day26aOuterClass{
    class InnerClass{
        public void displaymsg(){
             System.out.println("Hello,World");
        }
    }
    public static void main(String[] args) {
        day26aOuterClass.InnerClass inner = new  day26aOuterClass.InnerClass();
        inner.displaymsg();
    }
}