package com.cice.ejercicios.ejercicio3;

public class Main {

    public static void main(String[] args) {
        Supermercado supermercado = new Supermercado();

        long inicio = System.currentTimeMillis();

        supermercado.comenzarCobros(inicio);

        long fin = System.currentTimeMillis();

        System.out.println("==================================\nTiempo total de procesamiento: "+(fin-inicio)/1000+ "segundos");
    }

}
