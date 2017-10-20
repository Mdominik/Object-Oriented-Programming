/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentsubjects;

/**
 *
 * @author martin
 */
public class Subject {
    
    private static String[] firstPart = {"Applied ", "Theoretical ", "Empircal ",
        "Insane ", "Lost ", "General "};
    private static String[] secondPart = {"Computer ", "Rocket ", "Fashion ",
        "Health ", "Soccer ", "Live "};
    private static String[] thirdPart = {"Science ", "Myths ", "Truth ",
        "Wisdom ", "Studies", "Rumors"};
    String name;
    int ects;
    
    Subject() {
        
    }
    
    static Subject createRandomSubject() {
        Subject newSubject = new Subject();
        int index = randomIndex(firstPart.length - 1);
        newSubject.name = firstPart[index];
        index = randomIndex(secondPart.length - 1);
        newSubject.name += secondPart[index];
        index = randomIndex(thirdPart.length - 1);
        newSubject.name += thirdPart[index];
        newSubject.ects = index + 1;        
        return newSubject;
    }
    
    void print() {
        System.out.print(" Subject: " + name + ", ECTS: " + ects);
    }
    
    static int randomIndex(int max) {
        int rand = (int) Math.round(Math.random() * max);
        return rand;
    }
    
}
