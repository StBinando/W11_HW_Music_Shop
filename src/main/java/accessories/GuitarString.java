package accessories;

import shop.Item;
import shop.ShopSection;

public class GuitarString extends Item {
    private Material material;
    private Note note;

    public GuitarString(ShopSection section,
                        String description,
                        Material material,
                        Note note,
                        double buyingPrice,
                        double sellingPrice) {
        super(section, description, buyingPrice, sellingPrice);
        this.material = material;
        this.note = note;
    }

    public Material getMaterial() {
        return material;
    }

    public Note getNote() {
        return note;
    }

    @Override
    public void printData() {
        System.out.println(
                "Product: "+ this.getClass().getSimpleName() +
                        " - Section: "+ this.getSection()
        );
        System.out.println(
                this.getDescription() +
                        " - " +this.getNote() +
                        " - " + this.getMaterial() +
                        " - Price: " + this.getSellingPrice()
        );
        System.out.println("----------------------------------");
    }
}
