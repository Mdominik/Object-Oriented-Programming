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
            for (byte j = 1; j<= columns; j++) {
                System.out.print(i*j);
                System.out.print("\t");
            }
            System.out.println();
        } 
        System.out.println("---- done ----");
    }
}
