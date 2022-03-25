/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Derick
 */
public class Gauge {
    
    private int value;
    
    public Gauge() {
        this.value = 0;
    }
    
    // methods
    
    public void increase() {
        if (value < 5) {
            value += 1;
        }
    }  // increase method ends  
    
    public void decrease() {
        if (value > 0) {
            value -=1;
        }
    } // decrease method ends
    
    public int value() {
        return value;
    }
    
    public boolean full() {
        if (value == 5) {
            return true;
        } else {
            return false;
        }
    } // boolean method ends
}
