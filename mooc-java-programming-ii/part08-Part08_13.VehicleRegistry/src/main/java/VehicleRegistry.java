/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zacharychildress
 */
import java.util.HashMap;
import java.util.ArrayList;

public class VehicleRegistry {
    
    private HashMap<LicensePlate, String> registry;
    
    public VehicleRegistry() {
        this.registry = new HashMap<>();
    }
    
    public boolean add(LicensePlate licensePlate, String owner) {
        for(LicensePlate plate : this.registry.keySet()) {
            if(plate.equals(licensePlate)) {
                return false;
            }
        }
        this.registry.put(licensePlate, owner);
        return true;
    }
    
    public String get(LicensePlate licensePlate) {
        if(this.registry.containsKey(licensePlate)) {
            return this.registry.get(licensePlate);
        }
        return null;
    }
    
    public boolean remove(LicensePlate licensePlate) {
        if(this.registry.containsKey(licensePlate)) {
            this.registry.remove(licensePlate);
            return true;
        }
        return false;
    }
    
    public void printLicensePlates() {
        for(LicensePlate lp : this.registry.keySet()) {
            System.out.println(lp);
        }
    }
    
    public void printOwners() {
        ArrayList<String> unique = new ArrayList<>();
        
        for(String owner : this.registry.values()) {
            if(unique.contains(owner)) {
                continue;
            }
            unique.add(owner);
        }
        for(String uniqueOwner : unique) {
            System.out.println(uniqueOwner);
        }
    }
}
