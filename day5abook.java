public class day5aBook{

    String title;
    String authorName;
    int price;
    String publisher;

    public void checkDiscount(){
    if (price >1000){
        System.out.println("10 % OFF");
    }
        else{
          System.out.println("5 % OFF");
        }
    }
    
}
    public static void main( String[] args ){
        day5aBook book = new day5aBook();
        book.title ="harry potter and the half blood prince";
        book.authorName ="jk rowling";
        book.price =1200;
        book.publisher="Bloomsbury";
        book.checkDiscount();
    
    }
