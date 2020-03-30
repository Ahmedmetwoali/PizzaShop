package edu.psu.abington.ist.ist242;

import java.util.ArrayList;
import java.util.Iterator;

public class Transaction {
    private int transactionId;
    private Order order;
    private PaymentType pType;

    public Transaction(int _transactionId, Order _order, PaymentType _pType) {
        this.transactionId = _transactionId;
        this.order = _order;
        this.pType = _pType;
    }

    public int getTransactionId() {
        return this.transactionId;
    }

    public void setTransactionId(int _transactionId) {
        this.transactionId = _transactionId;
    }

    public Order getOrder() {
        return this.order;
    }

    public void setOrder(Order _order) {
        this.order = _order;
    }

    public PaymentType getPaymentType() {
        return this.pType;
    }

    public void setPaymentType(PaymentType _pType) {
        this.pType = _pType;
    }

    public static void listTransactions(ArrayList<Transaction> tList) {
        Iterator var1 = tList.iterator();

        while(var1.hasNext()) {
            Transaction trans = (Transaction)var1.next();
            System.out.println("Transaction ID: " + trans.getTransactionId());
            System.out.println("Payment Type: " + trans.getPaymentType());
        }

    }
}
