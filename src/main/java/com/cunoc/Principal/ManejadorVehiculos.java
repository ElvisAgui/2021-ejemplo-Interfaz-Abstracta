
package com.cunoc.Principal;

import com.cunoc.vehiculos.Camioneta;
import com.cunoc.vehiculos.Vehiculo;
import java.util.ArrayList;


public class ManejadorVehiculos {
    
    private ArrayList<Vehiculo> Vehiculos = new ArrayList();
    
    
    
    public void VehiculosAlazar(){
        
        
        for (int i = 0; i < 20; i++) {
            
            Vehiculos.add(new Camioneta("diesel",250,15));
            
        }
    }
    
}
