package mahat012.day26;

interface shapes {
    void draw();
}
public class day26cAnonymousClass{
    public static void main(String[] args) {
        shapes r1 = new shapes(){
            public void draw(){
                System.out.println("Draw a rectangle");
            }
        };
        shapes c1 = new shapes() {
            public void draw(){
                System.out.println("Draw a circle");
            }
        };
        r1.draw();
        c1.draw();
    }
}