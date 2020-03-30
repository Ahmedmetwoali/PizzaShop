package edu.psu.abington.ist.ist242;

import java.util.ArrayList;
import java.util.Iterator;

public class Customer {
    private int customerId;
    private String customerName;
    private String customerPhoneNumber;

    public Customer(int _customerId) {
        this.customerId = _customerId;
    }

    public int getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(int _customerId) {
        this.customerId = _customerId;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setCustomerName(String _customerName) {
        this.customerName = _customerName;
    }

    public String getCustomerPhoneNumber() {
        return this.customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String _customerPhoneNumber) {
        this.customerPhoneNumber = _customerPhoneNumber;
    }

    public static void printCustomer(ArrayList<Customer> cList) {
        Iterator var1 = cList.iterator();

        while(var1.hasNext()) {
            Customer cust = (Customer)var1.next();
            System.out.println("Customer Id:" + cust.getCustomerId());
            System.out.println("Customer Name:" + cust.getCustomerName());
            System.out.println("Customer Phone:" + cust.getCustomerPhoneNumber());
        }

    }
}
