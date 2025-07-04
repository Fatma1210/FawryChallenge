package Product;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> products = new ArrayList<Product>();
    private double Weight = 50000 ;
    public void addProduct(Product product) {
        this.products.add(product);
    }
    public void removeProduct(Product product) {
        this.products.remove(product);
    }
    public double getWeight() {
        return Weight;
    }
    public List<Product> getProducts() {
        return this.products;
    }
}
