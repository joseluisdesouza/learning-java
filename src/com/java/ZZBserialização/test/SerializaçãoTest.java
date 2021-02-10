package com.java.ZZBserialização.test;

import com.java.ZZBserialização.classes.Aluno;

import java.io.*;

public class SerializaçãoTest {
    public static void main(String[] args) {
//        gravadorObjeto();
        leitorObjeto();

    }

    private static void gravadorObjeto() {
        Aluno aluno = new Aluno(2L, "Marcos", "12qwas");
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("aluno.ser"))) {
            oos.writeObject(aluno);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void leitorObjeto() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("aluno.ser"))) {
           Aluno aluno = (Aluno) ois.readObject();
            System.out.println(aluno);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
