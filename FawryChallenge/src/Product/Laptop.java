package Product;
import java.util.HashMap;
import java.util.Map;
public class Laptop extends ElectronicDevices{
    Map<String, Double> typePrice = new HashMap<>();
    public Laptop(int quantity , String type) {
        setPrices() ;
        this.quantity = quantity;
        this.price = typePrice.getOrDefault(type, 0.0) * quantity;
        this.weight = 30000 ;
        this.unitOfMeasurement = "kg" ;

    }
    private void setPrices(){
        typePrice.put("hp", 60000.0);
        typePrice.put("DELL", 50000.0);
        typePrice.put("Apple", 200000.0);

    }
}
