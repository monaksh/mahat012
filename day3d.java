public class day3d{
    puublic static void main(String[]args){
        int a=0;
        int b=1;
        for (int i=0;i<10;i++){
            System.out.println(a+i);
            b=a+b;
            a=b-a;
        }
    }
}