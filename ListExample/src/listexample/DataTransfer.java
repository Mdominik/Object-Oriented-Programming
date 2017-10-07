/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package listexample;

import java.io.Serializable;

public class DataTransfer {
    int   testValue_1 = 1234;
    float testValue_2 = 54.321f; 
    DataTransferComponent component; 
    
    public DataTransfer(int tv_1, float tv_2){
        testValue_1 = tv_1;
        testValue_2 = tv_2;
        byte dtc = (byte) (tv_1% 127);
        String name = "Hello_" + Integer.toString(tv_1);
        component = new DataTransferComponent(name, dtc);
    }
    public void printDT(){
        System.out.print("DataTransfer - testValue_1: " + testValue_1);
        System.out.printf(";  testValue_2: %5.2f", testValue_2);
        component.printDTC();
    }
}
