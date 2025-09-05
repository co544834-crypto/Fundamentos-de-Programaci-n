Algoritmo areas
	Definir area Como Real
	Escribir "1= cuadrado"
	Escribir "2= triangulo"
	Escribir "3= rectangulo"
	Escribir "4= circulo"
	Escribir "Seleccione la opcion (1-4)"
	Leer opc
	
	Segun opc Hacer
		Caso "1":
			Escribir "Ingrese el valor del lado: "
			Leer l
			area<- l*l
			Escribir "El area es: ", area
		Caso "2":
			Escribir "Ingrese la base: "
			Leer b
			Escribir "Ingrese la altura: "
			leer a
			area<- b*a/2
			Escribir "El area es: ", area
		Caso "3":
			Escribir "Ingrese la base: "
			Leer b
			Escribir "Ingrese la altura: "
			leer a
			area<- b*a
			Escribir "El area es: ", area
		Caso "4":
			Escribir "Ingrese el radio: "
			leer r
			area<- PI*r*r
			Escribir "El area es: ", area
		De Otro Modo:
			Escribir "No existe la opcion"
	FinSegun
FinAlgoritmo
