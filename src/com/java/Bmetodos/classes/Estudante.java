package com.java.Bmetodos.classes;

public class Estudante {

    /*Quando mudamos o modificador de acesso de public para private torna os atributos visiveis somente para essa classe Estudante,
     mas precisamos criar uma forma de acessar esses dados. E para isso temos os metodos GET e SET
     */

    private String nome;
    private int idade;
    private double[] notas;
    private boolean aprovado;

    /*Alta coesão significa que a classe esta bem especifica e isso é bom
    Baixa coesão é um mal sinal porque significa que a classe esta nada especifica
    Acoplamento = quanto mais uma classe conhecer de outra pior porque vai ser muito dificil dar manutenção
    opte sempre por baixo acoplamento
    */
    public void print() {
        System.out.println("Nome " + this.nome);
        System.out.println("Idade " + this.idade);
        if (this.notas != null) // se o aluno não tiver notas
            for (double nota : this.notas) {
                System.out.print(nota + " ");
            }

    }

    /* vamos usar this. e todas as chamadas da variavel notas para não a ver problemas, pense se voçe iniciar uma variavel
    de escopo local com o mesmo nome ira dar problema por exemplo
    */
    public void tirarMedia() {
        if (this.notas == null) {
            System.out.println("Esee aluno não possui notas"); // se o aluno não tiver notas
            return;
        }
        double media = 0;
        for (double nota : this.notas) {
            media += nota;
        }
        media = media / this.notas.length;

        if (media > 6) {
            this.aprovado = true; // Lembre-se que podemos acessar o atributo private direto na propria classe sem a necessidade de um get ou set
            System.out.println(nome + " --Parabens aprovado!--");

        } else {
            this.aprovado = false;
            System.out.println(nome + " --Não foi dessa vez reprovado--");
        }

    }

    //Metodos GETTERS e SETTERS = GET é quando queremos buscar/obter e SET é quando queremos colocar algo

    public void setNome(String nome) { // Os metodos GET e SET devem ser publics na maioria das vezes para podermos dar acesso por outras br.com.java.sobrecargametodos.classes, e não tera nenhum retorno porque eu só quero colocar um valor na memoria
        this.nome = nome; /* o this.nome = nome significa que dentro do meu setNome que estou passando o String nome eu terei o nome do objeto nome por isso preciso fazer essa referencia
        se colocar somente nome = nome tu esta dizendo que o nome do parametro String nome esta recebendo ele mesmo, só que queremos pegar o nome do objeto
        */
    }

    public void setIdade(int idade) { // Se não quer que ninguem modifique a idade podemos remover a setIdade
        //Para idades erradas inseridas tipo: -3 vamos usar uma condição if
        if (idade < 0) {
            System.out.println("Voçe não pode inserir idade");
            return;
        }
        this.idade = idade;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }


//Agora os metodos GET para buscar

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public double[] getNotas() {
        return this.notas;
    }

    public boolean isAprovado() {
        return this.aprovado;
    }


}
