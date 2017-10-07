
package jnitest;

import java.lang.reflect.Field; 
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author martin
 */
public class JniTest {

    
    public static void main(String[] args) {
        printLibPath(); 
        SensorProxy sp = new SensorProxy();
        int sensorVal = sp.getSensorValue((byte) 1);
        System.out.printf(" Sensor value from Java method: %d \n\n", sensorVal);
        System.out.printf(" Getting sensor value from native method ");
        sensorVal = sp.getSensorValueJni((byte) 2);
        System.out.printf(" Got value from native method: %d\n", sensorVal);
        System.out.println();
        System.out.printf(" Setting actor value ");
        sp.setActorValueJni((byte)1, 234);
        
    }

    static void printLibPath() {
        try {
            String libPath = System.getProperty("java.library.path");
            System.out.println("java.library.path: " + libPath);
            System.out.flush();
            Thread.sleep(100);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return;
    }

}

/**
     * @param args the command line arguments
     * 
     * When messing around with JNI, one have to set the “java.library.path” 
     * accordingly. Unfortunately the only way is to add a system property 
     * *before* the application is started: java -Djava.library.path=/path/to/libs
     * 
     * Changing the system property later doesn’t have any effect, since the 
     * property is evaluated very early and cached.  But the guys over at jdic 
     * discovered a way how to work around it. It is a little bit dirty – but 
     * hey, those hacks are the reason we all love Java . . . 
     * System.setProperty( "java.library.path", "/path/to/libs" );
     * Field fieldSysPath = ClassLoader.class.getDeclaredField( "sys_paths" );
     * fieldSysPath.setAccessible( true );
     * fieldSysPath.set( null, null );
     
       String libPath = System.getProperty("java.library.path");
        libPath+=":/home/martin/Vorl/OOPR/Coding/JniTest/build/classes/C-Sources";
        System.setProperty("java.library.path", libPath);
        libPath = System.getProperty("java.library.path");
        System.out.println(libPath);
*/
        /* Setting the field sys_paths to null forces the ClassLoader 
         * to (re-) evaluate the SystemProperty "java.library.path".
         * Otherwise a cashed value is used. 
         */
/*
        try {
            Field fieldSysPath = ClassLoader.class.getDeclaredField("sys_paths");
            fieldSysPath.setAccessible(true);
            fieldSysPath.set(null, null);
        } catch (IllegalArgumentException ex) {
            Logger.getLogger(JniTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(JniTest.class.getName()).log(Level.SEVERE, null, ex);
        }
     
*/