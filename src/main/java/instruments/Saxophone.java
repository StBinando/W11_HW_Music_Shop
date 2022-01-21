package instruments;

import shop.ShopSection;

public class Saxophone extends Instrument{
    public SaxType saxType;

    public Saxophone(ShopSection section,
                     Category category,
                     String description,
                     SaxType saxType,
                     double buyingPrice,
                     double sellingPrice
    ) {
        super(section, description, buyingPrice, sellingPrice, category);
        this.saxType = saxType;
    }

    public SaxType getSaxType() {
        return saxType;
    }

    @Override
    public String play(String text) {
        return "Plays "+getSaxType()+" sax sounds: " + text;
    }
}
