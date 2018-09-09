package com.cice.ejercicios.ejercicio3;

public class CajeraRunnable implements Runnable {

    private Cliente cliente;
    private long tiempoInicial;

    public CajeraRunnable(Cliente cliente, long tiempoInicial) {
        this.cliente = cliente;
        this.tiempoInicial = tiempoInicial;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public long getTiempoInicial() {
        return tiempoInicial;
    }

    public void setTiempoInicial(long tiempoInicial) {
        this.tiempoInicial = tiempoInicial;
    }

    @Override
    public void run() {
        System.out.println("LA CAJERA "+Thread.currentThread().getName()+"COMIENZA A PROCESAR LA COMPRA DEL CLIENTE "+
        this.cliente.getNombre()+" EN EL TIEMPO: "+(System.currentTimeMillis() - this.tiempoInicial)/1000+ "SEGUNDOS.");

        for (int i=0; i<this.cliente.getCarroCompra().length; i++) {
            this.tardaEnCargar(cliente.getCarroCompra()[i]);
            System.out.println("\tProcesando el producto nº"+(i+1)+" del "+this.cliente.getNombre()+" -> Tiempo = "+(System.currentTimeMillis() - this.tiempoInicial)/1000+ "segundos.");
        }

        System.out.println("\nLA CAJERA "+Thread.currentThread().getName()+" HA TERMINADO DE PROCESAR AL CLIENTE "+this.cliente.getNombre()+" EN EL TIEMPO "+(System.currentTimeMillis() - this.tiempoInicial)/1000+ "SEGUNDOS.");
    }

    private void tardaEnCargar(int segundos) {
        try {
            Thread.sleep(segundos * 1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
