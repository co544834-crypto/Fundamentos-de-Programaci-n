Algoritmo eje4_ciclo
	Definir op Como Caracter
	Repetir
		Escribir "Ingrese una hora(1-24, no se permiten minutos): "
		Leer h 
		
		Segun h Hacer
			Caso 6,7,8,9,10,11,12:
				Escribir "Buenos dias"
			Caso 13,14,15,16,17,18,19,20:
				Escribir "Buenas tardes"
			Caso 21,22,23,24,1,2,3,4,5:
				Escribir "Buenas noches"			
			De Otro Modo:
				Escribir "No hay mensaje"						
		FinSegun
		Escribir "Quiere ingresar otra hora(Si/No):"
		Leer op
	Hasta Que op = "No"
	
FinAlgoritmo
