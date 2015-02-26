#!/bin/bash

JAVA_OPTS="-Xms512m -Xmx512m -XX:MaxPermSize=128m"
JMX_OPTS="-Dcom.sun.management.jmxemote -Dcom.sun.management.jmxremote.port=8898 -Dcom.sun.management.jmxremote.ssl=false -Dcom.sun.management.jmxremote.authenticate=false"
PORT=8088
BASE_DIR=/opt/embeddedapps/${project.build.finalName}
JAR_FILE=$BASE_DIR/${project.build.finalName}-${project.version}-war-exec.jar
cd $BASE_DIR
exec java $JAVA_OPTS $JMX_OPTS -jar $JAR_FILE -httpPort $PORT -Dbase.dir="$BASE_DIR"
