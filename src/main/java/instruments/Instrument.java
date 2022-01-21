package instruments;

import behaviours.IPlay;
import shop.Item;
import shop.ShopSection;

public abstract class Instrument extends Item implements IPlay {

    private Category type;

    public Instrument(ShopSection section, String description, double buyingPrice, double sellingPrice, Category category) {
        super(section, description, buyingPrice, sellingPrice);
        this.type = category;
    }

    public Category getType() {
        return type;
    }

    @Override
    public String play(String text) {
        return "Instrument playing "+getDescription()+" sound";
    }

    public Category getCategory() {
        return this.type;
    }
}
