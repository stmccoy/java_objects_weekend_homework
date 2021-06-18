package instruments.enums;

public enum DjDeckType {

    TurnTables("turntable"),
    CDJs("cdj"),
    Laptop("laptop");

    private String deckType;

    DjDeckType(String deckType){
        this.deckType = deckType;
    }

    public String getDeckType() {
        return deckType;
    }
}
