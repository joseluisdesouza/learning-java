package com.java.Isobrecargaconstrutores;

public class Estudante {
    private String matricula;
    private String nome;
    private double[] notas;
    private String dataMatricula; // Novo atributo

    public Estudante(String matricula, String nome, double[] notas) { //Construtor com parametros que devem ser passados na criação do estudando
        this.matricula = matricula;
        this.nome = nome;
        this.notas = notas;// oque acontece se colocarmos mais um atributo?

    }

    public Estudante(String matricula, String nome, double[] notas, String dataMatricula) {
        this(matricula, nome, notas); // um construtor só pode ser chamado dentro de outro construtor
        this.dataMatricula = dataMatricula;

    }

    public Estudante() { // Construtuor vazio

    }

    public void imprime() { // apenas chamando esse metodo e ele ira imprimir os atributos
        System.out.println(this.nome);
        System.out.println(this.matricula);
        for (double nota : notas) {
            System.out.println(nota + "");
        }
    }


    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public String getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

}
