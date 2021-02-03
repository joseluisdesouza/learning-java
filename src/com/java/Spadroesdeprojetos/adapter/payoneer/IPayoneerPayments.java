package com.java.Spadroesdeprojetos.adapter.payoneer;

import com.java.Spadroesdeprojetos.adapter.utils.Token;

public interface IPayoneerPayments {

    Token authRoken();
    void sendPayment();
    void receivePayment();
}
