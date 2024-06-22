package Seminar01.src;

import java.util.ArrayList;
import java.util.List;

public abstract class VendingMachine {

    protected List<Product> products;

    public VendingMachine() {
        this.products = new ArrayList<>();
    }

    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    public abstract void addProducts(List<Product> products);

    public Product deleteProduct(String name) {

        for (Product product : products) {
            if (product.getName().equals(name)) {
                products.remove(product);
                return product;
            }
        }
        System.out.println("No such product: " + name);
        return null;
    }

    public void getProduct(String name, float volume, int temperature){
        System.out.println("Product: " + name + ", Volume: " + volume + " l., " + "Temperature: " + temperature);
    }

    public List<Product> getProducts() {
        return products;
    }
}