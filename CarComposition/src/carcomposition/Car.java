/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package carcomposition;

public class Car {

    /**
     * @return the basePrice
     */
    public double getBasePrice() {
        return basePrice;
    }

    /**
     * @param basePrice the basePrice to set
     */
    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    /**
     * @return the theEngine
     */
    public Engine getTheEngine() {
        return theEngine;
    }

    /**
     * @param theEngine the theEngine to set
     */
    public void setTheEngine(Engine theEngine) {
        this.theEngine = theEngine;
    }

    private double basePrice;
    private Engine theEngine;
    

    public Car(double basePrice, Engine anEngine) {
        this.basePrice = basePrice; 
        theEngine = anEngine; 
    }

    public double getPrice() {
        double price = getBasePrice();
        price += getTheEngine().getPrice();
        return price;
    }
}
