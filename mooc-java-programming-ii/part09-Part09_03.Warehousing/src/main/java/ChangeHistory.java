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

public class ChangeHistory {
    
    private ArrayList<Double> changeHistory;
    
    public ChangeHistory() {
        this.changeHistory = new ArrayList<>();
    }
    
    public void add(double status) {
        this.changeHistory.add(status);
    }
    
    public void clear() {
        this.changeHistory.clear();
    }
    
    public double maxValue() {
        if(this.changeHistory.isEmpty()) {
            return 0.0;
        }
        
        double maxValue = 0.0;
        
        for(double value: this.changeHistory) {
            if(value > maxValue) {
                maxValue = value;
            }
        }
        return maxValue;
    }
    
    public double minValue() {
        if(this.changeHistory.isEmpty()) {
            return 0.0;
        }
        
        double minValue = this.changeHistory.get(0);
        
        for(double value: this.changeHistory) {
            if(value < minValue) {
                minValue = value;
            }
        }
        return minValue;
    }
    
    public double average() {
        if(this.changeHistory.isEmpty()) {
            return 0.0;
        }
        
        double sum = 0.0;
        int count = 0;
        
        for(double value: this.changeHistory) {
            sum += value;
            count++;
        }
        double average = sum / (double)count;
        return average;
    }
    
    @Override
    public String toString() {
        return this.changeHistory.toString();
    }
}
