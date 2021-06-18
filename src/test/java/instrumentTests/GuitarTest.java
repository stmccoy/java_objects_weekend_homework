package instrumentTests;

import instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    private Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("Wood", "Black", "String", 6);
    }

    @Test
    public void guitarHasMaterial(){
        assertEquals("Wood", guitar.getMaterial());
    }

    @Test
    public void guitarHasColour(){
        assertEquals("Black", guitar.getColour());
    }

    @Test
    public void guitarHasInstrumentType(){
        assertEquals("String", guitar.getInstrumentType());
    }

    @Test
    public void guitarHasNumberOfStrings(){
        assertEquals(6, guitar.getNumberOfStrings());
    }

    @Test
    public void guitarCanPlay(){
        assertEquals("Guitar sounds", guitar.play());
    }

    @Test
    public void guitarCanChangeColour(){
        guitar.setColour("Pink");
        assertEquals("Pink", guitar.getColour());
    }

}
