package Product;

public class SunScrean extends SelfCare{
    public SunScrean(int quantity) {
        this.type = "Skin Care" ;
        this.quantity = quantity;
        this.price = 370 * quantity;
        this.weight = 300 ;
        this.expireDate = this.ManufactureDate.plusMonths(6) ;
    }
}
