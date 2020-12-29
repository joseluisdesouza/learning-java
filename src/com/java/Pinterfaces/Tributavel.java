package com.java.Pinterfaces;

//Outra coisa que difere uma interface de uma classe abstrata é que podemos implementar mais de uma numa outro classe
public interface Tributavel {

    //Em uma interface podemos ter atributos porem eles devem ser constantes
    public static final double IMPOSTO = 0.2;


    //Em interfaces todos os metodos são abstratos, não ha corpo
    // Uma interface nos não extends e sem implements, implementamos e não a extendemos
    //Em uma interface todos os metodos são considerados publicos e abstratos
    public void calcImposto();
}
