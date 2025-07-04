package Product;

public class InstaPay implements PayMethod{
    private String id ;
    private double balance = 10000;
    public String getId() {
        return id;
    }

    public InstaPay(String userName) {
        this.id = userName;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double paid){
        balance -= paid ;
    }
}
