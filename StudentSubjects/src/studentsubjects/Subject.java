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
    private String name;
    private int ects;
    
    Subject() {
        
    }
    
    static Subject createRandomSubject() {
        Subject newSubject = new Subject();
        int index = randomIndex(getFirstPart().length - 1);
        newSubject.setName(getFirstPart()[index]);
        index = randomIndex(getSecondPart().length - 1);
        newSubject.setName(newSubject.getName() + getSecondPart()[index]);
        index = randomIndex(getThirdPart().length - 1);
        newSubject.setName(newSubject.getName() + getThirdPart()[index]);
        newSubject.setEcts(index + 1);        
        return newSubject;
    }
    
    void print() {
        System.out.print(" Subject: " + getName() + ", ECTS: " + getEcts());
    }
    
    static int randomIndex(int max) {
        int rand = (int) Math.round(Math.random() * max);
        return rand;
    }

    /**
     * @return the firstPart
     */
    public static String[] getFirstPart() {
        return firstPart;
    }

    /**
     * @param aFirstPart the firstPart to set
     */
    public static void setFirstPart(String[] aFirstPart) {
        firstPart = aFirstPart;
    }

    /**
     * @return the secondPart
     */
    public static String[] getSecondPart() {
        return secondPart;
    }

    /**
     * @param aSecondPart the secondPart to set
     */
    public static void setSecondPart(String[] aSecondPart) {
        secondPart = aSecondPart;
    }

    /**
     * @return the thirdPart
     */
    public static String[] getThirdPart() {
        return thirdPart;
    }

    /**
     * @param aThirdPart the thirdPart to set
     */
    public static void setThirdPart(String[] aThirdPart) {
        thirdPart = aThirdPart;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the ects
     */
    public int getEcts() {
        return ects;
    }

    /**
     * @param ects the ects to set
     */
    public void setEcts(int ects) {
        this.ects = ects;
    }
    
}
