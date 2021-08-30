package com.orange.apptest2;

public class HigtTech {
    private String itemName;
    private double itemPrice;
    private String itemDrawable;

    public HigtTech(String itemName, String itemDrawable, double itemPrice) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemDrawable = itemDrawable;
    }

    public String getItemDrawable() {
        return itemDrawable;
    }

    public String getItemName() {
        return itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }
}
