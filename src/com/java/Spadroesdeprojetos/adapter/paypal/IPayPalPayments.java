package com.java.Spadroesdeprojetos.adapter.paypal;

import com.java.Spadroesdeprojetos.adapter.utils.Token;

public interface IPayPalPayments {

    Token authToken();
    void payPalPayment();
    void payPalReceive();
}
