package edu.psu.abington.ist.ist242;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu {
    private int menuId;
    private String menuItem;
    private double itemPrice;

    public Menu(int _menuId, String _menuItem, double _itemPrice) {
        this.menuId = _menuId;
        this.menuItem = _menuItem;
        this.itemPrice = _itemPrice;
    }

    public int getmenuId() {
        return this.menuId;
    }

    public void setmenuId(int _menuId) {
        this.menuId = _menuId;
    }

    public String getmenuItem() {
        return this.menuItem;
    }

    public void setmenuItem(String _menuItem) {
        this.menuItem = _menuItem;
    }

    public double getItemPrice() {
        return this.itemPrice;
    }

    public void setItemPrice(double _itemPrice) {
        this.itemPrice = _itemPrice;
    }

    public static void listMenu(ArrayList<Menu> mList) {
        Iterator var1 = mList.iterator();

        while(var1.hasNext()) {
            Menu menu = (Menu)var1.next();
            System.out.println("Item: " + menu.getmenuItem() + " Price: " + menu.getItemPrice());
        }

    }
}
