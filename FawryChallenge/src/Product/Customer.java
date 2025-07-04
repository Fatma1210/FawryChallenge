package Product;

import java.util.List;

public class Customer {
    private String name;
    private PayMethod payMethod;
    private String address;
    private String mobileNumber;
    private Cart cart;
    public Customer(String name, PayMethod payMethod, String address, String mobileNumber) {
        this.name = name;
        this.payMethod = payMethod;
        this.address = address;
        this.mobileNumber = mobileNumber;
        this.cart = new Cart();
    }
    public Customer(String name, PayMethod payMethod, String mobileNumber) {
        this.name = name;
        this.payMethod = payMethod;
        this.mobileNumber = mobileNumber;
        this.cart = new Cart();
    }

    public String getAddress() {
        return address;
    }

    public Cart getCart() {
        return cart;
    }
    public String getMobileNumber() {
        return mobileNumber;
    }
    public PayMethod getPayMethod() {
        return payMethod;
    }
    public String getName() {
        return name;
    }

}

