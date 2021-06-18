package instruments;

import behaviours.IPlay;

public abstract class Instrument implements IPlay {

    private String material;
    private String colour;
    private String type;

    public Instrument(String material, String colour, String instrumentType) {
        this.material = material;
        this.colour = colour;
        this.type = instrumentType;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public String getInstrumentType() {
        return type;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
