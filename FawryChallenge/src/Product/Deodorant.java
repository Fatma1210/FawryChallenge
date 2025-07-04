package Product;

public class Deodorant extends SelfCare {
    public Deodorant(int quantity) {
        this.type = "Body Care" ;
        this.quantity = quantity;
        this.price = 195 * quantity;
        this.weight = 200 ;
        this.expireDate = this.ManufactureDate.plusMonths(6) ;
    }
}
