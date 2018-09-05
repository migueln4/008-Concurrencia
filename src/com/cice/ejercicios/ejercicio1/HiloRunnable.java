package com.cice.ejercicios.ejercicio1;

public class HiloRunnable implements Runnable {
    @Override
    public void run() {
        int segundos = 0;
        int minutos = 0;
        int horas = 0;
        int control = 0;
        while (control != 62) {
            try {
                Thread.sleep(10L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            segundos++;
            control++;
            if (segundos == 60) {
                segundos = 0;
                minutos++;
            }
            if (minutos == 60) {
                minutos = 0;
                horas++;
            }
        }
        System.out.println("Tiempo " + horas + ":" + minutos + ":" + segundos);
        imprimirTiempo(horas, minutos, segundos);
        System.out.println("Tiempo transcurrido: "+String.format("%02d:%02d:%02d",horas,minutos,segundos));
    }

    private void imprimirTiempo(int h, int m, int s) {
        StringBuilder imprimir = new StringBuilder("Tiempo: ");
        if (Integer.toString(h).length() < 2)
            imprimir.append("0");
        imprimir.append(h + ":");
        if (Integer.toString(m).length() < 2)
            imprimir.append("0");
        imprimir.append(m + ":");
        if (Integer.toString(s).length() < 2)
            imprimir.append("0");
        imprimir.append(s);
        System.out.println(imprimir.toString());

    }
}
