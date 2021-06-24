package com.cunoc.vehiculos;

import com.cunoc.interfaces.TrasportarPersonas;

public class Camioneta extends Vehiculo implements TrasportarPersonas {

    private int velociada;

    public Camioneta(String combustible, int cantidadGasolina, int velociada) {
        super(combustible, cantidadGasolina);
        super.velocidadMax = 250;
        super.cantidadPasajeros = 200;
        this.velociada = velociada;
    }
    
    @Override
    public void acciones() {
        System.out.println("Soy una Camioneta, trasporto a personas de un logar a otro");
        if (calcularAcelracion() > 0) {
            System.out.println("Acelerando para superar mi tiempo record");
            System.out.println("Mi velocidad es" + calcularAcelracion());
        }
        if (giroDerecha(-2)) {
            System.out.println("Vehiculo girando Rapido, mis pasajeros tiene prisa");
        }
        if (giroIzquierda(-2)) {
            System.out.println("Vehiculo girando a la izquierda");

        }
        trasportarPersonas(this.cantidadPasajeros);
    }

    @Override
    public int calcularAcelracion() {

        if (velocidadMax == velociada) {
            this.setAcelacion((double) (this.velocidadMax + 35));
            return (int) this.getAcelacion();

        }
        return 0;
    }

    public boolean giroDerecha(int gradGiro) {
        boolean giro = false;
        if (gradosMaxGiroDerecha > gradGiro) {
            giro = true;
        } else {
            System.out.println("No puedes girar a la derecha---");
        }
        return giro;
    }

    public boolean giroIzquierda(int gradGiro) {
        boolean giro = false;
        if (gradosMaxGiroDerecha > gradGiro && 0 > gradGiro) {
            giro = true;
        } else {
            System.out.println("No puedes girar a la izquierda---");
        }
        return giro;

    }

    public void trasportarPersonas(int numPersonas) {
        System.out.println("Estoy trasportando a un total de persons " + numPersonas);
    }

}
