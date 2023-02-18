
## Ejercicio 1
```shell
## OPCION IF
#!/bin/bash

read -rep $'Dime un numero del 1 al 3:\n' numero

if ! [[ "$numero" =~ ^[0-9]+$ ]] || ! [[ "$numero" -ge 1 ]] || ! [[ "$numero" -le 3 ]]
then
	echo "Numero incorrecto"
else
	echo "Has elegido el numero: $numero"
fi


## OPCION CASE CON IF
#!/bin/bash

read -rep $'Dime un numero del 1 al 3:\n' numero

if ! [[ "$numero" =~ ^[0-9]+$ ]] || ! [[ "$numero" -ge 1 ]] || ! [[ "$numero" -le 3 ]]
then
	echo "Numero incorrecto"
else
	case $numero in
		1|2|3)
			echo "Has elegido el numero $numero";;
		*)
			echo "Numero incorrecto";;
	esac
fi




## OPCION CASE SIN IF

#!/bin/bash

read -rep $'Dime un numero del 1 al 3:\n' numero
	
case $numero in
	1|2|3)
		echo "Has elegido el numero $numero";;
	*)
		echo "Numero incorrecto";;
esac

```

## Ejercicio 2

```shell
#!/bin/bash
if ! [[ $# -ge 2 ]]
then
	echo "Error. Has introducido menos de 2 parametros."
fi
```

## Ejercicio 3

```shell
#!/bin/bash
ruta=$1

if [[ $# -ne 1 ]]
then
        echo "Introduce un solo argumento. Saliendo..."
        exit 2
else
        cd $ruta
        ficheros=(`ls *.txt`)
        numero_de_ficheros=${#ficheros[@]}
        echo "Borrando ficheros..."
        for ((i=0;i<$numero_de_ficheros;i++))
        do
                rm ${ficheros[i]}
        done
        ls -l $ruta
fi
```

## Ejercicio 4
```shell
#!/bin/bash
array_opciones=("1. Crear Fichero" "2. Copiar fichero" "3. Borrar fichero" "4. Salir")

echo "### MENU ###"
for opcion in "${array_opciones[@]}"
do
	echo "- $opcion"
done
echo $'\n'

read -rep $'Selecciona una opcion:\n' numero

if ! [[ "$numero" =~ ^[0-9]+$ ]] || ! [[ "$numero" -ge 1 ]] || ! [[ "$numero" -le 4 ]]
then
	echo -e "\nError, selecciona una opcion correcta."
else
	case $numero in
		1)
			echo -e "\nSe ha creado el fichero correctamente."
			;;
		2)
			echo -e "\nSe ha copiado el fichero correctamente."
			;;
		3)
			echo -e "\nSe ha borrado el fichero correctamente."
			;;
		4)
			echo -e "\nSaliendo..."
			;;
		*)
			echo "\nError, selecciona una opcion correcta.";;
	esac
fi
```


## Ejercicio 5
```shell
#!/bin/bash
array_numeros=(1 1 2 3 5)

suma_array (){
	numero_elementos_array=${#array_numeros[@]}
	for (( i=0 ; i < $numero_elementos_array ; i++ ))
	do
		(( suma = suma + ${array_numeros[i]} ))
	done
	echo $suma
}

resultado=$(suma_array)
echo "La suma de los elementos del array es: $resultado"
```

## Ejemplo Ambito Variables

```shell
#!/bin/bash

declare a="fuera"
declare -r b="fuera"
c="fuera"


funcion()
{
        declare d="dentro"
        local e="dentro"
        f="dentro"
        echo "------- funcion -------"
        echo "Dentro de funcion a: $a"
        echo "Dentro de funcion b: $a"
        echo "Dentro de funcion c: $c"
        echo "Dentro de funcion d: $d"
        echo "Dentro de funcion e: $e"
        echo "Dentro de funcion f: $f"
        echo "----- salgo funcion ---"
}
funcion
echo "----------------------"
echo "Fuera de funcion a: $a"
echo "Fuera de funcion b: $a"
echo "Fuera de funcion c: $c"
echo "Fuera de funcion d: $d"
echo "Fuera de funcion e: $e"
echo "Fuera de funcion f: $f"
echo "------- FIN ----------"
```