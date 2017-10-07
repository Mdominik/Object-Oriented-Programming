/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package primenumbers;

public class PrimeNumbers {

    public static void main(String[] args) {
      
        int candidate = 3; 
        int divisor = 2;
        int limit = 10000; 
        
        while (candidate < limit){
            int divLimit = // what is the greates divisor to test candidate? 
            boolean isPrime = true; 
            for (divisor = 2; divisor <= divLimit // . . . ){
                // test if candidate is prime or not
                // if not, take a note in variable isPrime      
            }
            if(isPrime){ // if there was no divisor dividing candiate without remainder 
                System.out.println("found prime: " + candidate);
            }
            // . . . 
        }     
        
    }
}
