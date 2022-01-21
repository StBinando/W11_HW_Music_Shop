package accessories;

import shop.Item;
import shop.ShopSection;

public class MusicSheet extends Item {
    private Genre genre;

    public MusicSheet(ShopSection section,
                      Genre genre,
                      String description,
                      double buyingPrice,
                      double sellingPrice) {
        super(section, description, buyingPrice, sellingPrice);
        this.genre = genre;
    }

    public Genre getGenre() {
        return genre;
    }

    @Override
    public void printData() {
        System.out.println(
                "Product: "+ this.getClass().getSimpleName() +
                        " - Section: "+ this.getSection()
        );
        System.out.println(
                this.getDescription() +
                        " - " + this.getGenre() +
                        " - Price: " + this.getSellingPrice()
        );
        System.out.println("----------------------------------");
    }
}
