Algoritmo PARES
	Definir a, b, c, ab, bc, ac, resu Como Entero
	// datos
	Escribir 'Ingrese el valor a'
	Leer a
	Escribir 'Ingrese el valor b'
	Leer b
	Escribir 'Ingrese el valor c'
	Leer c
	// operaciones para calcular la sumas de pares
	ab <- a+b
	bc <- b+c
	ac <- a+c
	Si ab=10 O bc=10 O ac=10 Entonces
		resu <- 10
	SiNo
		Si ab=bc+10 O ab=ac+10 Entonces
			resu <- 5
		SiNo
			resu <- 0
		FinSi
	FinSi
	Escribir 'el resultado es: ', resu
FinAlgoritmo
