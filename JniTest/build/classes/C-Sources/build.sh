#/bin/bash

# adapt paths and file names to your settings: 

export JAVA_HOME=/opt/Java/jdk1.8.0_20/

gcc -I $JAVA_HOME/include \
    -I $JAVA_HOME/include/linux \
    -shared -fPIC \
    -Wl,-soname,sensors.so \
    -o libsensors.so sensors.c

# Copy the lib into a library directory.
# The path must be provided to the java
# virtual machine (s. file runJniTest.sh)

cp -p libsensors.so /opt/Java/JniLib


