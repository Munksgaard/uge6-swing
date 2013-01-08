#!/bin/sh

# A shell script for running Java(TM) programs.
#
# v.1.1.
#
# The script assumes the existance of the subdirectory ./bin, and the file
# ./lib/junit-4.10.jar.
#
# The script runs java (the command) with the classpath composed of the ./bin
# subdirectory, and the file ./lib/junit-4.10.jar. The class run by the JVM is
# the first command line argument supplied to the shell script.
#
# For instance, if there exist the files ./bin/Main.class and ./bin/Test.class,
#
# > ./run.sh Main
#
# runs the main method in the Main class, while
#
# > ./run.sh Test
#
# runs the main method in the Test class.
#
# If an argument is not specified, the user is informed of her options (if
# any).

if [ "$1" ];
then
  java -ea -cp ./lib/junit-4.10.jar:./lib/diku.jar:./bin $1
else
  FILES=$(find ./bin -maxdepth 1 -name "*.class" | \
    sed -r 's/.\/bin\/(.*)\.class/.\/run \1/g')
  if [ -n "$FILES" ];
  then
    echo "Please specify a class to run, for instance:"
    echo $FILES
  else
    echo "There seem to be no class files in ./bin..."
  fi
fi
