package instruments;

import shop.ShopSection;

import java.util.Locale;

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

    @Override
    public void printData() {
        System.out.println(
                "Product: "+ this.getClass().getSimpleName() +
                " - Section: "+ this.getSection()
        );
        System.out.println(
                this.getDescription() +
                        " - " +this.getGuitarType() +
                        " - " + this.getStrings() + " strings"+
                        " - Price: " + this.getSellingPrice()
        );
        System.out.println("----------------------------------");
    }
}
