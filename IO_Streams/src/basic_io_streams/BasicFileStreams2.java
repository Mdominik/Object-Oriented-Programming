/*
 * To change this template, choose Tools | Templates
 * and open the template bReader the editor.
 */
package basic_io_streams;

import java.io.*;

public class BasicFileStreams2 {

    public static void main(String[] args) throws IOException {
        // 1. Reading input by lines:
        String currentDir = new File(".").getAbsolutePath();
        System.out.println(currentDir);
        FileReader fReader = new FileReader("testFile.txt");
        BufferedReader bReader = new BufferedReader(fReader);
        int readCount = 0;
        char[] inChars = new char[200];
        int i = 0;
        while (readCount >= 0) {
            readCount = bReader.read(inChars);
            System.out.println("readCount: " + readCount);
            // if (readCount == -1) {
            //     break;
            // }
            System.out.println("Length of inChars: " + inChars.length );
            for (i = 0; i < inChars.length; i++) {
                System.out.print(inChars[i]);
            }
            System.out.println();
        }
        bReader.close();
        String inputString = new String(inChars);
        System.out.println(inputString);
        return;
    }
}
