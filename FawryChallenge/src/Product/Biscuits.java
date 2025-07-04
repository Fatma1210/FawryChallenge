package Product;

public class Biscuits extends Food{

    public Biscuits(int quantity) {
        this.price = 20 * quantity;
        this.weight = 250.0 ;
        this.expireDate = this.ManufactureDate.plusMonths(2) ;
        this.quantity = quantity;
    }
}
