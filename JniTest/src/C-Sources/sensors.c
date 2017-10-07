
#include "sensors.h"

JNIEXPORT jint JNICALL Java_jnitest_SensorProxy_getSensorValueJni
                       (JNIEnv * jniEnvPtr, jclass jClass, jbyte sensorId){

    printf("\n    This is the C function  . . . getSensorValueJni() " );
    printf("\n    argument: %d \n\n", sensorId);  
    fflush(stdout);
    return 100 + sensorId;  
};

JNIEXPORT jint JNICALL Java_jnitest_SensorProxy_setActorValueJni
               (JNIEnv *jniEnvPtr, jclass jClass, jbyte actor_id, jint actor_value){
  printf("\n    This is the C function  . . . setActorValueJni() " );
  printf("\n    arguments: %d, %d \n\n", actor_id, actor_value);
    return actor_id + actor_value;  

}
