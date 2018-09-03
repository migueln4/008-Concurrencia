package com.cice.hilos;

public class HiloPropio extends Thread {

    @Override
    public void run() {
        for (int i = 1; i<=100; i++) {
            System.out.println("Vuelta del hilo propio: "+i);
        }
    }

}
