package shopItemsClasses;

public class NonInstrumentItem extends ShopItem {

    private String nonInstrumentItemType;

    public NonInstrumentItem(String nonInstrumentItemType, double boughtPrice, double sellPrice) {
        super(boughtPrice, sellPrice);
        this.nonInstrumentItemType = nonInstrumentItemType;
    }

    public String getNonInstrumentItemType() {
        return nonInstrumentItemType;
    }
}
