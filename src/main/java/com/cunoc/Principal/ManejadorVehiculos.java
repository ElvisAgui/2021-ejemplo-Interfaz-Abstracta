package com.cunoc.Principal;

import com.cunoc.vehiculos.Camioneta;
import com.cunoc.vehiculos.Vehiculo;
import com.cunoc.vehiculos.VehiculoCarga;
import com.cunoc.vehiculos.VehiculoCarrera;
import java.util.ArrayList;

public class ManejadorVehiculos {

    private ArrayList<Vehiculo> Vehiculos = new ArrayList();
    
    public ManejadorVehiculos(){
        VehiculosAlazar();
    }
    public void VehiculosAlazar() {
        for (int i = 0; i < 20; i++) {
            int tipo = random();
            switch (tipo) {
                case 0:
                    Vehiculos.add(new Camioneta("diesel", 250, 15));
                    break;
                case 1:
                    Vehiculos.add(new VehiculoCarga("Gasolina", 15, "semento"));
                    break;
                case 2:
                    Vehiculos.add(new VehiculoCarrera("Gasolina", 300));
                    break;
                default:
                    Vehiculos.add(new VehiculoCarrera("Gasolina", 300));
                    break;
            }
        }
    }

    public int random() {
        int random = (int) (Math.random() * 3);
        return random;
    }
    
    
    public void vehiculos(){
        for (int i = 0; i < Vehiculos.size(); i++) {
            imprimir(Vehiculos.get(i));
        }
    }

    public void imprimir(Vehiculo tipo) {
        if (tipo instanceof Camioneta) {
            System.out.println("\n\n-----------------Tipo de vehiculo Camioneta-----------------------\n\n");
            tipo.acciones();
        }
        if (tipo instanceof VehiculoCarga) {
            System.out.println("\n\n-------------------Vehiculo de Carga------------------------------\n\n");
            tipo.acciones();
        }
        if (tipo instanceof VehiculoCarrera) {
            System.out.println("\n\n-------------------Vehiculo de Carreras------------------------------\n\n");
            tipo.acciones();
        }

    }

}
