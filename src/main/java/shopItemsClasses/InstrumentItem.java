package shopItemsClasses;

import instruments.Instrument;

public class InstrumentItem extends ShopItem{

    private Instrument instrumentType;

    public InstrumentItem(Instrument instrumentType, double boughtPrice, double sellPrice) {
        super(boughtPrice, sellPrice);
        this.instrumentType = instrumentType;
    }

    public Instrument getInstrumentType() {
        return instrumentType;
    }
}
