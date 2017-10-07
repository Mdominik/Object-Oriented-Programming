/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package carcomposition;

public class Car {

    double basePrice;
    Engine theEngine;

    public Car(double basePrice, Engine anEngine) {
        this.basePrice = basePrice; 
        theEngine = anEngine; 
    }

    public double getPrice() {
        double price = basePrice;
        price += theEngine.getPrice();
        return price;
    }
}
