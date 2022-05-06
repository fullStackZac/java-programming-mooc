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

public class Suitcase {
    private ArrayList<Item> suitcase;
    private int maxCaseWeight;
    
    public Suitcase(int maxCaseWeight) {
        this.maxCaseWeight = maxCaseWeight;
        this.suitcase = new ArrayList<>();
    }
    
    public void addItem(Item item) {
        if((item.getWeight() + totalWeight()) <= this.maxCaseWeight) {
            this.suitcase.add(item);
        }
    }
    
    public void printItems() {
        for(Item item: suitcase) {
            System.out.println(item);
        }
    }
    
    public int totalWeight() {
        int actualWeight = 0;
        
        for(Item item: this.suitcase) {
            actualWeight += item.getWeight();
        }
        return actualWeight;
    }
    
    public Item heaviestItem() {
        if(this.suitcase.isEmpty()) {
            return null;
        }
        
        Item heaviestItem = this.suitcase.get(0);
        for(Item item: this.suitcase) {
            if(item.getWeight() >= heaviestItem.getWeight()) {
                heaviestItem = item;
            }
        }
        return heaviestItem;
    }
    
    public String toString() {
        if(this.suitcase.size() == 0) {
            return "no items (0 kg)";
        }else if(this.suitcase.size() == 1) {
            return this.suitcase.size() + " item (" + totalWeight() + " kg)";
        }else {
            return this.suitcase.size() + " items (" + totalWeight() + " kg)";
        }
    }
}
