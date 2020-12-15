package com.java.Qpolimorfismo;

public class DatabaseDAOImpl implements GenericDAO{

    @Override
    public void save() {
        System.out.println("Salvando dados no banco");
    }

}
