package enumTests;

import instruments.enums.PianoTypes;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTypesTest {

    private PianoTypes pianoType;

    @Before
    public void before() {
        pianoType = PianoTypes.Electronic;
    }

    @Test
    public void canGetPianoTypeString() {
        assertEquals("electronic", pianoType.getType());
    }
}


