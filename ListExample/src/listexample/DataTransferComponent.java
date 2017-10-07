/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package listexample;

import java.io.Serializable;

public class DataTransferComponent {
    String name = "no name object";
    byte tag; 
    
    public DataTransferComponent(){
        tag = -1;
    }
    
    public DataTransferComponent(String name_, byte flag_){
        name = name_;
        tag = flag_;
    }
    
     public void printDTC(){
        System.out.print("  Component - name: " + name);
        System.out.println(";  tag: " + tag);
    }
    
}
