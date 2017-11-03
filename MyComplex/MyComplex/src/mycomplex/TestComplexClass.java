/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycomplex;
import java.util.Random;
/**
 *
 * 
 */
public class TestComplexClass {
    TestComplexClass() {
    }
    final int numberOfComplex = 10;
    static MyComplex[] complex = new MyComplex[10];
    static MyComplex[] anotherComplex = new MyComplex[10];
    Random random = new Random();
    
    public void generateComplexNumbers(MyComplex[] complex_, MyComplex[] anotherComplex_) {
        for(int i=0; i < numberOfComplex; i++) {
            complex_[i].setReal(random.nextDouble()*200-100.0);
            complex_[i].setImag(random.nextDouble()*200-100.0);
            anotherComplex_[i].setReal(random.nextDouble()*200-100.0);
            anotherComplex_[i].setImag(random.nextDouble()*200-100.0);
        }        
    }
    
    public void iterateOverArray(MyComplex[] complex_, MyComplex[] anotherComplex_) {
        for(int i=0; i < numberOfComplex; i++) {
            System.out.println("Testing add(): " + complex_[i].add(anotherComplex_[i]));//testAdd()
            System.out.println("Testing subtract(): " + complex_[i].subtract(anotherComplex_[i]));//testSubtract()
            System.out.println("Testing multiply(): " + complex_[i].multiply(anotherComplex_[i]));//testMultiply()
            System.out.println("Testing divide(): " + complex_[i].divide(anotherComplex_[i]));//testDivide()
            System.out.println("Testing conjugate(): " + complex_[i].conjugate()); //testconjugate()
            System.out.println("\n");
        }
    }
    public static void main(String[] args) {
        TestComplexClass test = new TestComplexClass();
        test.generateComplexNumbers(complex, anotherComplex);
        test.iterateOverArray(complex, anotherComplex);
    }
    

}

