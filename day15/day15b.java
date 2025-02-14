public class day15b {
    public static void main(String[] args) {

        //immutable string
        String immutableString = "monaksh";
        immutableString = immutableString + " bhatnagar";
        System.out.println(immutableString);

        //mutable string
        StringBuilder mutableString = new StringBuilder("monaksh");
        mutableString.append(" bhatnagar");
        System.out.println(mutableString);  
    }
    
}
