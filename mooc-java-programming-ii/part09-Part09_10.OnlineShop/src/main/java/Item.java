/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zacharychildress
 */



public class Item {
    private String item;
    private int quantity;
    private int unitPrice;

    public Item(String item, int quantity, int unitPrice) {
        this.item = item;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }
    
    public int price() {
        return this.quantity * this.unitPrice;
    }
    
    public void increaseQuantity() {
        this.quantity++;
    }
    
    @Override
    public String toString() {
        return this.item + ": " + this.quantity; 
    }
}