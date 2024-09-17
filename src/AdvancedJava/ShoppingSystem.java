package AdvancedJava;

import java.util.ArrayList;
import java.util.List;

public class ShoppingSystem {
    public static void main(String[] args) {
        Product iphone = new Product("iPhone", 5000, 7);
        Product samsung = new Product("Samsung", 5000, 5);
        Product googlePixels = new Product("GooglePixels", 9000, 5);
        Product macBook = new Product("MacBook", 1000000, 10);

        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addToCart(iphone, 20);
        shoppingCart.addToCart(samsung, 20);
        shoppingCart.addToCart(googlePixels, 20);
        shoppingCart.addToCart(macBook, 20);

        shoppingCart.viewCart();
        double total = shoppingCart.calculateTotal();
        System.out.println("Total is " + total);

;
    }
}

class Product {
    final private String name;
    final private double price;
    final private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void updateStock(int quantity) {
       quantity += this.quantity;
    }

    public String getDetails() {
        return this.name + " " + this.price + " " + " ";
    }
}

class CartItem {
    private Product product;
    private int quantity;

    public CartItem (Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return this.quantity * this.product.getPrice();
    }

    public String getCartItemDetails() {
        return this.product.getName() + " " + this.product.getPrice() + " " + this.quantity + " " + this.getTotalPrice();
    }

}

class ShoppingCart {
    final private List<CartItem> cartItems = new ArrayList<CartItem>();

    public void addToCart(Product product, int quantity) {
        cartItems.add(new CartItem(product, quantity));
    }

    public void viewCart() {
        for (CartItem cartItem : cartItems) {
            System.out.println(cartItem.getCartItemDetails());
            System.out.println(cartItem.getTotalPrice());
        }
    }

    public double calculateTotal() {
        double totalPrice = 0.00;
        for (CartItem cartItem : cartItems) {
            totalPrice += cartItem.getTotalPrice();
        }

        return totalPrice;
    }

//    public void removeProduct(Product product) {
//        for (CartItem cartItem : cartItems) {
//            if (cartItem.)
//        }
//     }
}