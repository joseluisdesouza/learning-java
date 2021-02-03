package com.java.Spadroesdeprojetos.adapter.payoneer;

import com.java.Spadroesdeprojetos.adapter.utils.Token;

public class Payoneer implements IPayoneerPayments {
    @Override
    public Token authRoken() {
        return new Token();
    }

    @Override
    public void sendPayment() {
        System.out.println("Enviandos pagamentos via Payoneer");
    }

    @Override
    public void receivePayment() {
        System.out.println("Recebendo pagamentos via Payoneer");
    }
}
