#!/bin/sh

# A shell script for unpacking a submission.
#
# v.1.2.
#
# The script finds all the jar files in the current directory and extracts them
# to directories with the same name. For instance, if you have the file
# A.0.HCOE.PN.jar in your working directory, the script creates a folder
# A.0.HCOE.PN and extracts the jar file into that directory.

FILES=$(find ./ -maxdepth 1 -name *.jar)

for FILE in ${FILES}
do
  DIRECTORY=${FILE%".jar"}
  mkdir -p ${DIRECTORY}
  cd ${DIRECTORY}
  jar xvf ".${FILE}"
done
