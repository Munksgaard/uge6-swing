#!/bin/sh

# A shell script for building documentation of Java(TM) programs.
#
# v. 1.1.
#
# The script assumes the existance of the subdirectory ./src. The subdirectory
# ./doc is created if it does not exist.
#
# The script runs javadoc on all the .java files in the subdirectory ./src,
# with destination ./doc.
#
# The build succeeded if no errors were reported.

mkdir -p doc

javadoc \
  -d ./doc \
  $(find ./src -name "*.java")
