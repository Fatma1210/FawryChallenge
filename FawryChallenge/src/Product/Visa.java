package Product;

public class Visa implements PayMethod {
    private String id;
    private double balance = 10000; // it should change
    public Visa(String idNumber) {
        this.id = idNumber;
    }

    public String getId() {
        return id;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double paid){
        balance -= paid ;
    }
}
