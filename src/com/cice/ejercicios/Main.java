package com.cice.ejercicios;

import com.cice.ejercicios.ejercicio2.*;

public class Main {

    public static void main(String[] args) {
        Cajera cajera1 = new Cajera("Cajera A");
        Cajera cajera2 = new Cajera("Cajera B");

        Cliente cliente1 = new Cliente("Cliente A",new int[]{2,5,9,2});
        Cliente cliente2 = new Cliente("Cliente B",new int[]{10,1,4,5});

        Supermercado supermercado = new Supermercado();

        long tiempoInicial = System.currentTimeMillis();

        supermercado.entraCompra(cajera1,cliente1,tiempoInicial);
        supermercado.entraCompra(cajera2,cliente2,tiempoInicial);
    }

}
