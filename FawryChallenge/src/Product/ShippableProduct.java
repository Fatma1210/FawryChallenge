package Product;

public abstract class ShippableProduct extends Product {
   protected double weight;
    protected  String unitOfMeasurement;
    public ShippableProduct(){
        super() ;
    }
    public double getWeight(){
       return weight;
   }
    public String getUnitOfMeasurement() {
        return unitOfMeasurement;
    }
}
