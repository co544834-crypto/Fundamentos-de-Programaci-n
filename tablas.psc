Algoritmo tablas
	Definir c, n Como Entero
	
	Repetir
		Escribir "Ingresa un numero(0 para salir):"
		Leer n
		
		si n<>0 Entonces
			Para c<-1 Hasta 10 Con Paso 1 Hacer
				Escribir  n, "x" , c, "=", n * c
			FinPara
		FinSi
		
	Hasta Que n=0
	
FinAlgoritmo
