public class day15p3 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Monaksh");
        sb.append(" Bhatnagar");
        System.out.println(sb);
        // sb.deleteCharAt(2);
        // System.out.println(sb);
        sb.insert(0,"My Name is ");
        System.out.println(sb);
        System.out.println(sb.capacity());
        System.out.println(sb.length());
    }
    
}
