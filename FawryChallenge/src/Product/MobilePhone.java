package Product;

import java.util.HashMap;
import java.util.Map;

public class MobilePhone extends ElectronicDevices {
    Map<String, Double> typePrice = new HashMap<>();

    public MobilePhone(int quantity, String type) {
        setPrices() ;
        this.quantity = quantity;
        this.price = typePrice.getOrDefault(type, 0.0) * quantity;
        this.weight = 250;
        this.unitOfMeasurement = "g" ;
    }

    private void setPrices() {
        typePrice.put("Samsung", 25000.0);
        typePrice.put("Oppo", 15000.0);
        typePrice.put("Apple", 40000.0);

    }
}
