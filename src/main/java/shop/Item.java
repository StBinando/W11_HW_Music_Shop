package shop;

import behaviours.ISell;

public abstract class Item implements ISell {
    private ShopSection section;
    private String description;
    private double buyingPrice;
    private double sellingPrice;

    public Item(ShopSection section,
                String description,
                double buyingPrice,
                double sellingPrice) {
        this.section = section;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
        this.description = description;
    }

    public ShopSection getSection(){
        return this.section;
    };
    public String getDescription(){
        return this.description;
    };
    public double getBuyingPrice(){
        return this.buyingPrice;
    };
    public double getSellingPrice(){
        return this.sellingPrice;
    };
    public double getMarkup(){
        return this.getSellingPrice()-this.getBuyingPrice();
    };
    public void sell(){

    };
}
