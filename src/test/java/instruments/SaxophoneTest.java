package instruments;

import org.junit.Before;
import org.junit.Test;
import shop.ShopSection;

import static org.junit.Assert.*;

public class SaxophoneTest {

    private Saxophone sax;

    @Before
    public void before(){
        sax = new Saxophone(
                ShopSection.INSTRUMENTS,
                Category.BRASSES,
                "Yamaha",
                SaxType.TENOR,
                190,
                240
        );
    }

    @Test
    public void hasSection(){
        assertEquals(ShopSection.INSTRUMENTS, sax.getSection());
    }
    @Test
    public void hasDescription(){
        assertEquals("Yamaha", sax.getDescription());
    }

    @Test
    public void hasCategory(){
        assertEquals(Category.BRASSES, sax.getCategory());
    }

    @Test
    public void hasSaxType() {
        assertEquals(SaxType.TENOR, sax.getSaxType());
    }


    @Test
    public void hasBuyingPrice() {
        assertEquals(190, sax.getBuyingPrice(), 0);
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(240, sax.getSellingPrice(), 0);
    }

    @Test
    public void hasMarkup(){
        assertEquals(50, sax.getMarkup(), 0);
    }

    @Test
    public void canPlay(){
        System.out.println(sax.play("Young Americans"));
//        assertEquals("Plays TENOR sax sounds: Young Americans", sax.play("Smoke on the water"));
    }
}
