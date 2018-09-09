package com.cice.ejercicios.ejercicio2;

public class Supermercado {

    public Supermercado() {
        super();
    }

    public void entraCompra(Cajera cajera,Cliente cliente,long tiempoInicial) {
        Runnable hiloRunnable = () -> cajera.procesarCompra(cliente,tiempoInicial);
        Thread hilo = new Thread(hiloRunnable);
        hilo.start();
    }
}
