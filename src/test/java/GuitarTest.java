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
    public void guitarHasType(){
        assertEquals("String", guitar.getType());
    }

    @Test
    public void guitarHasNumberOfStrings(){
        assertEquals(6, guitar.getNumberOfStrings());
    }

}
