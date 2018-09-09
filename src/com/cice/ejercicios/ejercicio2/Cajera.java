package com.cice.ejercicios.ejercicio2;

public class Cajera {
    private String nombre;

    public Cajera () {
        super();
    }

    public Cajera(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void procesarCompra(Cliente cliente, long tiempoInicial) {
        System.out.println("La cajera "+this.nombre+" COMIENZA A PASAR LOS OBJETOS DE LA CESTA DEL CLIENTE "+
        cliente.getNombre() + " EN EL INSTANTE = "+(System.currentTimeMillis() - tiempoInicial)/1000+
        " segundos.");

        System.out.println();

        for (int i=0; i<cliente.getCarroCompra().length; i++) {
            tardarEnPasar(cliente.getCarroCompra()[i]);
            System.out.println("Procesando el producto nº"+(i+1)+" del cliente "+cliente.getNombre() +
            " -Tiempo requerido = "+(System.currentTimeMillis() - tiempoInicial)/1000+
                    " segundos-.");
        }

        System.out.println();

        System.out.println("La cajera "+this.nombre+" HA TERMINADO DE ATENDER AL CLIENTE "+cliente.getNombre()+
        " EN EL INSTANTE "+(System.currentTimeMillis() - tiempoInicial)/1000+
                " segundos.");
    }

    private void tardarEnPasar(int segundos) {
        try {
            Thread.sleep(segundos * 1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }


}
