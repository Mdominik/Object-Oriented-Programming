/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package carcomposition;

public abstract class Engine {

    private double basePrice;
    private int power;

    Engine(double price_, int power_) {
        basePrice = price_;
        power = power_;
    }

    double getPrice() {
        return basePrice;
    }

    int getPower() {
        return power;
    }

    void setPower(int power_) {
        power = power_;
        return;
    }
}
