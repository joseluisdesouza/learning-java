package com.java.Spadroesdeprojetos.builder;

public class BuilderMain {
    public static void main(String[] args) {

    }

    /**
     * Quando criamos um objeto com muitas regras de negocio,metodos, é sempre um
     * risco termos construtores com inumeros parametros.Este é um problema, uma vez
     * que situaçoes que não precisem de tantos parametros podem fazer uma serie de
     * parametros null, ou vazio. Na verdade metodos que passam de 3 a 4 parametros
     * podem confundir a clareza do codigo e se enquadra no que é chamado de Long
     * Parameter List.
     *
     * Para ilustrar imagine o objeto o Carro. Para construir um carro, voce precisa
     * de motor, carroceria, rodas, combustivel. Mas e se voce quiser uma
     * caminhonete? ou um caminhão?
     *
     * Talvez voce pense em herança, estender a classe Carro e criar um conjunto de
     * subclasses para cobrir todas as possibilidades. Isso podera resultar em um numero
     * consideravel de subclasses alem de engessar essas subclasses, se precisar de
     * uma caminhonete 4x4 o processo ira se repetir, estender novamente e assim por diante.
     *
     * E ai que o padrao Builder, ira nos ajudar.
     *
     * No padrao Builder iremos quebrar o processo de criação do objeto em etapas,
     *  e em varios metodos, como ferramentas e componentes, preciso de motor, ok
     *  a classe Motor estara disponivel, preciso de uma caçamba, afinal estamos fazendo
     *  caminhonete, temos o Componente Caçamba que esta a nossa disposição.
     *
     *  Esses componentes serão chamados builders, que são os itens para construir
     *  o objeto complexo.
     *
     *  A sequencia da construção, sera guiada por um Diretor, que recebe quais os
     *  metodos ele precisa, e sempre que soliciatado, dispara a sequencia para os builders,
     *  que irão construir o objeto.
     *
     *  Assim, temos uma biblioteca de componentes e ferramentas, que são acessadas pelo
     *  diretor quando provocado a construir algum modelo pre-estabelecido por meio
     *  de uma interface.
     *
     */
}
