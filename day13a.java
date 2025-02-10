public class day13a {
    public static void main(String[] args) {
        int[] numbers = {+--};
          int min = Integer.MAX_VALUE;
          for(int number : numbers){
            if(number < min){
                min = number;
            }
          }
          System.out.println("minimum number is: "+min);

          int max = Integer.MIN_VALUE;
          for(int number : numbers){
            if(number>max){
                max=number;
            }
          }
          System.out.println("maximum number is: "+max);

          int sum = 0;
          
          for(int number : numbers){
            sum = sum + number;
          }
          System.out.println("the sum of the numbers is: "+sum);

          int avg = (int)sum/numbers.length;
         System.out.println("average is: "+avg);
    }
}
