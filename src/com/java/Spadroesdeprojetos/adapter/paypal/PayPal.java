package com.java.Spadroesdeprojetos.adapter.paypal;

import com.java.Spadroesdeprojetos.adapter.utils.Token;

public class PayPal implements IPayPalPayments{
    private Token token;

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void payPalPayment() {
        this.token = authToken();
        System.out.println("Enviando pagamentos com PayPal");

    }

    @Override
    public void payPalReceive() {
        System.out.println("Pagamento recebido");

    }
}
