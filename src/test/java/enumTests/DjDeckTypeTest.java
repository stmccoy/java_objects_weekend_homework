package enumTests;

import instruments.enums.DjDeckType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DjDeckTypeTest {

    private DjDeckType deckType;

    @Before
    public void before(){
        deckType = DjDeckType.CDJs;
    }

    @Test
    public void canGetDjDeckTypeString(){
        assertEquals("cdj", deckType.getDeckType());
    }
}
