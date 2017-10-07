/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package carcomposition;

public class ElectricMotor extends Engine {
    private double governmentGrant = 400.00; 
    
    public ElectricMotor(double weight_, double price_, int power_) {
        super(weight_, price_, power_);
    }

    void setPower(double power_) {
        System.out.println("The power of an electric motor can not be changed");
        return;
    }

    double getPrice() {
        return super.getPrice() - governmentGrant;
    }
}
