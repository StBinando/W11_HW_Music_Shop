package instruments;

import org.junit.Before;
import org.junit.Test;
import shop.ShopSection;

import static org.junit.Assert.*;

public class GuitarTest {

    private Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar(
                ShopSection.INSTRUMENTS,
                Category.STRINGS,
                "Stratocaster",
                GuitarType.ELECTRIC,
                6,
                230,
                370
        );
    }

    @Test
    public void hasSection(){
        assertEquals(ShopSection.INSTRUMENTS, guitar.getSection());
    }
    @Test
    public void hasDescription(){
        assertEquals("Stratocaster", guitar.getDescription());
    }

    @Test
    public void hasCategory(){
        assertEquals(Category.STRINGS, guitar.getCategory());
    }

    @Test
    public void hasGuitarType() {
        assertEquals(GuitarType.ELECTRIC, guitar.getGuitarType());
    }

    @Test
    public void getNoStrings(){
        assertEquals(6, guitar.getStrings());
    }

    @Test
    public void hasBuyingPrice() {
        assertEquals(230, guitar.getBuyingPrice(), 0);
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(370, guitar.getSellingPrice(), 0);
    }

    @Test
    public void hasMarkup(){
        assertEquals(140, guitar.getMarkup(), 0);
    }

    @Test
    public void canPlay(){
        System.out.println(guitar.play("Smoke on the water"));
        assertEquals("Plays ELECTRIC guitar sound: Smoke on the water", guitar.play("Smoke on the water"));
    }

    @Test
    public void canPrintData(){
        guitar.printData();
    }
}
