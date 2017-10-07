#/bin/bash

# adapt paths and file names to your settings: 

export JAVA_HOME=/opt/Java/jdk1.8.0_20 
 

# Note: The path -Djava.library.path must point to the
# directory where the file libsensors.so lives. 

$JAVA_HOME/bin/java -Djava.library.path=/opt/Java/JniLib \
   -jar dist/JniTest.jar

# jnitest.JniTest





