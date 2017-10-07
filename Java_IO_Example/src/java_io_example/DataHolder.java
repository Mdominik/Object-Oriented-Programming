/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_io_example;

import java.io.Serializable; 

public class DataHolder implements Serializable {

    public int dataID;
    public double temperature;
    public String name;
    // public short testShort = 1234;
    // public float testFloat = 5.678f; 

    public DataHolder(){
        
    }
    
    public DataHolder(int dataID_, double temperature_, String name_) {
        dataID = dataID_;
        temperature = temperature_;
        name = name_;

    }
    
    

    public void print() {
        System.out.print("DataHolder: ");
        System.out.print(name + ",  ");
        System.out.print(dataID + ", ");
        System.out.printf("%5.2f \n", temperature);

    }


}
