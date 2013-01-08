#!/bin/sh

# A shell script for cleaning up the ./bin subdirectory.
#
# v.1.1.

if [ -d "bin" ];
then
  rm -r ./bin
fi
mkdir ./bin
