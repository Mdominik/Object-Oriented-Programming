/*
 * To change this template, choose Tools | Templates
 * and open the template inStream the editor.
 */
package basic_io_streams;

import java.io.*;

/**
 *
 * @author martin
 */
public class BasicFileStreams {
 public static void main(String[] args) throws IOException {
        // 1. Reading input by lines:
        String currentDir = new File(".").getAbsolutePath();
        System.out.println(currentDir); 
        FileInputStream fStream = new FileInputStream("testFile.txt");
        BufferedInputStream inStream = new BufferedInputStream(fStream);
        int inByte;
        byte[] allInBytes = new byte[97];
        int i = 0;
        while (i < allInBytes.length){
            inByte = inStream.read();
            if (inByte == -1){
                break;
            }
            System.out.println(inByte); 
            allInBytes[i] = (byte) inByte; 
            i=i+1;
        }
        inStream.close();
        String inputString = new String(allInBytes);
        System.out.println(inputString); 
        return;
 }
    
    
}
