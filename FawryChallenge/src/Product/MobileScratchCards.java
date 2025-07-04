package Product;

import java.util.HashMap;
import java.util.Map;

public class MobileScratchCards extends NonShippableProduct{
    Map<String, Double> typePrice = new HashMap<>();
    public MobileScratchCards(int quantity , String deliveryMethod , String type) {
        setPrices() ;
        this.quantity = quantity;
        this.deliveryMethod = deliveryMethod;
        this.price = typePrice.getOrDefault(type, 0.0) * quantity;
    }
    private void setPrices(){
        typePrice.put("Vodafone", 50.0);
        typePrice.put("Etisalat", 60.0);
        typePrice.put("We", 30.0);

    }
}
