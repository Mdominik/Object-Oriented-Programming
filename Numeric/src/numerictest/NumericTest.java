/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package numerictest;

public class NumericTest {

    public static void main(String[] args) {
        integerTest();
        floatTest();
        intFloatTest();
    }

    public static void integerTest() {
        System.out.println("\nintegerTest() ");
        int big_1 = 12345;
        int big_2 = 54321;
        long result = big_1 * big_2;
        System.out.print("int:   " + big_1 + " * " + big_2);
        System.out.println("  =   " + result);

        result = (long) big_1 * big_2;
        System.out.print("long:  " + big_1 + " * " + big_2);
        System.out.println("  =   " + result);

        big_1 = 123456;
        big_2 = 654321;
        result = big_1 * big_2;
        System.out.print("int:  " + big_1 + " * " + big_2);
        System.out.println(" =  " + result);

        result = (long) big_1 * big_2;
        System.out.print("long: " + big_1 + " * " + big_2);
        System.out.println(" = " + result);
        return;
    }

    public static void floatTest() {
        System.out.println("\nfloatTest() ");
        float big_1 = 1.23456e20f;
        float big_2 = 6.54321e20f;
        double result = big_1 * big_2;
        System.out.print("float:  " + big_1 + " * " + big_2);
        System.out.println(" =  " + result);


        result = (double) big_1 * big_2;
        System.out.print("double: " + big_1 + " * " + big_2);
        System.out.println(" =  " + result);
        return;
    }

    public static void intFloatTest() {
        System.out.println("\nintFloatTest() ");
        float big_1 = 123456f;
        float big_2 = 654321f;
        double result = big_1 * big_2;
        System.out.print("float: " + big_1 + " * " + big_2);
        System.out.println(" =  " + result);

        int bigInt_1 = 123456;
        int bigInt_2 = 654321;
        long resultLong = (long) bigInt_1 * bigInt_2;
        System.out.print("long:    " + bigInt_1 + " * " + bigInt_2);
        System.out.println("   =   " + resultLong);

        System.out.println("difference: " + (result - resultLong));
        return;
    }
}
