package instruments;

public enum PianoTypes {

    Grand("grand"),
    Upright("upright"),
    Electronic("electronic");

    private String type;

    PianoTypes(String type){
        this.type = type;
    }

    public String getType(){
        return this.type;
    }
}
