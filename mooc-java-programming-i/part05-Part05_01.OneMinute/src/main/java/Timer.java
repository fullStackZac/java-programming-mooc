/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zacharychildress
 */
public class Timer {
    ClockHand hundreths = new ClockHand(100);
    ClockHand seconds = new ClockHand(60);
    
    public Timer() {       
    }
    
    public void advance() {
        this.hundreths.advance();
        
        if(this.hundreths.value() == 0) {
            this.seconds.advance();
        }
    }
    
    public String toString() {
        return seconds.toString() + ":" + hundreths.toString();
    }
}
