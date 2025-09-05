Algoritmo sin_titulo
	escribir "ingrese velocidad"
	Leer velocidad
	escribir "Es cumpleaños del conductor"
	Leer cumpleaños
	Si cumpleaños=='NO' Entonces
		
		Si velocidad<=60 Entonces
			escribir "0= sin multa"
		SiNo
			
			Si velocidad >=61 y velocidad <=80
				escribir "1=multa pequeña"
			SiNo 
				escribir "2=multa grande"
			FinSi
		FinSi
		SiNo escribir "No hay multa"
FinSi	
FinAlgoritmo
