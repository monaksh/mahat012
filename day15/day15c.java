public class day15c {
    public static void main(String[] args) {
        String name = "monaksh Bhatngar ";
        System.out.println(name);

        //Problem 1
        System.out.println(name.indexOf("a"));

        //Problem 2
        System.out.println(name.substring(8, 16));

        //Problem 3
        System.out.println(name.replace("monaksh", "Rahul"));

        //Problem 4
        String[] names = name.split(" ");
        for (String word : names) {
            System.out.println(word);
        }
    }
    
}
