package instruments;

import behaviours.IPlay;
import instruments.enums.DjDeckType;

public class DjDeck extends Instrument implements IPlay {

    private DjDeckType deckType;

    public DjDeck(String material, String colour, String type, DjDeckType deckType) {
        super(material, colour, type);
        this.deckType = deckType;
    }

    public DjDeckType getDeckType() {
        return deckType;
    }

    @Override
    public String play() {
        return "Dance Music";
    }
}
