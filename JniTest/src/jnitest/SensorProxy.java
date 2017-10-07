/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jnitest;

public class SensorProxy {

    static {
        System.loadLibrary("sensors");
    }

    public static int getSensorValue(byte sensorId) {
        return 42;
    }

    public static native int getSensorValueJni(byte sensorId);
    
    public static native int setActorValueJni(byte actorId, int value);
    
}
