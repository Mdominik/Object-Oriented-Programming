/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionexample;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

public class CollectionExample {

    static Scanner consoleInput = new Scanner(System.in);
    List<Student> studentList;
   

    public CollectionExample() {
        studentList = new ArrayList<Student>(10);  // use LinkedList alternatively
    }

    public static void main(String[] args) {
        CollectionExample collEx = new CollectionExample();
        collEx.createSaveAndReadData();
    }

    void createSaveAndReadData(){
        System.out.print("Enter number of students to create: ");
        int studCount = consoleInput.nextInt();
        createStudents(studCount);
        saveStudentsToFile();
        studentList . . . .   // remove all elements from the list (one method call) 
        System.out.println("Size of ArrayList after clear(): " + studentList.size());
        readStudentsFromFile(); 
    }
   
    void saveStudentsToFile() {
        String currentDir = new File(".").getAbsolutePath();
        System.out.println("Current Working directory: " + currentDir);
        System.out.print("Enter file name: ");
        String fileName = consoleInput.next();
        ObjectOutputStream oos = null;
        try {
            oos = getObjectOutputStream(fileName);
            oos.writeInt(studentList.size()); // save number of objects first
            for( int i = 0; i < studentList . . . . ;  i++) {
                Student stud = studentList . . . .   // get a reference to a student from the list
                oos.writeObject(stud); // save student 
                stud.print();   
            }
            System.out.println("Saved students to file"); 
        } catch (Exception ex) {
            System.out.println("Error writing file: " + fileName);
        }
        try {
            if (oos != null) {
                oos.close();
            }
        } catch (Exception ex) {
            System.out.println("Error closing file: " + fileName);
        }
        System.out.println("Size of ArrayList: " + studentList.size());
        return;
    }

    ObjectOutputStream getObjectOutputStream(String fileName) throws IOException {
        FileOutputStream fos = new FileOutputStream(fileName);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        return oos;
    }

    void readStudentsFromFile(){
        System.out.print("Enter file name: ");
        String fileName = consoleInput.next();
        ObjectInputStream ois = null;
        try {
            ois = getObjectInputStream(fileName);
            int studentCnt = ois.readInt();   // read number of objects first
            for(int i = 0; i < studentCnt; i++) {
                Student stud = (Student) ois.readObject();
                stud.print();
                studentList. . . . . ;  // add the reference to stud to the list 
            }
            System.out.println("Read students from file"); 
        } catch (Exception ex) {
            System.out.println("Error reading file: " + fileName);
        }
        try {
            if (ois != null) {
                ois.close();
            }
        } catch (Exception ex) {
            System.out.println("Error closing file: " + fileName);
        }
        System.out.println("Size of ArrayList: " + studentList.size());
        return;   
    }
    
    ObjectInputStream getObjectInputStream(String fileName) throws IOException {
        FileInputStream fis = new FileInputStream(fileName);
        BufferedInputStream bis = new BufferedInputStream(fis);
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois;
    }
    
     public void createStudents(int studentCount) {
        Student newStud = null;
        for (int i = 0; i < studentCount; i++) {
            newStud = createStud(i);
            studentList. . . . . . ;
        }
    }

    Student createStud(int i) {
        int matNum = (int) (1000 * Math.random());
        matNum += (i+10) * 1000;
        Student aStudent = new Student(matNum);
        return aStudent;
    } 

}
