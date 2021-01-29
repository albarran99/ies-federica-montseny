#! /bin/bash

MESSAGE=$1

git add -A *

git add * 

git commit -m " $MESSAGE"

git push

