package com.java.sobrecarga.metodos.classes;

public class Funcionario {

    private String nome;
    private String cpf;
    private double salario;
    private String rg;

    public Funcionario() {
        // Isso é um construtor vazio, sem não criarmos o java cria automaticamente na hora da compilação
        //podemos definir regras nos construtores tambem, comokpor exemplo sempre ter que colocar/definir um nome ou todos os atributos para o funcionario, como?
        //passando parametros no construtor segue abaixo..
    }

    public Funcionario(String nome, String cpf, double salario, String rg) { // enfim temos duas opçoes, a de criarmos um profissional passando os atributos no parametro
        // ou criar ele com o construtor vazio, dai assim deixando o programador criar as caracteriscas depois
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.rg = rg;
    }

    public void init(String nome, String cpf, double salario) { // esse metodo ja seta todos os atributos em uma só linha sem precisar ficar colocando varios System.out na classe de test pata setar eles. Veja na classe teste como funciona
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;

    }

    public void init(String nome, String cpf, double salario, String rg) { /* Sobrecarga de metodos é quando precisamos adcionar um no atributo na classe e ao inves
    de mudar o principal metodo init faremos um novo metodo com o mesmo nome init porem com parametros diferentes" isso se chama sobrecarga de metodos"! */
        init(nome, cpf, salario); // Podemos chamar um construtor com o this(); e passando os atributos Aula 40.
        this.rg = rg;

    }

    public void imprime() { // apenas chamando esse metodo e ele ira imprimir os atributos
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.salario);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public double getSalario() {
        return this.salario;
    }

    public String getRg() {
        return this.rg;
    }

}
