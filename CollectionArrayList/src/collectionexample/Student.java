/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package collectionexample;

import java.io.Serializable; 
        
public class Student implements Serializable {
    public static String[] fNames = new String[]{
                       "Mia", "Emma", "Hannah", "Sofia", "Anna",
                       "Ben", "Luca", "Paul", "Jonas", "Finn"};
    public static String[] lNames = new String[]{
                       "Mueller", "Schmidt", "Schneider", "Fischer", "Weber",
                       "Meyer", "Wagner", "Becker", "Schulz", "Hoffmann"};
    
    String firstName;
    String lastName;
    int matriculationNumber;

    Student(int matricNum) {
        firstName = pickRandomFirstName();
        lastName = pickRandomLastName();
        matriculationNumber = matricNum;
    }

    public void print() {
        System.out.print("Student: " + firstName);
        System.out.print(", " + lastName);
        System.out.println(", " + matriculationNumber);
    }

     String pickRandomFirstName() {
        int index = (int) (fNames.length * Math.random());
        return fNames[index];
    }

    String pickRandomLastName() {
        int index = (int) (lNames.length * Math.random());
        return lNames[index];
    }
    
}
