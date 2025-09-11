Algoritmo sc_ej1_ciclo
	
	definir mes Como Entero
	definir op Como Caracter
	Repetir 
		Escribir "Ingresa un mes (1-12)"
		Leer mes
		
		Segun mes Hacer
			caso 1: escribir "Enero:31"
			caso 2: escribir "Febrero:28"
			caso 3: escribir "Marzo:31"
			caso 4:escribir "Abril:30"
			caso 5: escribir "Mayo:31"
			caso 6: escribir "Junio:30"
			caso 7: escribir "Julio:30"
			caso 8: escribir "Agosto:31"
			caso 9: escribir "Septiembre:30"
			caso 10: escribir "Octubre:31"
			caso 11: escribir "Noviembre:30"
			caso 12: escribir "Diciembre:31"
			De Otro Modo:
					Escribir "El mes no existe"
			FinSegun
			
			Escribir "Quieres consultar otro mes(Si/No):"
			Leer op
		
	Hasta Que op = "No"
	
FinAlgoritmo
