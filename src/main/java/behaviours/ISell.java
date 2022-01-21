package behaviours;

import shop.ShopSection;

public interface ISell {
    public ShopSection getSection();
    public String getDescription();
    public double getBuyingPrice();
    public double getSellingPrice();
    public double getMarkup();
    public void sell();
    public void printData();
}
