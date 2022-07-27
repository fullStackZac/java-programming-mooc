/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zacharychildress
 */

import java.util.ArrayList;

public class Box implements Packable {
    
    private double maxCapacity;
    private ArrayList<Packable> items;
    
    public Box(double maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.items = new ArrayList<>();
    }
    
    public void add(Packable item) {
        if(weight() + item.weight() <= this.maxCapacity) {
            this.items.add(item);
        }
    }
    
    public int totalItems() {
        return this.items.size();
    }
    
    public double weight() {
        double boxWeight = 0.0;
        
        for(Packable item: this.items) {
            boxWeight += item.weight();
        }
        
        return boxWeight;
    }
    
    @Override
    public String toString() {
        return "Box: " + totalItems() + " items, total weight " + weight() + " kg";
    }
}
