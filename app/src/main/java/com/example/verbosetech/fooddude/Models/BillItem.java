package com.example.verbosetech.fooddude.Models;

/**
 * Created by sagar on 1/7/17.
 */

public class BillItem {

    String name;
    String quantity;
    double perprice;

    public BillItem(String name, String quantity, double perprice) {
        this.name = name;
        this.quantity = quantity;
        this.perprice = perprice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public double getPerprice() {
        return perprice;
    }

    public void setPerprice(double perprice) {
        this.perprice = perprice;
    }
}
