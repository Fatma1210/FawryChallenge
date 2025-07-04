package Product;

public class ShippingService {
    private Customer customer;
    double totalPrice;
    double totalWeight ;
    public ShippingService(Customer customer) {
        this.customer = customer;
    }
    public double getTotalWeight() {
        return totalWeight;
    }
    public double calculateShippingCost(boolean isShppable) {
        for (Product p : customer.getCart().getProducts()) {
            totalPrice += p.getPrice();
            if (p instanceof ShippableProduct) {
                ShippableProduct sp = (ShippableProduct) p;
                double w = sp.getQuantity() * sp.getWeight();
                if (sp.getUnitOfMeasurement() == "kg") {
                    totalWeight += sp.getWeight() * 1000;
                } else {
                    totalWeight += sp.getWeight();
                }
            }
        }
        if(isShppable) totalPrice += 30 ;
        return totalPrice;
    }

    public void printReceipt(boolean isShippable) {
        String payMethod = customer.getPayMethod().getClass().getSimpleName();
        System.out.println("Name: " + customer.getName());
        System.out.println("Mobile Number: " + customer.getMobileNumber());
        System.out.println("Pay Method: " + payMethod);
        System.out.println("id: " + customer.getPayMethod().getId());
        if(isShippable) {
            System.out.println("Address: " + customer.getAddress());
        }
        System.out.println("** Shipment notice **");
        for (Product p : customer.getCart().getProducts()) {
            System.out.print(p.getQuantity() + "x  " + p.getClass().getSimpleName()
                    + "  ");
            if (p instanceof ShippableProduct) {
                ShippableProduct sp = (ShippableProduct) p;
                double w = sp.getQuantity()* sp.getWeight() ;
                if(w >= 1000){
                    System.out.println((sp.getQuantity()* sp.getWeight()) / 1000 + "kg");
                }
               else System.out.println(sp.getQuantity()* sp.getWeight() + sp.getUnitOfMeasurement());
            } else {
                System.out.println();
            }
        }
        System.out.println("Total package weight: " + totalWeight + "kg");
        System.out.println("** Checkout receipt **");
        for (Product p : customer.getCart().getProducts()) {
            System.out.println(p.getQuantity() + "x  " + p.getClass().getSimpleName()
                    + "    " + p.getPrice());
        }
        System.out.println("---------------------------------");
        System.out.println("Subtotal : " + totalPrice);
       if(isShippable) System.out.println("Shipping : 30");// should change by distance -> but it is for simplicity
        System.out.println("Amount: " + totalPrice);
    }
}
