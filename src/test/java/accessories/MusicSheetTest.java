package accessories;

import org.junit.Before;
import org.junit.Test;
import shop.ShopSection;

import static org.junit.Assert.*;

public class MusicSheetTest {

    private MusicSheet sheet;

    @Before
    public void before(){
        sheet = new MusicSheet(
                ShopSection.ACCESSORIES,
                Genre.BLUES,
                "Famous blues song",
                10,
                15);
    }

    @Test
    public void hasSection(){
        assertEquals(ShopSection.ACCESSORIES, sheet.getSection());
    }
    @Test
    public void hasDescription(){
        assertEquals("Famous blues song", sheet.getDescription());
    }

    @Test
    public void hasGenre(){
        assertEquals(Genre.BLUES, sheet.getGenre());
    }


    @Test
    public void hasBuyingPrice() {
        assertEquals(10, sheet.getBuyingPrice(), 0);
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(15, sheet.getSellingPrice(), 0);
    }

    @Test
    public void hasMarkup(){
        assertEquals(5, sheet.getMarkup(), 0);
    }
}
