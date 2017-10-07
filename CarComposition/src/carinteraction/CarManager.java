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

    public void startDemo() {
        Engine anEngine = new DieselEngine(3100.00, 120);
        car1 = new Car(24000.00, anEngine);

        double price = car1.getPrice(); 
        System.out.println("car1, price: " + price);

        GasolineEngine anEngine2 = new GasolineEngine(3400.00, 140);
        car2 = new Car(28000.00, anEngine);

        price = car2.getPrice();
        System.out.println("car2, price: " + price);

        anEngine2.setTuningLevel(3);
        price = car2.getPrice();
        System.out.println("car2, price: " + price);

        Engine anEngine3 = new ElectricMotor(2700.00, 100);
        car3 = new Car(24000.00, anEngine3);
        price = car3.getPrice();
        System.out.println("car3, price: " + price);

        // illegal: anEngine3 = new Engine(1234.00, 60); 
        
        return;
    }
}
