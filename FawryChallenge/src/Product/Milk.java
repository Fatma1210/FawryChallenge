package Product;

public class Milk extends Food{
    public Milk(int quantity) {
        this.quantity = quantity;
        this.price = 45 * quantity;
        this.weight = 1 ;
        this.expireDate = this.ManufactureDate.plusDays(4) ;
        this.unitOfMeasurement = "kg" ;
    }
}
