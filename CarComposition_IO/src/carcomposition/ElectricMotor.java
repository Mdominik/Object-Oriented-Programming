/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package carcomposition;

public class ElectricMotor extends Engine {
    private double governmentGrant = 400.00; 
    
    public ElectricMotor(double price_, int power_) {
        super(price_, power_);
    }

    public double getPrice() {
        return super.getPrice(); //  - governmentGrant;
    }
    
     public String getType(){
         return "ElectricMotor "; 
     }
}
