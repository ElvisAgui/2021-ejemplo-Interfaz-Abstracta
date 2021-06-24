package com.cunoc.vehiculos;

import com.cunoc.interfaces.GiroDerecha;
import com.cunoc.interfaces.Turbo;

public class VehiculoCarrera extends Vehiculo implements Turbo {

    public VehiculoCarrera(String combustible, int cantidadGasolina) {
        super(combustible, cantidadGasolina);
        super.velocidadMax = 350;
        super.cantidadPasajeros = 4;

    }

    public void acciones() {
        System.out.println("Soy un auto de carrera soy super rapido con turbo");
        if (giroDerecha(45)) {

        }
    }

    @Override
    public int calcularAcelracion() {
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
        return false;

    }

    public void aumentoVelocidad() {

        System.out.println("Mi velocidad con truvo es " + getVelocidadMax() + 75);
    }

}
