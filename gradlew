#!/usr/bin/env sh
##############################################################################
# Gradle start up script for Unix
##############################################################################
APP_NAME="Gradle"
APP_BASE_NAME=`basename "$0"`

# Locate java
if [ -n "$JAVA_HOME" ] ; then
    JAVA_EXEC="$JAVA_HOME/bin/java"
else
    JAVA_EXEC="java"
fi

# Run Gradle wrapper
exec "$JAVA_EXEC" -Xmx64m -Xms64m -cp "gradle/wrapper/gradle-wrapper.jar" org.gradle.wrapper.GradleWrapperMain "$@"
