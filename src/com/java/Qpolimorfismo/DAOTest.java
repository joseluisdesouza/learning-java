package com.java.Qpolimorfismo;

public class DAOTest {
    public static void main(String[] args) {
        GenericDAO arquivoDAO = new ArquivoDAOImpl();
        arquivoDAO.save();

        GenericDAO arquivoDAO2 = new DatabaseDAOImpl();
        arquivoDAO2.save();
    }
}
