/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestor.de.stock;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Igna
 */
public class Stock {
    private ArrayList<ItemStock> items= new ArrayList<>();

    //GET & SETS
    public ArrayList<ItemStock> getItems() {
        return items;
    }

    public void setItems(ArrayList<ItemStock> items) {
        this.items = items;
    }
    
    public List consultarItemsFaltantes( int cantidadMaxima){
        List resultado= new ArrayList<>();
        
        for(int i=0;i<items.size();i++){
            if(items.get(i).getCantidad()<cantidadMaxima){
                resultado.add(items.get(i));
            }
        }
        return resultado;
    }
    
    
}
