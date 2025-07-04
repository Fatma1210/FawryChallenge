package Product;

import java.util.HashMap;
import java.util.Map;

public abstract class Product {
    protected double price;
    protected  int quantity;
    protected int available = 100 ;
    protected static Map<Class<?>, Integer> soldOut = new HashMap<>();
    protected static Map<Class<?>, Integer> ret = new HashMap<>();
    public Product(){
        soldOut.put(getClass(), soldOut.getOrDefault(getClass(), 0) + this.quantity);
    }
    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
     public boolean isOutOfStock(){
         return available - soldOut.getOrDefault(getClass(), 0) <= 0;
     }
    public int returnProduct(int rr){
        int r = ret.put(getClass(),rr);
        quantity -= rr;
        return r;
    }
}
