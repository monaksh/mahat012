class WrapperExample {
        void Wrapper() {
            int obj1 = 10;
            Integer a = obj1;
            System.out.println("Autoboxed Integer: " + obj1);
    
            Integer obj2 = 20;
            int b = obj2;
            System.out.println("Unboxed int: " + b);
    
            Integer sum = obj1 + obj2;
            Integer product = obj1 * obj2;
            System.out.println("Sum: " + sum);
            System.out.println("Product: " + product);
        }
    }
    
    public class day16b {
        public static void main(String[] args) {
            WrapperExample w = new WrapperExample();
            w.Wrapper();
    
            double x = 5.5;
            Double objX = x; 
            double y = objX; 
            System.out.println("Double Autoboxed: " + objX);
            System.out.println("Double Unboxed: " + y);
              
            char ch = 'A';
            Character objCh = ch; 
            char ch2 = objCh; 
            System.out.println("Character Autoboxed: " + objCh);
            System.out.println("Character Unboxed: " + ch2);
        }
    }

  