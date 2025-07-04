package Product;

public class ChickenBreasts extends Food {
    public ChickenBreasts(int quantity) {
        this.quantity = quantity;
        this.price = 200 * quantity;
        this.weight = 1;
        this.expireDate = this.ManufactureDate.plusMonths(6);
        this.unitOfMeasurement = "kg" ;
    }
}
