package instrumentTests;

import instruments.DjDeck;
import instruments.enums.DjDeckType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DjDecksTest {

    private DjDeck djDeck;

    @Before
    public void before(){
        djDeck = new DjDeck("Plastic", "Black", "Dj Deck", DjDeckType.TurnTables);
    }

    @Test
    public void djDeckHasMaterial(){
        assertEquals("Plastic", djDeck.getMaterial());
    }

    @Test
    public void djDeckHasColour(){
        assertEquals("Black", djDeck.getColour());
    }

    @Test
    public void djDeckHasInstrumentType(){
        assertEquals("Dj Deck", djDeck.getInstrumentType());
    }

    @Test
    public void djDeckHasDjDeckType(){
        assertEquals(DjDeckType.TurnTables, djDeck.getDeckType());
    }

    @Test
    public void djDeckCanPlay(){
        assertEquals("Dance Music", djDeck.play());
    }

    @Test
    public void djDeckCanChangeColour(){
        djDeck.setColour("Blue");
        assertEquals("Blue", djDeck.getColour());
    }
}
