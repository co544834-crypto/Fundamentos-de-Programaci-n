Algoritmo astericos
	definir n,i,j,k Como Entero
	
	Escribir "Ingrese la cantidad de lineas: "
	Leer n
	
	//cuadro
	Para i<- 1 Hasta n Hacer
		Para j<- 1 Hasta n Hacer
			Escribir Sin Saltar"* "			
		FinPara
		Escribir " "
	FinPara
	
	//riangulo inverso
	Para i<- n Hasta i Con Paso -1 Hacer
		Para j<- 1 Hasta  i Hacer
			Escribir Sin Saltar"* "
		FinPara
		Escribir " "
	FinPara
	
	//piramide
	Para i<- 1 Hasta n - i Hacer
		Para k<- 1 Hasta n - 1 Hacer
			Escribir Sin Saltar" " 
		FinPara
		
		Para j<- 1 Hasta (2 * i-1) Hacer
			Escribir Sin Saltar"*"
		FinPara
		Escribir " "
	FinPara
	
FinAlgoritmo
