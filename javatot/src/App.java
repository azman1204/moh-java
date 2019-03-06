// main() berada satu class kusus yg akan
// guna class-class yg lain

public class App {
    // entry point method
    public static void main(String[] args) {
        // create object
        Car ferrari = new Car();
        ferrari.numOfDoors = 2;
        ferrari.color = "red"; // mesti "" x boleh ''
        // '' hanya utk char shj
        ferrari.print();
        ferrari.startEngine();
        Car porsche = new Car();
        // test
    }
}
