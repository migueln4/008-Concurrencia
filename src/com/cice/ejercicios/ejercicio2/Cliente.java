package com.cice.ejercicios.ejercicio2;

public class Cliente {
    private String nombre;
    private int[] carroCompra;

    public Cliente () {
        super();
    }

    public Cliente (String nombre) {
        this.nombre = nombre;
        this.carroCompra = new int[]{0};
    }

    public Cliente (String nombre, int[]carroCompra) {
        this.nombre = nombre;
        this.carroCompra = carroCompra;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int[] getCarroCompra() {
        return carroCompra;
    }

    public void setCarroCompra(int[] carroCompra) {
        this.carroCompra = carroCompra;
    }
}
