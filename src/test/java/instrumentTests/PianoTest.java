package instrumentTests;

import instruments.Piano;
import instruments.PianoTypes;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    private Piano piano;

    @Before
    public void before(){
        piano = new Piano("Wood", "Brown", "Keys", PianoTypes.Grand);
    }

    @Test
    public void pianoHasMaterial(){
        assertEquals("Wood", piano.getMaterial());
    }

    @Test
    public void pianoHasColour(){
        assertEquals("Brown", piano.getColour());
    }

    @Test
    public void pianoHasType(){
        assertEquals("Keys", piano.getType());
    }

    @Test
    public void pianoHasPianoType(){
        assertEquals(PianoTypes.Grand, piano.getPianoType());
    }

    @Test
    public void pianoCanPlay(){
        assertEquals("Piano Noises", piano.play());
    }
}
