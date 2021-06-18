package shopTest;

import instruments.DjDeck;
import instruments.Instrument;
import instruments.enums.DjDeckType;
import org.junit.Before;
import org.junit.Test;
import shop.Shop;
import shopItemsClasses.InstrumentItem;
import shopItemsClasses.NonInstrumentItem;

import static org.junit.Assert.assertEquals;

public class ShopTests {

    private Shop shop;
    private Instrument djDeck;
    private InstrumentItem instrumentItem;
    private NonInstrumentItem nonInstrumentItem;

    @Before
    public void before(){
        shop = new Shop();
    }

    @Test
    public void shopHasStock(){
        assertEquals(0, shop.getStock().size());
    }

    @Test
    public void canAddStock(){
        djDeck = new DjDeck("Plastic", "Black", "Dj Deck", DjDeckType.TurnTables);
        instrumentItem = new InstrumentItem(djDeck, 400, 600);
        nonInstrumentItem = new NonInstrumentItem("Music Book", 10, 20);
        shop.addStock(instrumentItem);
        shop.addStock(nonInstrumentItem);
        assertEquals(2, shop.getStock().size());
        assertEquals(true, shop.getStock().contains(instrumentItem));
        assertEquals(true, shop.getStock().contains(nonInstrumentItem));
    }

    @Test
    public void canRemoveStock(){
        djDeck = new DjDeck("Plastic", "Black", "Dj Deck", DjDeckType.TurnTables);
        instrumentItem = new InstrumentItem(djDeck, 400, 600);
        nonInstrumentItem = new NonInstrumentItem("Music Book", 10, 20);
        shop.addStock(instrumentItem);
        shop.addStock(nonInstrumentItem);
        shop.removeStock(nonInstrumentItem);
        assertEquals(1, shop.getStock().size());
        assertEquals(true, shop.getStock().contains(instrumentItem));
        assertEquals(false, shop.getStock().contains(nonInstrumentItem));
    }

}
