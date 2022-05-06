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

public class Hold {
    private int maximumWeight;
    private ArrayList<Suitcase> hold;
    
    public Hold(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.hold = new ArrayList<>();
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if(suitcase.totalWeight() + totalWeight() <= this.maximumWeight) {
            this.hold.add(suitcase);
        }
    }
    
    public int totalWeight() {
        int actualWeight = 0;
        
        for(Suitcase suitcase: hold) {
            actualWeight = actualWeight + suitcase.totalWeight();
        }
        return actualWeight;
    }
    
    public void printItems() {
        for(Suitcase suitcase: hold) {
            suitcase.printItems();
        }
    }
    
    public String toString() {
        return this.hold.size() + " suitcases (" + totalWeight() + " kg)";
    }
}
