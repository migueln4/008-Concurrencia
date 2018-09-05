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

        //Aquí se hace la opción 2
        otracosa();

        //Usando lambdas
        lambdaslocas();

    }

    private static void hiloNuevo() {
        for (int i = 1; i<=100; i++) {
            System.out.println("Vuelta en el Main, con el hilo nuevo: "+i);
        }
    }

    private static void otracosa() {
        HiloRunnable hr = new HiloRunnable();
        Thread hilo = new Thread(hr);
        hilo.setName("Hilo molón");
        hilo.start();
    }

    private static void lambdaslocas() {
        Runnable run = () -> {
            for(int i=1;i<=5;i++) {
                System.out.println("Se ejecuta el hilo: "+Thread.currentThread().getName()+"\t-Vuelta: "+i);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread hilo = new Thread(run);
        hilo.start();
    }

}
