package com.cice.ejercicios.ejercicio3;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Supermercado {

    private final int N_CAJERAS = 2;
    private ArrayList<Cliente> clientes;

    public Supermercado() {
        super();
        inicializar();
    }

    private void inicializar () {
        clientes = new ArrayList<>();
        clientes.add(new Cliente("CLIENTE 1",new int[]{1,5,6}));
        clientes.add(new Cliente("CLIENTE 2",new int[]{10,5,1,2}));
        clientes.add(new Cliente("CLIENTE 3",new int[]{2,8,2,2}));
        clientes.add(new Cliente("CLIENTE 4",new int[]{1}));
        clientes.add(new Cliente("CLIENTE 5",new int[]{6,3}));
        clientes.add(new Cliente("CLIENTE 6",new int[]{13,1,1,1,1,1,1}));
        clientes.add(new Cliente("CLIENTE 7",new int[]{8,4,1}));
        clientes.add(new Cliente("CLIENTE 8",new int[]{6,2,1}));
    }

    public void comenzarCobros(long tiempoInicial){
        ExecutorService executor = Executors.newFixedThreadPool(this.N_CAJERAS);
        for(Cliente cliente : clientes) {
            Runnable cajera = new CajeraRunnable(cliente,tiempoInicial);
            executor.execute(cajera);
        }
        executor.shutdown();
        while(!executor.isTerminated());
    }

}
