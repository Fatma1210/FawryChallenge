package Product;

public class VodafoneCash implements PayMethod{
    private String id ;
    private double balance = 500;
    public VodafoneCash(String mobileNumber) {
        this.id = mobileNumber;
    }

    public String getId() {
        return id;
    }

    @Override
    public double getBalance() {
        return balance;
    }
    public void setBalance(double paid){
        balance -= paid ;
    }
}
