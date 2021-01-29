#! /bin/bash

MESSAGE=$1

git add -u *

git add * 

git commit -m " $MESSAGE"

git push

