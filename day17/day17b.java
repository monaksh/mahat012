package mahat012.day17;

public class day17b{
    int age;

    public static void ValideAge(int age) throws IllegalArgumentException{
        if(age < 18){
            throw new IllegalArgumentException();
        }else{
            System.out.println("Valid Age");
        }      
    }
    public static void main(String[] args) {
        int [] ageArr = {15,18,20};
        for(int age : ageArr){
            try{
                System.out.println("age");
            }catch(IllegalArgumentException e){
                System.out.println("Exception found");
            }finally{
                System.out.println("Operation completed");
            }
        }
    }
}