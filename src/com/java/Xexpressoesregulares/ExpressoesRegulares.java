package com.java.Xexpressoesregulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// TODO: 19/01/2021 parei na 92, devo ir para 93 
public class ExpressoesRegulares {
    public static void main(String[] args) {
        // \d - todos os digitos
        // \D - tudo oque não for digito
        // \s espaços em barnco \t \n \f \r
        // \S caractere que não é branco
        // \w caractere de palavras a-z A-Z, digitos e _
        // \W tudo oque não for um caracter de palavra
        // [] podemos usar [a-zA-Z]
        /**
         * Quantificadores
         */
        // ? zero ou uma ocorrencia
        // * zero ou mais ocorrencia
        // + uma ou mais
        // (n,m) de n ate m
        // () serve para agrupar uma expressão
        // | serve para "ou"
        // $ fim de linha
        // . coringa
        // ^ negação, excluir algo de uma regex
        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String text = "fulano@hotmail.com, 102abc@gmail.com, #@!abrao@gmail.com.com, teste@gmail.com.br" +
                "teste@gmail";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        System.out.println("texto " + text);
        System.out.println("indice: 012345678901234567");
        System.out.println("expressão: " + matcher.pattern());
        System.out.println("posiçoes encontradas");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group());
        }
    }

    /**
     * expressoes regulares não reutilizam um caractere que ja foi utilizado
     */
}
