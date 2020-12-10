package com.java.Bmetodos.teste;


import com.java.Bmetodos.classes.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.init("Pedro", "098-989-90898", 6700); //Veja como ficou o metodo init criado la na classe funcionario aqui
        funcionario.imprime(); // e aqui ira imprimir

    }

}
