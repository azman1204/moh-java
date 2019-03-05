package chap6;
public class Employee implements Payable {
    @Override
    public boolean increasePay(int percent) {
        return true;
    }
    
    @Override
    public void cetak() {}
}
