package shopItemTests;

import org.junit.Before;
import org.junit.Test;
import shopItemsClasses.NonInstrumentItem;

import static org.junit.Assert.assertEquals;

public class NonInstrumentItemTests {

    private NonInstrumentItem nonInstrumentItem;

    @Before
    public void before(){
        nonInstrumentItem = new NonInstrumentItem("Music Book", 10.00, 20.00);
    }

    @Test
    public void nonInstrumentItemHasType(){
        assertEquals("Music Book", nonInstrumentItem.getNonInstrumentItemType());
    }

    @Test
    public void nonInstrumentItemHasBoughtPrice(){
        assertEquals(10.00, nonInstrumentItem.getBoughtPrice(), 0.00);
    }

    @Test
    public void nonInstrumentItemHasSellPrice(){
        assertEquals(20.00, nonInstrumentItem.getSellPrice(), 0.00);
    }

    @Test
    public void nonInstrumentItemCanCalculateMarkup(){
        assertEquals(10.00, nonInstrumentItem.calculateMarkup(), 0.00 );
    }
}

