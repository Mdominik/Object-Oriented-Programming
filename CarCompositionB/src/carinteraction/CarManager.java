/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package carinteraction;

import carcomposition.*;

public class CarManager {
    Car car1;
    Car car2; 
    Car car3;
      
    public static void main(String[] args) {
        CarManager myCarManager = new CarManager();
        myCarManager.startDemo(); 
        
    }
    
    public void startDemo(){
        GasolineEngine anEngine = new GasolineEngine(294.25, 3198.00, 120); 
        Wheelset aWheelset = new Wheelset(398.00); 
        car1 = new Car(24596.00, anEngine, aWheelset);
        
        double price = car1.getPrice();
         System.out.println("car1, price: " + price);
         
         anEngine = new GasolineEngine(294.25, 3198.00, 120);
         aWheelset = new Wheelset(298.00);
         car2 = new Car(28799.00, anEngine, aWheelset);
         
         price = car2.getPrice();
         System.out.println("car2, price: " + price);
         
         anEngine.setTuningLevel(3);
         price = car2.getPrice();
         System.out.println("car2, price: " + price);
         
         Engine anEngine3 = new ElectricMotor(294.25, 3198.00, 120); 
         aWheelset = new Wheelset(398.00);
         car3 = new Car(24596.00, anEngine3, aWheelset);
         price = car3.getPrice();
         System.out.println("car3, price: " + price);
         
        return; 
    }
    
    
}
