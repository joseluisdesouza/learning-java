package com.java.Bmetodos.teste;


import com.java.Bmetodos.classes.Estudante;

public class EstudanteTeste {
    public static void main(String[] args) {

        Estudante estudante = new Estudante();
        //aqui agora usando os metodos acessores vamos passar argumentos e não mais inicializar uma variavel
        estudante.setNome("joao");
        estudante.setIdade(-3);
        estudante.setNotas(new double[]{3, 7, 2});


        //aqui estamos inicializando uma variavel
        //estudante.nome = "José Souza";
        //estudante.idade = 26;
       // estudante.notas = new double[]{3, 7, 2};
        estudante.print();
        estudante.tirarMedia();

        // tente sempre prever erros, nesse caso é se o aluno não tiver notas.
    }
}
