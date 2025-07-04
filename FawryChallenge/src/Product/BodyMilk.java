package Product;

public class BodyMilk extends SelfCare{
    public BodyMilk(int quantity) {
        super() ;
        this.type = "Body Care" ;
        this.quantity = quantity;
        this.price = 300 * quantity;
        this.weight = 200 ;
        this.expireDate = this.ManufactureDate.plusMonths(6) ;
    }
}
