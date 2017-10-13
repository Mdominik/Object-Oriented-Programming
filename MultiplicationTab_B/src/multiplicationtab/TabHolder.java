/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplicationtab;

public class TabHolder {

    private int[][] table;

    private TabHolder() {
    }

    TabHolder(int row, int column) {
        table = new int[row][column];
    }

    public int getTabValue(int row, int column) {
        return table[row][column];
    }

    public void setTabValue(int value, int row, int column) {
        table[row][column] = value;
    }

    void printTab() {
        for (byte i = 0; i < table.length; i++) {
            System.out.print('>');
            for (byte j = 0; j < table[i].length; j++) {
                System.out.printf(" %4d", getTabValue(i,j));
            }
            System.out.println();
        }
        System.out.println();
    }

}
