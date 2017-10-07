/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package carcomposition;

public class GasolineEngine extends Engine {

    public GasolineEngine(double price_, int power_) {
        super(price_, power_);
    }

    public double getPrice() {
        return super.getPrice();
    }
    
     public String getType(){
         return "GasolineEngine"; 
     }
}
