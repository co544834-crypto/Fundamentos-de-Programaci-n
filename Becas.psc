Algoritmo Becas
	Definir edad Como Entero
	Definir promedio Como Real
	Definir beca Como Entero
	Escribir 'Ingresa tu edad:'
	Leer edad
	Escribir 'Ingresa tu promedio:'
	Leer promedio
	beca <- 0
	Si edad>=18 Entonces
		Si promedio>=9 Entonces
			beca <- 2000
		SiNo
			Si promedio>=7.5 Y promedio<=8.9 Entonces
				beca <- 1000
			SiNo
				Si promedio>=6 Y promedio<=7.5 Entonces
					beca <- 500
				FinSi
			FinSi
		FinSi
	SiNo
		Si promedio>=9 Entonces
			beca <- 3000
		SiNo
			Si promedio<9 Y promedio>8 Entonces
				beca <- 2000
			SiNo
				Si promedio<=8 Y promedio>6 Entonces
					beca <- 100
				FinSi
			FinSi
		FinSi
	FinSi
	Si beca>0 Entonces
		Escribir 'Felicidades, tu beca es de: ', beca
	SiNo
		Escribir 'no aplicas.'
	FinSi
FinAlgoritmo
