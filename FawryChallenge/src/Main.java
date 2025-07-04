import Product.*;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    static boolean isShippable = false;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your details to proceed with your order:");
        System.out.print("- Name:");
        String name = scanner.nextLine();
        System.out.print("- Address:");
        String address = scanner.nextLine();
        System.out.print("- Phone Number:");
        String phoneNumber = scanner.nextLine();
        PayMethod payMethod = null;

        System.out.print("- Payment Method (InstaPay / VodafoneCash / Visa)");
        String method = scanner.nextLine().trim().toLowerCase();
        System.out.print("Your Payment card id :");
        String id = scanner.nextLine().trim();

        switch (method) {
            case "instapay":
                payMethod = new InstaPay(id);
                break;
            case "vodafonecash":
                payMethod = new VodafoneCash(id);
                break;
            case "visa":
                payMethod = new Visa(id);
                break;
        }

        Customer customer = new Customer(name, (PayMethod) payMethod, address, phoneNumber);
        // assume that user will click on these products
        Product cheese = new Cheese(2);
        customer.getCart().addProduct(cheese) ;
        Product meet = new Meet(3);
        customer.getCart().addProduct(meet) ;
        Product chicken = new ChickenBreasts(2) ;
        customer.getCart().addProduct(chicken) ;
        Product milk = new Milk(2);
        customer.getCart().addProduct(milk) ;
        Product bodyMilk = new BodyMilk(1);
        customer.getCart().addProduct(bodyMilk) ;
        Product deodorant = new Deodorant(2);
        customer.getCart().addProduct(deodorant) ;
        Product mobileScratchCards = new MobileScratchCards(2 , "Phone Number" , "We") ;
        customer.getCart().addProduct(mobileScratchCards) ;
        for(Product product : customer.getCart().getProducts()) {
            if(product instanceof ShippableProduct) {
                isShippable = true ;
            }
            checkCornerCases(product, customer) ;
        }
       ShippingService shippingService = new ShippingService(customer);
        double total = shippingService.calculateShippingCost(isShippable) ;
        double totalW = shippingService.getTotalWeight() ;
        if(total > customer.getPayMethod().getBalance()){
            System.out.println("Your payment method is too big. Please try again.");
            // then the customer should choose items to remove from cart
        }
        if(totalW > customer.getCart().getWeight()){
            System.out.println("Sorry, the quantity you are trying to purchase exceeds your cart’s capacity. Please reduce the quantity or complete your current order first.");
            // then the customer should choose items to remove from cart
        }
        shippingService.printReceipt(isShippable) ;

    }

    public static void checkCornerCases(Product product , Customer customer) {
        String productName = product.getClass().getSimpleName();

        // Check stock
        if (product.isOutOfStock()) {
            System.err.println("Error: " + productName + " is out of stock.");
        }

        // Check expiry if applicable
        if (product instanceof ExpirableProduct) {
            ExpirableProduct expirableProduct = (ExpirableProduct) product;
            LocalDate expireDate = expirableProduct.getExpireDate();
            LocalDate today = LocalDate.now();
            if (expireDate != null && expireDate.isBefore(today)) {
                System.err.println("Error: " + productName + " is expired (Expiry Date: " + expireDate + ").");
            }
        }
    }

}
