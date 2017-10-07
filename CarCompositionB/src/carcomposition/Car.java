/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package carcomposition;

public class Car {

    double basePrice;
    Engine theEngine;
    Wheelset theWheelset;

    public Car(double price, Engine anEngine, Wheelset aWheelset) {
        basePrice = price; 
        theEngine = anEngine;
        theWheelset = aWheelset;
    }

    public double getPrice() {
        double price = basePrice;
        price += theEngine.getPrice();
        price += theWheelset.getPrice();
        return price;
    }
}
