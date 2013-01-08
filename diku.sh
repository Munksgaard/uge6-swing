#!/bin/sh

cd ./bin

jar cvf ../diku.jar $(find -name "DIKU*")
jar uvf ../diku.jar $(find ./diku)
