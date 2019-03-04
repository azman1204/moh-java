package chap4;

/*
discuss on "static" keyword
- apply to variable and method
- shared
*/
public class Book {
    static int bil = 0; // shared by all obj and own by class
    String title;
    
    // own by class Buku bukan obj buku
    public static void cetak() {
        System.out.println("Jumlah buku = " + Book.bil);
    }
    
    public void info() {
        
    }
    
    Book() {
        Book.bil = Book.bil + 1;
        System.out.println("Bil buku = " + Book.bil);
    }
    
    public static void main(String[] args) {
        Book b1 = new Book(); // obj
        Book b2 = new Book(); // obj
        //Book.cetak();
        cetak();
        //info(); // error
    }
}
