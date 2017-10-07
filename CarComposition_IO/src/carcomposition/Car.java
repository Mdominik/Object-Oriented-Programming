/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package carcomposition;

import carheadlights.Headlight;
import java.io.PrintStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.Serializable;

public class Car implements Serializable {

    public double basePrice;
    Engine theEngine;
    Headlight theHeadlight;
    // transient Headlight theHeadlight;

    public Car(double basePrice, Engine anEngine) {
        this.basePrice = basePrice;
        theEngine = anEngine;
    }

    public Car(double basePrice, Engine anEngine, Headlight aHeadlight) {
        this(basePrice, anEngine);
        theHeadlight = aHeadlight;
    }

    public double getPrice() {
        // double price = basePrice;
        // price += theEngine.getPrice();
        return basePrice;
    }

    public void printCar() {
        double price = getPrice();
        System.out.printf("car price: %5.2f \n    ", price);
        theEngine.printEngine();
        System.out.print("    ");
        if(theHeadlight != null){
            theHeadlight.printHeadlight();
        } else{
            System.out.println(" no headlight ");
        }
        return;
    }
    
    public void saveCarPS(PrintStream prStream){
        prStream.print(basePrice);
        prStream.print(" ");
        double ePrice = theEngine.getPrice();
        prStream.print(ePrice);
        prStream.print(" ");
        int ePower = theEngine.getPower();
        prStream.print(ePower);     
        prStream.println(" ");
    }
    
    public void saveCarDS(DataOutputStream dtStream)throws IOException {
        dtStream.writeDouble(basePrice);
        double ePrice = theEngine.getPrice();
        dtStream.writeDouble(ePrice);
        int ePower = theEngine.getPower();
        dtStream.writeInt(ePower);     
    }
    
}
