/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package carcomposition;

import java.io.Serializable;

public abstract class Engine implements Serializable {

    private double basePrice;
    private int power;

    public Engine(double price_, int power_) {
        basePrice = price_;
        power = power_;
        
    }

    public double getPrice() {
        return basePrice;
    }
    
    public int getPower() {
        return power;
    }
    
    public abstract String getType();
        
    public void printEngine(){
        System.out.print("engine type: " + getType());
        System.out.print("  power: " + power);
        System.out.printf("  price: %4.2f\n", getPrice());
        return;
    }
    
}
