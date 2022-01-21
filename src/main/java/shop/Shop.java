package shop;

import behaviours.ISell;
import instruments.Guitar;

import java.util.ArrayList;

public class Shop {
    private String name;
    private ArrayList<ISell> stock = new ArrayList<>();
    private double totPotentialProfit;

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

    public void removeItem(ISell item) {
        this.stock.remove(item);
    }

    public double calcTotPotentialProfit() {
        totPotentialProfit = 0;
        for (ISell i: stock){
            totPotentialProfit += i.getMarkup();
        }
        return totPotentialProfit;
    }
}
