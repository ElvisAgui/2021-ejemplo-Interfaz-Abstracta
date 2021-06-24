package com.cunoc.vehiculos;

import com.cunoc.interfaces.trasportarMaterial;

public class VehiculoCarga extends Vehiculo implements trasportarMaterial {

    private String Carga;

    public VehiculoCarga(String combustible, int cantidadGasolina, String Carga) {
        super(combustible, cantidadGasolina);
        super.velocidadMax = 120;
        super.cantidadPasajeros = 4;
        this.Carga = Carga;
    }

    @Override
    public void acciones() {
        System.out.println("Soy un camion de Carga");
        giroDerecha(78);
        trasportarMaterial();
        System.out.println("Uso combustible " + this.combustible);
    }

    @Override
    public boolean giroDerecha(int gradGiro) {
        boolean giro = false;
        if (gradosMaxGiroDerecha > gradGiro) {
            System.out.println("Vehiculo girando despacio Ya que llevo Carga");
            giro = true;
        } else {
            System.out.println("No puedes girar a la derecha---");
        }
        return giro;

    }

    public void trasportarMaterial() {
        System.out.println("Estoy Trasportando " + this.Carga);
        System.out.println("Destino lejano ----");
    }

    @Override
    public int calcularAcelracion() {
        this.setAcelacion(45.5);
        return (int) (this.getAcelacion());

    }

    @Override
    public boolean giroIzquierda(int gradGiro) {
        boolean giro = false;
        if (gradosMaxGiroDerecha > gradGiro) {
            System.out.println("Vehiculo girando despacio Ya que llevo Carga");
            giro = true;
        } else {
            System.out.println("No puedes girar a la derecha---");
        }
        return giro;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
