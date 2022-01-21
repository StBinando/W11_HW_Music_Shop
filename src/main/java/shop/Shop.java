package shop;

import behaviours.ISell;

import java.util.ArrayList;

public class Shop {
    private String name;
    private ArrayList<ISell> stock = new ArrayList<>();

    public Shop(String name, ArrayList<ISell> stock) {
        this.name = name;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public void addItem(ISell item){
        this.stock.add(item);
    }
}
