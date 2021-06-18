package shopItemTests;

import instruments.Guitar;
import org.junit.Before;
import org.junit.Test;
import shopItemsClasses.InstrumentItem;

import static org.junit.Assert.assertEquals;

public class InstrumentItemTests {

    private InstrumentItem instrumentItem;
    private Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("Wood", "Black", "String", 6);
        instrumentItem = new InstrumentItem(guitar, 400.00, 600.00);
    }

    @Test
    public void instrumentItemHasInstrument(){
        assertEquals(guitar, instrumentItem.getInstrumentType());
    }

    @Test
    public void instrumentHasBoughtPrice(){
        assertEquals(400.00, instrumentItem.getBoughtPrice(), 0.00);
    }

    @Test
    public void instrumentHasSellPrice(){
        assertEquals(600.00, instrumentItem.getSellPrice(), 0.00);
    }

    @Test
    public void instrumentCanCalculateMarkup(){
        assertEquals(200.00, instrumentItem.calculateMarkup(), 0.00);
    }
}
