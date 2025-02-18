public class  day16c {  

static <T> void printArray (T[] arr )  {
for ( T e  : arr )    {
System.out.print(e+" "); 
}  
System.out.println();
}
 
public static void main ( String[] args) { 
// Integer arr
 Integer[ ] intArr  = { 1, 2 , 3, 4, 5} ;
printArray(intArr); 

// String arr
String [] strArr= {"hello" , "world" ,"java"}; 
printArray( strArr ) ;

// Double arr
Double []dblArr= {1.1,2.2,3.3}; 
printArray( dblArr );

GenericContainer <Integer> intContainer=new GenericContainer<>();
intContainer.setValue(10);
System.out.println(intContainer.getValue());

GenericContainer <String> strContainer=new GenericContainer<>();
strContainer.setValue("hi");
System.out.println(strContainer.getValue());

GenericContainer <Double> dblContainer=new GenericContainer<>();
dblContainer.setValue(2.5);
System.out.println(dblContainer.getValue());
}
}

class GenericContainer<T> {
    private   T value ; 
    
    void setValue ( T value ){
         this.value=value; 
        }
    
    T getValue ( ){
         return value ;
        } 
  }

