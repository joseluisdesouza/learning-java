package com.java.Nclassesabstratas;

public class FuncionarioTest {
    public static void main(String[] args) {
        //Não existe mais funcionario, lembre-se ele agora é uma classe abstrata
//        Funcionario funcionario1 = new Funcionario("Pedro", "27678-98", 2500);
        Gerente g = new Gerente("Anna", "17826785", 2600);
        Vendedor v = new Vendedor("camila", "jyegj", 2000, 4000);
        g.calcSalario();
        v.calcSalario();
        System.out.println(g);
        System.out.println(v);

    }
}
