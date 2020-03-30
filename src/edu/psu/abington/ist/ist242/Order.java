package edu.psu.abington.ist.ist242;

import java.util.ArrayList;

public class Order {
    private int orderId;
    private Customer cust;
    private ArrayList<Menu> menuItem;

    public Order(int _orderId) {
        this.orderId = _orderId;
    }

    public int getorderId() {
        return this.orderId;
    }

    public void setorderId(int _orderId) {
        this.orderId = _orderId;
    }
}
