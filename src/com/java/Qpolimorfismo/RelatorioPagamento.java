package com.java.Qpolimorfismo;

public class RelatorioPagamento {

//    public void relatorioPagamentoGerente(Gerente gerente) {
//        System.out.println("Gerando relatorio de pagamento para a gerencia");
//        gerente.calcPagamento();
//        System.out.println("Nome: " + gerente.getNome());
//        System.out.println("Salario desse mes: " + gerente.getSalario());
//    }
//
//    public void relatorioPagamentoVendedor(Vendedor vendedor) {
//        System.out.println("Gerando relatorio de pagamento para os vendedores");
//        vendedor.calcPagamento();
//        System.out.println("Nome: " + vendedor.getNome());
//        System.out.println("Salario desse mes: " + vendedor.getSalario());
//    }

    public void relatorioPagamentoGenerico(Funcionario funcionario) { // Isso é chamado de parametros polimorficos
        System.out.println("Gerando relatorio de pagamento");
        funcionario.calcPagamento();
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Salario desse mes: " + funcionario.getSalario());
        // só que eu tambem quero mostrar a pnl do gerente, para isso:
        if (funcionario instanceof Gerente) {
            Gerente g = (Gerente) funcionario; //Casting explicito dizendo ao java que sei oque estou fazendo
            System.out.println("Participação nos lucros: " + g.getPnl());
        }
        if (funcionario instanceof Vendedor) {
            System.out.println("Total vendas: " + ((Vendedor) funcionario) .getTotalVendas()); // Aqui foi feito um casting direto
        }
    }
}
