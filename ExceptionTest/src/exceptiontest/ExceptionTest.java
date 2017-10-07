package exceptiontest;

import java.util.Scanner;

public class ExceptionTest {

    Scanner consoleInput;

    private ExceptionTest() {
        consoleInput = new Scanner(System.in);
    }

    public static void main(String[] args) {
        ExceptionTest etObject = new ExceptionTest();
        etObject.runExceptionTest();

    }

    private void runExceptionTest() {
        char command = 'x';
        while (command != 'q') {
            System.out.println();
            System.out.print("input a digit or q for quit: ");
            command = consoleInput.next().charAt(0);
            if (command == 'q') {
                break;
            }
            int k = Character.digit(command, 10);
            try {
                fooBar(k);
            } 
            // add a catch clause for each of the colored exceptions
            // an one to catch all other exceptions (four in total). 
            
            
            
        }
        System.out.println("Done - bye bye");
    }

    public void foo(int i) throws BlueException {
        if (i == 3) {
            System.out.println("Throwing BlueException from foo()");
            System.out.flush();
            throw new BlueException(3);
        }
        System.out.println("foo() finishes regularly, i: " + i);
    }

    public void bar(int i) throws RedException {
        if (i == 4) {
            System.out.println("Throwing RedException from bar()");
            System.out.flush();
            throw new RedException("four");
        }
        System.out.println("bar() finishes regularly, i: " + i);
    }

    public void fooBar(int i) throws  Exception { 
        foo(i);
        bar(i);
        if (i == 5) {
            System.out.println("Throwing GreenException from fooBar()");
            System.out.flush();
            Thread.sleep(10);
            throw new GreenException(5.001f);
        }
         if (i == 6) {
            System.out.println("Throwing RuntimeException in fooBar()");
            System.out.flush();
            Thread.sleep(10);
            int k = 1 / (i - 6); 
        }
        foo(i + 1);
        bar(i + 1);
        System.out.println("fooBar() finishes regularly, i: " + i);
        return;
    }

}
