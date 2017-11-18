/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package carcomposition;

public abstract class Engine {

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

    private double basePrice;
    private int power;

    Engine(double price_, int power_) {
        basePrice = price_;
        power = power_;
    }

    double getPrice() {
        return getBasePrice();
    }

    int getPower() {
        return power;
    }

    void setPower(int power_) {
        power = power_;
        return;
    }
}
