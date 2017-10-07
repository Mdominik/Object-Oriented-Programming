/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package listexample;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.Scanner;

public class ListExample {

    public static void main(String[] args) {
        final int dtCount = 5;
        Scanner consoleInput = new Scanner(System.in);
        try {
            ArrayList<DataTransfer> myList = new ArrayList<DataTransfer>(dtCount);
            // LinkedList<DataTransfer> myList = new LinkedList<DataTransfer>();
            DataTransfer dto;
            System.out.println("storing objects ");
            for (int i = 0; i < dtCount; i++) {
                dto = createDataTransfer(i);
                dto.printDT();
                myList. . . . // add to the end of the list
            }
            System.out.println("accessing objects in reverse order");
            for (int i = myList.size() - 1; i >= 0; i--) {
                dto = myList. . . . . 
                dto.printDT();
            }
            System.out.println(" . . . done");

            dto = createDataTransfer(42);
            System.out.print("Enter a position index (integer >= 0): ");
            int index = consoleInput.nextInt();
            myList. . . . . // add to position, shift the rest the list 
            System.out.println("accessing objects 0-4");
            for (int i = 0; i <= 4; i++) {
                System.out.print("Index i: " + i + ", ");
                dto = myList. . . . 
                dto.printDT();
            }
            System.out.println(" . . . done");
            System.out.println("using an iterator: ");
            Iterator<DataTransfer> listIter =  . . . . . ;  // get iterator for myList
            while (listIter.hasNext()) {
                dto = listIter . . . . . 
                dto.printDT();
                if (dto.testValue_1 % 2 == 1) {  // use the iterator to remove an 
                    listIter . . . .   // object from myList if testValue_1 is odd
                }
            }
            System.out.println(" . . . done . . and for-each . . . ");
            for (DataTransfer aDto : myList) {
                aDto.printDT();
            }
            System.out.println(" . . . done");

        } catch (Exception ex) {
            System.out.print("Exception while accessing List");
            ex.printStackTrace();
            System.out.flush();
        }

    }

    static DataTransfer createDataTransfer(int n) {
        float testValue = 99 * (float) Math.random();
        DataTransfer dt = new DataTransfer(n, testValue);
        return dt;
    }
}
