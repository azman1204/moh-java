package chap4;
/*
"this" utk set/get a property OR
call/run a method
i.e this.jumlah = 100;
*/
public class LoanCalculator extends Calculator {
    int jumlah = 0; // variable / property
    // final = val ini tak boleh tukar
    final String tajuk = "LOAN CALCULATOR";
    /*public void info() {
        
    }
    ini tak boleh, sebab parent info() dah final
    */
    
    // ini override cetak() dalam parent
    @Override
    public void cetak() {
        //this.tajuk = "abc"; error, dah final tak boleh tukar
        System.out.println("cetak LoanCalculator");
    }
    
    
    // ctrl + space = show auto suggestion
    // psvm tab = auto gen pub static void main()
    public static void main(String[] args) {
        LoanCalculator cal = new LoanCalculator();
        cal.cetak(); 
        LoanCalculator cal2 = new LoanCalculator(1); // shift + ctrl + arrow down
    }
    
    // constructor - tiada return dan nama mesti sama dgn class
    // dlm satu class boleh ada multiple constructor
    // auto run bila create new obj
    // guna biasanya utk initialize variable
    // mesti public
    public LoanCalculator() {
        super(); // run parent constructor
        System.out.println("i'm in constructor");
    }
    
    // constructor
    public LoanCalculator(int amount) {
        this.jumlah = amount; // initialize value awalan
        System.out.println("i'm in constructor 2");
    }
    
    // mesti return int, void - no return
    private int calcLoanPayment(int amount, int numberOfMonths, String state) {
        // Your code goes here
        return 0;
    }
    // shift + alt + f = auto arrange code
    // method overloading
    private int calcLoanPayment(int amount) {
        return 0;
    }
}
