/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptiontest;

 class RedException extends Exception{
    String exText;
    
    RedException(String text){
        exText = text; 
    }
}
