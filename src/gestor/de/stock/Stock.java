/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestor.de.stock;

import java.util.ArrayList;

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
    
    
    
    
}
