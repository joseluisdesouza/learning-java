package com.java.Spadroesdeprojetos.adapter.adapters;

import com.java.Spadroesdeprojetos.adapter.payoneer.Payoneer;
import com.java.Spadroesdeprojetos.adapter.paypal.IPayPalPayments;
import com.java.Spadroesdeprojetos.adapter.utils.Token;

public class PayonnerAdapter implements IPayPalPayments {
    private Token token;
    private Payoneer payoneer;

    public PayonnerAdapter(Payoneer payoneer) {
        this.payoneer = payoneer;
        System.out.println("Adaptando o Payoneer utilizando os metodos padroes do PayPal");
    }
    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void payPalPayment() {
        this.payoneer.sendPayment();
    }

    @Override
    public void payPalReceive() {
        this.payoneer.receivePayment();
    }
}
