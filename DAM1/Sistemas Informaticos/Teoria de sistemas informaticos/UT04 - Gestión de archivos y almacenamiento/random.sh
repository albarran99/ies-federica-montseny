#! /bin/bash

NUM_FILES=$1
PREFIX=$2

if [[ $# -ne 2 ]]; then
       echo Debe pasar dos argumentos: numero archivos y prefijo	
else
	WORDS=$( cat /usr/share/dict/words | sort -R | head -1024 )
	for n in $( seq 1 $NUM_FILES ) ; do
		echo $WORDS | tr " " "\n" | sort -R | head -128 | awk 'NR%3{printf "%s ",$0;next}{print;}' > $PREFIX$( printf %03d "$n" ).txt
	done
fi
