package shop;

import behaviours.ISell;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stock;

    public Shop() {
        this.stock = new ArrayList<>();
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public void addStock(ISell sellItem){
        getStock().add(sellItem);
    }

    public void removeStock(ISell sellItem){
        getStock().remove(sellItem);
    }
}
