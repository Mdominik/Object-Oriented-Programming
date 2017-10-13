/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package primenumbers;

public class PrimeNumbers {

    public static void main(String[] args) {
      
        int candidate = 3; 
        int divisor = 2;
        int limit = 100; 
        
        while (candidate < limit){
            int divLimit = candidate/2;
            boolean isPrime = true; 
            for (divisor = 2; divisor <= divLimit; divisor++){
                if(candidate % divisor == 0)
                    isPrime = false;    
            }
            if(isPrime){ // if there was no divisor dividing candiate without remainder 
                System.out.println("found prime: " + candidate);
            }
            candidate++;
        }     
        
    }
}
