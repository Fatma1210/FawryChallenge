package Product;

public class Cleanser extends SelfCare{
    public Cleanser(int quantity){
        this.type = "Skin Care" ;
        this.quantity = quantity;
        this.price = 250 * quantity;
        this.weight = 500 ;
        this.expireDate = this.ManufactureDate.plusMonths(6) ;
    }
}
