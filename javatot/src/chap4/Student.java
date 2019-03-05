package chap4;
// pass variable by val vs by reference
// primitive + String = passing by value
// object always passing by reference
public class Student {
    void setName(String name) {
        name = name + " bin zakaria";
        System.out.println(name);
    }
    
    void changeBookTitle(Book b) {
        b.title = "Java Advanced";
    }
    
    public static void main(String[] args) {
        Student s1 = new Student();
        String nama = "azman";
        // ini passing var by value
        s1.setName(nama);
        System.out.println(nama);
        
        // passing var by reference
        Book b1 = new Book();
        b1.title = "Java for Beginner";
        System.out.println(b1.title);
        s1.changeBookTitle(b1);
        System.out.println(b1.title);
    }
}
