/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package carinteraction;

import carcomposition.*;
import carheadlights.*;
import java.io.*;
import java.util.*;
import java.util.Scanner;

public final class CarManager {
    //private final int carCount = 20;

    Car[] myCars = new Car[5];

    public static void main(String[] args) {
        CarManager myCarManager = new CarManager();
        myCarManager.createCars();
        myCarManager.saveCarsPrintStream();
        myCarManager.readCarsPrintStream();
        myCarManager.saveCarsObjectStream();
        myCarManager.readCarsObjectStream();
        myCarManager.saveCarsDataStream();
        myCarManager.readCarsDataStream();
        
    }

    public void createCars() {
        for (int i = 0; i < myCars.length; i++) {
            Engine anEngine = createRandomEngine();
            Headlight aHeadlight = createRandomHeadlight();
            Car myCar = createRandomCar(anEngine, aHeadlight);
            myCars[i] = myCar;
            myCars[i].printCar();
        }
        return;
    }

    public void saveCarsPrintStream() {
        PrintStream prStream = null;
        String currentDir = new File(".").getAbsolutePath();
        System.out.println(currentDir);
        try {
            FileOutputStream fos = new FileOutputStream("carFile.dat");
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            prStream = new PrintStream(bos);
            for (int i = 0; i < myCars.length; i++) {
                myCars[i].saveCarPS(prStream);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        if (prStream != null) {
            prStream.close();
        }
        System.out.println(" --------- cars saved to file ------- ");
        return;
    }

    public void readCarsPrintStream() {
        Scanner inScanner;
        System.out.println(" hit return to proceed . . . ");
        try {
            int tmp = System.in.read();
            FileInputStream fis = new FileInputStream("carFile_Read.dat");
            BufferedInputStream bis = new BufferedInputStream(fis);
            inScanner = new Scanner(bis);
            try {
                System.out.println(" -- reading cars from file:  carFile_Read.dat");
                inScanner.useLocale(Locale.US);
                int i = 0; 
                while (inScanner.hasNext() && i < myCars.length) {
                    double bPrice = inScanner.nextDouble();
                    double ePrice = inScanner.nextDouble();
                    int ePower = inScanner.nextInt();
                    Engine anEngine = createRandomTypeEngine(ePrice, ePower);
                    Headlight aHeadlight = createRandomHeadlight();
                    myCars[i] = new Car(bPrice, anEngine, aHeadlight);
                    myCars[i].printCar();
                    i++;
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            } finally {
                inScanner.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void saveCarsObjectStream() {
        String currentDir = new File(".").getAbsolutePath();
        System.out.println(currentDir);
        ObjectOutputStream carObjectStream = null;
        try {
            FileOutputStream fos = new FileOutputStream("carObjectFile.dat");
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            carObjectStream = new ObjectOutputStream(bos);
            try {
                for (int i = 0; i < myCars.length; i++) {
                    carObjectStream.writeObject(myCars[i]);
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            } finally {
                carObjectStream.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println(" --- cars saved to file carObjectFile.dat --- ");
        return;
    }

    public void readCarsObjectStream() {
        String currentDir = new File(".").getAbsolutePath();
        System.out.println(currentDir);
        ObjectInputStream carObjectStream = null;
        System.out.println(" hit return to proceed . . . ");    
        try {
            int tmp = System.in.read();
            FileInputStream fis = new FileInputStream("carObjectFile.dat");
            carObjectStream = new ObjectInputStream(fis);
            System.out.println(" -- reading cars from file:  carObjectFile.dat");
            Car aCar = null;
            for(int i = 0; i < myCars.length; i++) {
                myCars[i] = (Car) carObjectStream.readObject();
                myCars[i].printCar();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        try {
            if (carObjectStream != null) {
                carObjectStream.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println(" --- done --- ");
        return;
    }
    
    public void saveCarsDataStream() {
        String currentDir = new File(".").getAbsolutePath();
        System.out.println(currentDir);
        DataOutputStream carDataStream = null;
        System.out.println(" hit return to proceed . . . ");    
        try {
            int tmp = System.in.read();
            FileOutputStream fos = new FileOutputStream("carDataFile.dat");
            BufferedOutputStream bis = new BufferedOutputStream(fos);
            carDataStream = new DataOutputStream(fos);
            System.out.println(" -- writing cars to file:  carDataFile.dat");
            for(int i = 0; i < myCars.length; i++) {
                myCars[i].saveCarDS(carDataStream);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        try {
            if (carDataStream != null) {
                carDataStream.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println(" --- done --- ");
        return;
        
    }
    
     public void readCarsDataStream() {
        Scanner inScanner;
        System.out.println(" hit return to proceed . . . ");
        try {
            int tmp = System.in.read();
            FileInputStream fis = new FileInputStream("carDataFile.dat");
            BufferedInputStream bis = new BufferedInputStream(fis);
            DataInputStream carDataStream = new DataInputStream(bis);
            try {
                System.out.println(" -- reading cars from file:  carDataFile.dat");
                int i = 0; 
                while ((carDataStream.available() > 0) &&(i < myCars.length)) {
                    double bPrice = carDataStream.readDouble();
                    double ePrice = carDataStream.readDouble();
                    int ePower = carDataStream.readInt();
                    Engine anEngine = createRandomTypeEngine(ePrice, ePower);
                    Headlight aHeadlight = createRandomHeadlight();
                    myCars[i] = new Car(bPrice, anEngine, aHeadlight);
                    myCars[i].printCar();
                    i++;
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            } finally {
                carDataStream.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }


    Car createRandomCar(Engine anEngine, Headlight aHeadlight) {
        Car aCar;
        double price = 20000 + 5000 * Math.random();
        aCar = new Car(price, anEngine, aHeadlight);
        return aCar;
    }

    Headlight createRandomHeadlight() {
        Headlight aHeadlight;
        String lightType;
        int randomVal = (int) Math.round(9 * Math.random());
        int type = (int) Math.round(Math.random());
        switch (type) {
            case 0:
                lightType = "SMD-" + Integer.toString(randomVal + 101);
                aHeadlight = new LedHeadlight(lightType);
                break;
            case 1:
                lightType = "H-" + Integer.toString(randomVal + 1);
                aHeadlight = new BulbHeadlight(lightType);
                break;
            default:
                System.out.print("unexpected random value in createRandomHeadlight");
                aHeadlight = new BulbHeadlight("default bulb");
        }
        return aHeadlight;
    }

    Engine createRandomEngine() {
        Engine anEngine;
        double price = 2000 + 500 * Math.random();
        int randNum = (int) Math.round(50 * Math.random());
        int power = 100 + randNum;
        anEngine = createRandomTypeEngine(price, power);
        return anEngine;
    }

    Engine createRandomTypeEngine(double price, int power) {
        Engine anEngine;
        int type = (int) Math.round(2 * Math.random());
        switch (type) {
            case 0:
                anEngine = new GasolineEngine(price, power);
                break;
            case 1:
                anEngine = new DieselEngine(price, power);
                break;
            case 2:
                anEngine = new ElectricMotor(price, power);
                break;
            default:
                System.out.print("unexpected random value in createRandomEngine");
                anEngine = new GasolineEngine(price, power);
        }
        return anEngine;
    }
}
