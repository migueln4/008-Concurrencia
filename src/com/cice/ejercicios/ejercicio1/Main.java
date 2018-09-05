package com.cice.ejercicios.ejercicio1;

/**
A continuación vamos a crear una aplicación que muestre un cronómetro en el que se indique
        el tiempo transcurrido desde que se ejecuta la aplicación.
        El tiempo debe ser mostrado con el siguiente formato: hh:mm:ss
 */

public class Main {

    public static void main(String[] args) {
        HiloRunnable hr = new HiloRunnable();
        Thread hilo = new Thread(hr,"Cronómetro");
        hilo.start();
    }

}
