package Seminar01.src.impl;

import Seminar01.src.Product;
import Seminar01.src.VendingMachine;

import java.util.List;

public class HotDrinkVM extends VendingMachine {
    private int temperature;

    public HotDrinkVM(List<Product> products, int temperature){
        super(products);
        this.temperature = temperature;
    }

    public HotDrinkVM(int temperature) {
        super();
        this.temperature = temperature;
    }

    @Override
    public void addProducts(List<Product> products) {
        this.products.addAll(products);
    }

    public int getTemperature(){
        return temperature;
    }

    public List<Product> getProducts(){
        return products;
    }
}
