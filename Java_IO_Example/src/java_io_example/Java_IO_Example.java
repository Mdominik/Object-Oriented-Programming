/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_io_example;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.DataOutputStream;
import java.io.PrintStream;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author martin
 */
public class Java_IO_Example {

    DataHolder[] dataObjects = new DataHolder[10];
    Scanner consoleInput = new Scanner(System.in);
    String dataStreamFileName   = "dataStreamFile.dat";
    String objectStreamFileName = "objectStreamFile.dat";
    String printStreamFileName  = "printStreamFile.dat";

    public static void main(String[] args) {
        Java_IO_Example jioe = new Java_IO_Example();
        jioe.initDataObjects();
        jioe.saveDataObjects();
        jioe.readDataObjects();
        return;
    }

    void initDataObjects() {
        for (int i = 0; i < dataObjects.length; i++) {
            int id = i + 10;
            double temp = Math.random() * 30 + 10;
            String dataName = "ABC_ä_Ö_DE_" + Integer.toString((int) temp + 10);
            dataObjects[i] = new DataHolder(id, temp, dataName);
        }
        return;
    }

    void saveDataObjects() {
        boolean working = true;
        while (working) {
            System.out.println("Save DataObjcts to:");
            System.out.println("   DataStream  (d)");
            System.out.println("   ObjctStream (o)");
            System.out.println("   PrintStream (p)");
            System.out.print("   quit (q) . . .  please enter d, o, p or q: ");
            char command = consoleInput.next().charAt(0);
            switch (command) {
                case 'd':
                    saveDataHoldersDataStream();
                    break;
                case 'o':
                    saveDataObjectsObjectStream();
                    break;
                case 'p':
                    saveDataObjectsPrintStream();
                    break;
                case 'q':
                    working = false;
                default:
                    printChoices();
            }
            System.out.println();
        }
        return;
    }

    void saveDataHoldersDataStream() {
        try (DataOutputStream dos = getDataOutputStream(dataStreamFileName)) {
            for (int i = 0; i < dataObjects.length; i++) {
                saveOneDataHolderDataStream(dataObjects[i], dos);
            }
            // dos.close(); // automatically closed on leaving the try - catch block 
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    private DataOutputStream getDataOutputStream(String fileName){
        BufferedOutputStream   // get a BufferedOutputStream
                // create a DataOutputStream
        return dos; 
    }

    void saveOneDataHolderDataStream(DataHolder dataObj, DataOutputStream dos)
            throws IOException {
   
        dos.writeInt(dataObj.dataID);
        // write the other members to the data stream
      

        return;
    }

    void saveDataObjectsObjectStream() {
        try (ObjectOutputStream oos = getObjectOutputStream(objectStreamFileName)){
            oos.writeObject(dataObjects);
            // oos.close(); // automatically closed on leaving the try - catch block 
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private ObjectOutputStream getObjectOutputStream(String fileName) throws IOException{
        BufferedOutputStream // get a BufferedOutputStream
                // create a ObjectOutputStream
        return oos; 
    }
    
    void saveDataObjectsPrintStream() {
        try (PrintStream ps = getPrintStream(printStreamFileName)){
            for (int i = 0; i < dataObjects.length; i++) {
                saveOneDataHolderPrintStream(dataObjects[i], ps);
            }
            // ps.close(); // automatically closed on leaving the try - catch block 
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private PrintStream getPrintStream(String fileName) throws IOException{
        BufferedOutputStream // get a BufferedOutputStream
                // create a PrintStream
        return prs; 
    }
    
    void saveOneDataHolderPrintStream(DataHolder dataObj, PrintStream ps) {
        try {
            ps.print(dataObj.dataID);
            ps.print(" ");
            // save the other memebers to the print stream
            // write a newline after the last memeber 

        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.print("could not save dataHolder: ");
            System.out.println(dataObj.name);
        }
    }

    private BufferedOutputStream getBufferedOutputStream(String fileName) {
        String currentDir = new File(".").getAbsolutePath();
        System.out.println("File: " + currentDir + fileName);
        FileOutputStream fos = null;
        BufferedOutputStream bos = null;
        try {
            fos = // create a new FileOutputStream
            bos = // create a new BufferedOutputStream 
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        if (bos == null) {
            System.out.println("could not open file - stopping program");
            System.exit(1);
        }
        return bos;
    }

    void readDataObjects() {
        boolean working = true;
        while (working) {
            System.out.println("Read DataObjcts from:");
            System.out.println("   DataStream  (d)");
            System.out.println("   ObjctStream (o)");
            System.out.println("   PrintStream (p)");
            System.out.print("   quit (q) . . .  please enter d, o, p or q: ");
            char command = consoleInput.next().charAt(0);
            clearDataHolders();
            switch (command) {
                case 'd':
                    readDataHoldersDataStream();
                    printDataHolders();
                    break;
                case 'o':
                    readDataObjectsObjectStream();
                    printDataHolders();
                    break;
                case 'p':
                    readDataObjectsPrintStream();
                    printDataHolders();
                    break;
                case 'q':
                    working = false;
                default:
                    printChoices();
            }
            System.out.println();
        }
        return;
    }

    void readDataHoldersDataStream() {
        try (DataInputStream dis = getDataInputStream(dataStreamFileName)) {
            int i = 0;
            while (i < dataObjects.length) {
                dataObjects[i] = readOneDataHolderDataStream(dis);
                i++;
            }
            // dis.close();  // automatically closed on leaving the try - catch block 
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private DataInputStream getDataInputStream(String fileName){
        BufferedInputStream // get a BufferedInputStream
            // create a DataInputStream
        return dis; 
    }
    
    DataHolder readOneDataHolderDataStream(DataInputStream dis) throws IOException {
        DataHolder dataObj = null;
        int dataId = dis.readInt();
        // read the other memebers into variables  
        
        dataObj = new DataHolder(dataId, temp, name);
        return dataObj;
    }

    void readDataObjectsObjectStream() {
        try (ObjectInputStream ois = getObjectInputStream(objectStreamFileName)) {
            dataObjects = // read an array of DataHolders from the ObjectInputStream
            // ois.close(); // automatically closed on leaving the try - catch block 
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
    
    private ObjectInputStream getObjectInputStream(String fileName) throws IOException{
        BufferedInputStream // get a BufferedInputStream
            // create a ObjectInputStream
        return ois; 
    }
    
    void readDataObjectsPrintStream() {
        try (Scanner inScanner = getScanner(printStreamFileName)) {
            inScanner.useLocale(Locale.US);
            int i = 0;
            while (i < dataObjects.length) {
                dataObjects[i] = readOneDataHolderPrintStream(inScanner);
                i++;
            }
            // inScanner.close(); // automatically closed on leaving the try - catch block 
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private Scanner getScanner(String fileName){
        BufferedInputStream // get a BufferedInputStream
            // create a Scanner
        return inScanner; 
    }
    
    DataHolder readOneDataHolderPrintStream(Scanner inScanner) throws IOException {
        DataHolder dataObj = null;
        int dataId = inScanner.nextInt();
        // read the other memebers into variables  
        
        dataObj = new DataHolder(dataId, temp, name);
        return dataObj;
    }

    BufferedInputStream getBufferedInputStream(String fileName) {
        String currentDir = new File(".").getAbsolutePath();
        System.out.println("File: " + currentDir + fileName);
        FileInputStream fis = null;
        BufferedInputStream bis = null;
        try {
            fis = // create a new FileInputStream
            bis = // create a new BufferedInputStream 
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        if (bis == null) {
            System.out.println("could not open file - stopping program");
            System.exit(1);
        }
        return bis;
    }

    void printDataHolders() {
        System.out.flush();
        System.out.println(" - - - printing dataHolder - - - ");
        for (int i = 0; i < dataObjects.length; i++) {
            dataObjects[i].print();
        }
        return;
    }

    void clearDataHolders() {
        for (int i = 0; i < dataObjects.length; i++) {
            dataObjects[i] = null;
        }

    }

    void printChoices() {
        System.out.println(" Choices are: ");
        System.out.println("   d - DataStream");
        System.out.println("   o - ObjectStream");
        System.out.println("   p - PrintStream");
        System.out.println("   q - quit)");
        return;
    }
}
