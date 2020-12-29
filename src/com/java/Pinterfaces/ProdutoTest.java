package com.java.Pinterfaces;

public class ProdutoTest {
    public static void main(String[] args) {
        Produto p = new Produto("Notebook", 4, 2000);
        p.calcImposto();
        p.calcFrete();
        System.out.println(p);

        /**
         * Quando usar interface e classes abstratas
         * A resposta curta:
         * uma classe abstrata permite que você crie funcionalidades que as subclasses podem implementar ou substituir.
         * Uma interface permite apenas definir a funcionalidade, não implementá-la.
         * E enquanto uma classe pode estender apenas uma classe abstrata, ela pode tirar proveito de várias interfaces.
         */

        /**
         * Interface C # explicada
         * Uma interface é basicamente um contrato - não tem implementação.
         * Uma interface pode conter apenas declarações de método; não pode conter definições de método.
         * Você também não pode ter nenhum dado de membro em uma interface.
         * Enquanto uma classe abstrata pode conter definições de métodos, campos e construtores, uma interface pode ter apenas declarações de eventos, métodos e propriedades.
         * Os métodos declarados em uma interface devem ser implementados pelas classes que implementam a interface.
         * Observe que uma classe pode implementar mais de uma interface, mas estender apenas uma classe. A classe que implementa a interface deve implementar todos os seus membros.
         * Como uma classe abstrata, uma interface não pode ser instanciada.
         */

        /**
         * Quando usar uma ou outra?
         *As classes abstratas fornecem a flexibilidade de ter certos métodos concretos e alguns outros métodos que as classes derivadas devem implementar.
         *  Por outro lado, se você usar interfaces, precisará implementar todos os métodos na classe que estende a interface.
         *  Uma classe abstrata é uma boa escolha se você tem planos para uma expansão futura - isto é, se uma expansão futura é provável na hierarquia de classes.
         *  Se desejar fornecer suporte para expansão futura ao usar interfaces, você precisará estender a interface e criar uma nova.
         *
         * Por outro lado, é fácil adicionar uma nova interface à hierarquia, se necessário.
         * No entanto, se você já tem uma classe abstrata em sua hierarquia, não pode adicionar outra - ou seja, você pode adicionar uma classe abstrata apenas se nenhuma estiver disponível.
         * Você deve usar uma interface se quiser um contrato sobre algum comportamento ou funcionalidade.
         * Você não deve usar uma interface se precisar escrever o mesmo código para os métodos de interface.
         * Nesse caso, você deve usar uma classe abstrata, definir o método uma vez e reutilizá-lo conforme necessário.
         * Use interfaces para desacoplar o código de seu aplicativo de implementações específicas dele ou para restringir o acesso a membros de um determinado tipo.
         */

    }
}
