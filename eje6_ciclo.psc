Algoritmo eje6_ciclo
	Definir mem Como Logico
	Definir pare, sobra Como Entero
	Definir op Como Caracter
	
	Repetir
		Escribir "Ingrese el numero de personas: "
		Leer per
		Escribir "Ingrese el dia(1-7): "
		Leer dia
		Escribir "Tiene membresia?(1=si, 0=no): "
		Leer mem
		
		precioT<-0
		
		Segun dia Hacer
			caso 3:
				precioT<- per *30
			caso 4:
				pare<- per /2
				sobra<- per % 2
				precioT<- (parejas * 75) + (sobra * 50)
			De Otro Modo:
				precioT<- per * 50
				
		FinSegun
		
		Si mem = Verdadero Entonces
			precioT<- precioT * 0.9
		FinSi
		
		Escribir "Precio total: " ,precioT
		
		Escribir "Quieres continuar(Si/No): "
		Leer op
	Hasta Que op = "No"
	
FinAlgoritmo
