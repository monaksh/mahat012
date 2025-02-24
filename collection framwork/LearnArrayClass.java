import java.util.Arrays;

public class LearnArrayClass {
    public static void main(String[] args) {
        
        // int [] numbers = {1,2,3,4,5,6,7,8,9,10};
        // int index = Arrays.binarySearch(numbers,4);

        // System.out.println("the index of element 4 in the array is "+index);

        Integer [] numbers = {01,21,42,24,12,42,52,23,53,-2};
        Arrays.sort(numbers);
        
        Arrays.fill(numbers,12); //fill use to fill the same element in whole array

        for(int i : numbers){
            System.out.println(i+" ");
        }
    }
    
}
