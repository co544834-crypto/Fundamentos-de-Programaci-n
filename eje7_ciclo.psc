Algoritmo eje7_ciclo
	Definir sabor, tipoChocolate Como Cadena
    Definir precioBase, snacks, precioTotal Como Entero
    Definir nombre Como Logico
	Definir op Como Caracter
	
	Repetir
		Escribir "¿De qué sabor quiere la tarta? (manzana, fresa, chocolate): "
		Leer sabor
		
		Si sabor = "manzana" Entonces
			precioBase <- 200
		Sino
			Si sabor = "fresa" Entonces
				precioBase <- 250
			Sino
				Si sabor = "chocolate" Entonces
					Escribir "¿Qué tipo de chocolate? (negro/blanco): "
					Leer tipoChocolate
					Si tipoChocolate = "negro" Entonces
						precioBase <- 280
					Sino
						precioBase <- 300
					FinSi
				FinSi
			FinSi
		FinSi
		
		Escribir "¿Cuántos snacks desea añadir? (cada uno $25): "
		Leer snacks
		
		Escribir "¿Desea personalizar con un nombre? (1=Sí, 0=No): "
		Leer nombre
		
		precioTotal <- precioBase + (snacks * 25)
		
		Si nombre = Verdadero Entonces
			precioTotal <- precioTotal + 30
		FinSi
		
		Escribir "El precio total de la tarta es: ", precioTotal
		
		Escribir "Quiere continuar(Si/No): "
		Leer op
		
	Hasta Que op = "No"
	
FinAlgoritmo
