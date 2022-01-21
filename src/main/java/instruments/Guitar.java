package instruments;

import shop.ShopSection;

public class Guitar extends Instrument{
    private GuitarType guitarType;
    private int strings;

    public Guitar(ShopSection section,
                  Category category,
                  String description,
                  GuitarType guitarType,
                  int strings,
                  double buyingPrice,
                  double sellingPrice) {
        super(section, description, buyingPrice, sellingPrice, category);
        this.guitarType = guitarType;
        this.strings = strings;
    }

    public instruments.GuitarType getGuitarType() {
        return guitarType;
    }

    public int getStrings() {
        return strings;
    }

    @Override
    public String play(String text) {
        return "Plays "+getGuitarType()+" guitar sound: " + text;
    }
}
