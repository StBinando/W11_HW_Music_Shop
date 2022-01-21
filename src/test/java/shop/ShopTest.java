package shop;

import accessories.*;
import behaviours.ISell;
import instruments.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    private Shop shop;
    private ArrayList<ISell> stock = new ArrayList<>();
    private Guitar guitar;
    private Saxophone sax;
    private GuitarString string;
    private MusicSheet sheet;

    @Before
    public void before() {
        guitar = new Guitar(
                ShopSection.INSTRUMENTS,
                Category.STRINGS,
                "Stratocaster",
                GuitarType.ELECTRIC,
                6,
                230,
                370);
        sheet = new MusicSheet(
                ShopSection.ACCESSORIES,
                Genre.BLUES,
                "Shake a Tail Feather",
                10,
                15);
        sax = new Saxophone(
                ShopSection.INSTRUMENTS,
                Category.BRASSES,
                "Yamaha",
                SaxType.TENOR,
                190,
                240);
        string = new GuitarString(
                ShopSection.ACCESSORIES,
                "D'Addario",
                Material.METAL,
                Note.B_2ND,
                5.00,
                7.00);
        shop = new Shop("Ray's Music Exchange",stock);
    }

    @Test
    public void shopHasName(){
        assertEquals("Ray's Music Exchange", shop.getName());
    }

    @Test
    public void shopStockStartsEmpty(){
        assertEquals(0, shop.getStock().size());
    }

    @Test
    public void shopCanAddItemToStock(){
        shop.addItem(guitar);
        assertEquals(1, shop.getStock().size());
    }

    @Test
    public void shopCanRemoveItemFromStock(){
        shop.addItem(guitar);
        shop.removeItem(guitar);
        assertEquals(0, shop.getStock().size());
    }

    @Test
    public void shopCanCalculateTotalPotentialProfit(){
        shop.addItem(guitar);
        shop.addItem(sax);
        shop.addItem(sheet);
        shop.addItem(string);
        assertEquals(4, shop.getStock().size());
        assertEquals(197, shop.calcTotPotentialProfit(),0);
        System.out.println("tot prof: " + shop.calcTotPotentialProfit());
    }

    @Test
    public void shopCanPrintStockWithPrices(){
        shop.addItem(guitar);
        shop.addItem(sax);
        shop.addItem(sheet);
        shop.addItem(string);
        shop.printStockWithPrices();
    }
}
