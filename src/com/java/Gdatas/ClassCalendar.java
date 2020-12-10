package com.java.Gdatas;

import java.util.Calendar;

public class ClassCalendar {
    public static void main(String[] args) {

        Calendar hoje = Calendar.getInstance(); //singleton- padrão de projeto

        int ano = hoje.get(Calendar.YEAR);
        int mes = hoje.get(Calendar.MONTH);
        int dia = hoje.get(Calendar.DAY_OF_MONTH);
        int hora = hoje.get(Calendar.HOUR);
        int minutos = hoje.get(Calendar.MINUTE);
        int segundos = hoje.get(Calendar.SECOND);


        System.out.printf("Hoje é : %02d/%02d/%02d %02d:%02d:%02d", dia, mes, ano, hora, minutos, segundos);

    }
}
