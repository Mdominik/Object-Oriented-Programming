/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptiontest;

public class BlueException extends Exception{
    int exValue; 
    
    BlueException(int value){
        exValue = value; 
    }
}
