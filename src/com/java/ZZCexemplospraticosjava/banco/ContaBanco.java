package com.java.ZZCexemplospraticosjava.banco;

public class ContaBanco {

    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }

    public void estadoAtual() {
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());

    }

    public void abrirConta(String tipo1) {
        this.setTipo(tipo1);
        this.setStatus(true);
        if (tipo1.equals("CC")) { // ou usar ==
            this.setSaldo(50); // usamos o metodo setSaldo ao inves do this.saldo = 50, não devemos trabalhar direto com o atributo
        } else if (tipo1 == "CP") {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso");
    }

    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Conta com dinheiro");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta em debito");
        } else this.setStatus(false);
        System.out.println("Conta fechada com sucesso");
    }

    public void depositar(float valorDeposito) {
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + valorDeposito);
            System.out.println("Deposito realizado na conta de " + this.getDono());
        } else
            System.out.println("Impossivel depositar");

    }

    public void sacar(float valorSacar) {
        if (this.getStatus()) {
            if (this.getSaldo() >= valorSacar) {
                this.setSaldo(this.getSaldo() - valorSacar);
                System.out.println("Saque realizado na conta de " + this.getDono());
            } else
                System.out.println("Saldo insuficiente");
        } else
            System.out.println("Impossivel sacar de uma conta fechada");
    }

    public void pagarMensal() {
        int v = 0;
        if (this.getTipo().equals("CC")) {
            v = 12;
        } else if (this.getTipo().equals("CP")) {
            v = 20;
        }
        if (this.getStatus()) {
            if (this.getSaldo() > v) {
                this.setSaldo(this.getSaldo() - v);
            } else
                System.out.println("Saldo insuficiente");
        } else
            System.out.println("Impossivel pagar");
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
