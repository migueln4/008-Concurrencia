package com.cice.hilos;

public class HiloRunnable implements Runnable {

    @Override
    public void run() {
        for(int i=1;i<=20;i++) {
            System.out.println("Se ejecuta el hilo: "+Thread.currentThread().getName()+"\t-Vuelta: "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
