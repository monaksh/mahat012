import java.util.*;

public class day15a {

         void vowels(String name){
             int count = 0;
             for(int i = 0; i< name.length(); i++){
                 char ch = name.charAt(i);
                 if ((ch == 'a' || ch == 'A') || (ch == 'e' || ch == 'E') || (ch == 'i' || ch == 'I') 
                 || (ch == 'o' || ch == 'O') || (ch == 'u' || ch == 'U'))
                 count ++;
             }
             System.out.println("Number of   vowels are: "+ count);
         }

         void countConsonants(String name){
            int count1 = 0;
            name = name.toUpperCase();
            for(int j = 0; j<name.length(); j++){
                char ch1 = name.charAt(j);
                if ((ch1 != 'a' || ch1 != 'A') || (ch1 != 'e' || ch1 != 'E') || (ch1 != 'i' || ch1 != 'I') 
                || (ch1 != 'o' || ch1 != 'O') || (ch1 != 'u' || ch1 != 'U')) 
                count1 ++;
            }
            System.out.println("The total number of consonant are: "+count1);
         }
         public static void main(String[] args) {
             day15a v = new day15a();
              Scanner sc = new Scanner(System.in);
                 System.out.println("enter a name: ");
                 String name = sc.next();
     
                 // Problem 1
                 System.out.println(name.toUpperCase());
     
                 //Problem 2
                 for(int i = name.length()-1; i >=0; i--){
                     System.out.println(name.charAt(i));
                 }
     
                 //Problem 3
                  v.vowels(name);
     
     
                 //Problem 4
                 String str, rev = "";
                 for(int i = name.length()-1; i>=0 ; i--){
                    rev = rev+name.charAt(i);
                 }
                 if(name.equalsIgnoreCase(rev)){
                    System.out.println("This is the palindrome");
                 }else{
                    System.out.println("This is not a palindrome");
                 }

                 //Problem 5
                 v.countConsonants(name);
        }        
    }
    

