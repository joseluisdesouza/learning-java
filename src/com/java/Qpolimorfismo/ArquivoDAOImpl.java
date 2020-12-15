package com.java.Qpolimorfismo;

public class ArquivoDAOImpl implements GenericDAO{
    @Override
    public void save() {
        System.out.println("Salvando dados nos arquivos");
    }
}
