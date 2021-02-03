package com.java.Spadroesdeprojetos.adapter;

import com.java.Spadroesdeprojetos.adapter.adapters.PayonnerAdapter;
import com.java.Spadroesdeprojetos.adapter.payoneer.Payoneer;
import com.java.Spadroesdeprojetos.adapter.paypal.IPayPalPayments;

public class AdapterMain {
    public static void main(String[] args) {

        IPayPalPayments payment = new PayonnerAdapter(new Payoneer());
        payment.payPalPayment();
        payment.payPalReceive();

    }

    /**
     * Podemos utilizar o padrão ADAPTER para converter a interface
     * de um objeto de maneira que outro objeto possa compreender
     * as informações. É um adaptador.
     *
     * Um adaptador encobre um dos objetos para esconder as regras
     * de negocio e qualquer dificuldade da conversão, isso fica
     * oculto. O objeto encoberto neste caso o PayPal nem fica
     * sabendo que existe um adapter, o adapter só consome a informação.
     *
     * Adapter: Converte a interface de uma classe para outra
     * interface que o codigo cliente espera encontrar. A entidade
     * adaptadora permite que classes com interfaces incompativeis
     * trabalhem juntas.
     */

}
