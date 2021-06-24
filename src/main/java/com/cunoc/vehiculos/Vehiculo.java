package com.cunoc.vehiculos;

import com.cunoc.interfaces.*;

public abstract class Vehiculo implements GiroDerecha, GiroIzquierda{

    protected String combustible;
    protected int cantidadGasolina;
    protected int cantidadPasajeros;
    protected int velocidadMax;
    protected double acelacion;


    public Vehiculo(String combustible, int cantidadGasolina, int cantidadPasajeros, int velocidadMax, double acelacion){
        this.combustible =combustible;
        this.cantidadGasolina = cantidadGasolina;
        this.cantidadPasajeros = cantidadPasajeros;
        this.velocidadMax = velocidadMax;
        this.acelacion = acelacion;
    }

    public Vehiculo(String combustible, int cantidadGasolina) {
        this.combustible = combustible;
        this.cantidadGasolina = cantidadGasolina;
    }
    


    public abstract int calcularAcelracion();

    public int getCantidadGasolina() {
        return cantidadGasolina;
    }
    public double getAcelacion() {
        return acelacion;
    }
    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }
    public String getCombustible() {
        return combustible;
    }
    public int getVelocidadMax() {
        return velocidadMax;
    }
    public void setAcelacion(double acelacion) {
        this.acelacion = acelacion;
    }
    public void setCantidadGasolina(int cantidadGasolina) {
        this.cantidadGasolina = cantidadGasolina;
    }
    public void setCombustible(String combustible){
        this.combustible = combustible;
    }

    @Override
    public String toString() {
        return super.toString();
    }




}