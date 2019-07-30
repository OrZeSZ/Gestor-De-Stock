/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestor.de.stock;

import java.util.Date;

/**
 *
 * @author Igna
 */
public class ItemStock {
    private Computadora computadora;
    private int cantidad;
    private Date ultimaFechaModificacion;
    
    
    public ItemStock(Computadora c, int cantidad){
        
    }
    
    
    
    
    // GETS AND SETS
    public Computadora getComputadora() {
        return computadora;
    }

    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
    
}// END ItemStock
