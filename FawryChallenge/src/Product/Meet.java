package Product;

public class Meet extends Food{
    public Meet(int quantity) {
        this.quantity = quantity;
        this.price = 300 * quantity;
        this.weight = 1 ;
        this.expireDate = this.ManufactureDate.plusMonths(6) ;
        this.unitOfMeasurement = "kg" ;
    }
}
