package Product;
public class Cheese extends Food {
    public Cheese(int quantity) {
       this.price = 50 * quantity;
       this.weight = 250.0 ;
       this.expireDate = this.ManufactureDate.plusDays(10) ;
       this.quantity = quantity;
        this.unitOfMeasurement = "g" ;
    }

}
