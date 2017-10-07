#/bin/bash

# adapt paths and file names to your settings: 

export SENSOR_CP=/home/martin/Vorl/OOPR/Coding/JniTest/build/classes

export JAVA_HOME=/opt/Java/jdk1.8.0_20/

$JAVA_HOME/bin/javah -classpath $SENSOR_CP jnitest.SensorProxy



