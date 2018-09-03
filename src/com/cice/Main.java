package com.cice;

import com.cice.hilos.*;

public class Main {

    public static void main(String[] args) {

        //Los hilos se usan de dos formas:
            //1) Crear una sublcase de Thread
            //2) Implementar la interfaz Runnable

        long inicio = System.currentTimeMillis();

        HiloPropio hp = new HiloPropio();

        hp.start();

        //hiloNuevo();

        for (int i = 1; i<=100; i++) {
            System.out.println("Vuelta del Main: "+i);
        }

        long fin = System.currentTimeMillis();

        System.out.println("Tiempo total = "+(fin-inicio));

    }

    private static void hiloNuevo() {
        for (int i = 1; i<=100; i++) {
            System.out.println("Vuelta en el Main, con el hilo nuevo: "+i);
        }
    }

}
