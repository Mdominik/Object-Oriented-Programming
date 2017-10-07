/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package carcomposition;

public class Engine {

    private double weight;
    private double basePrice;
    private int power;

    Engine(double weight_, double price_, int power_) {
        weight = weight_;
        basePrice = price_;
        power = power_;
    }

    // package access
    double getWeight() {
        return weight;
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
