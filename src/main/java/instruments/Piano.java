package instruments;

import instruments.enums.PianoTypes;

public class Piano extends Instrument {

    private PianoTypes pianoType;

    public Piano(String material, String colour, String type, PianoTypes pianoType) {
        super(material, colour, type);
        this.pianoType = pianoType;
    }

    public PianoTypes getPianoType() {
        return pianoType;
    }

    @Override
    public String play() {
        return "Piano Noises";
    }
}
