package accessories;

import org.junit.Before;
import org.junit.Test;
import shop.ShopSection;

import static org.junit.Assert.*;

public class GuitarStringTest {

    private GuitarString string;

    @Before
    public void before(){
        string = new GuitarString(
                ShopSection.ACCESSORIES,
                "Guitar string",
                Material.METAL,
                Note.B_2ND,
                5.00,
                7.00);
    }

    @Test
    public void hasSection(){
        assertEquals(ShopSection.ACCESSORIES, string.getSection());
    }
    @Test
    public void hasDescription(){
        assertEquals("Guitar string", string.getDescription());
    }

    @Test
    public void hasMaterial(){
        assertEquals(Material.METAL, string.getMaterial());
    }

    @Test
    public void hasNote() {
        assertEquals(Note.B_2ND, string.getNote());
    }

    @Test
    public void hasBuyingPrice() {
        assertEquals(5, string.getBuyingPrice(), 0);
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(7, string.getSellingPrice(), 0);
    }

    @Test
    public void hasMarkup(){
        assertEquals(2, string.getMarkup(), 0);
    }
}
