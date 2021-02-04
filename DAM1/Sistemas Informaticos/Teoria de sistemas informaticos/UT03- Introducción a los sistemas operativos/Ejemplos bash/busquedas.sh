#! /bin/bash

print_help ()
{
	echo Puede ejecutar los siguientes comandos:
	echo "     count [FILE] [TEXT]"
	echo "     find [INPUT_FILE] [OUTPUT_FILE] [TEXT]"
}

if [[ $# -eq 0 ]]
then
	echo Introduzca el comando: count, rm o find
else
	COMMAND=$1
	if [[ $COMMAND == "count" ]]
	then
		if [[ $# -eq 3 ]]
		then
			FILE=$2
			TEXT=$3
			cat $FILE | grep $TEXT | wc -l
		else
			echo count necesita dos opciones
		fi
	elif [[ $COMMAND == "find" ]]
	then
		if [[ $# -eq 4 ]]
		then
			FILE=$2
			OUTPUT_FILE=$3
			TEXT=$4
                	cat $FILE | grep $TEXT > ${OUTPUT_FILE}
		else
			echo find necesita 3 opciones
		fi
	elif [[ $COMMAND == "--help" ]]
	then
		print_help
	else
		echo Comando invalido
	fi
fi
