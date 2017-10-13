package multiplicationtab;

import java.util.Scanner;

public class MultiplicationTab {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter number of columns (< 128):  ");
        byte columns = in.nextByte();
        System.out.printf("Enter number of rows (< 128):  ");
        byte rows = in.nextByte();

        for (byte i = 1; i <= rows; i++) {
            for (byte j = 1; j <= columns; j++) {
                System.out.printf("  %3d", i * j);
            }
            System.out.println();
        }

        System.out.println();
        System.out.println(" ---- now storing table in array ----");
        System.out.println();

        TabHolder aTabHolder = new TabHolder(rows, columns);

        for (byte i = 1; i <= rows; i++) {
            for (byte j = 1; j <= columns; j++) {
                aTabHolder.setTabValue(j*i, i-1, j-1);
            }
        }
        aTabHolder.printTab();
        
        System.out.println();
        System.out.println(" ---- now access first row of table ----");
        System.out.println();
        System.out.print("first row: ");
        for (byte i = 0; i < columns; i++) {
            int value = aTabHolder.getTabValue(0,i);
            System.out.printf(" %3d", value);
        }
        System.out.println(); 
        System.out.println("---- done ----");
    }
}
