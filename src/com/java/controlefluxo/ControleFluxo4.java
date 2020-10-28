package com.java.controlefluxo;

public class ControleFluxo4 {
    public static void main(String[] args) {
        int contador = 0;
        while (contador < 10) {
            System.out.println(++contador);
        }
        contador = 0;
        do {
            System.out.println("dentro do while");
        } while (contador < 10);

    }
       // for ( int i = 0; i < 10; i++) {
      //  System.out.println("o valor de i é" + i);
    //    if(i==5) {
         //   break; // quando queremos parar o codigo em um determinado momento utilizamos o break.
        }
  //  }

//}



//controle de fluxo com while, do while e o for, forEach é mais para frente no curso
/* a diferença do while para o do while é que se no while a condição for falsa ele nao ira executar
ja no do while mesmo que for falso ele ira executar pelo menos uma vez. Entao usamos o do while quando nao
temos certeza de quantas vezes teremos que repetir um pedaço de codigo
 */
// o FOR nao ira avaliar apenas uma instrução e ja é usado quando temos um tamanho de codigo ja pre definido.