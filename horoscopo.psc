Algoritmo horoscopo
	
	Escribir "Ingresa un dia: "
	Leer dia
	Escribir "Ingresa mes de nacimiento(1-12): "
	Leer mes
	
	Segun mes Hacer
		Caso 1:
			Si dia<=20 Entonces
				Escribir "Capricornio"
			SiNo
				Escribir "Acuario"
			FinSi			
		Caso 2:
			Si dia<=18 Entonces
				Escribir "Acuario"
			SiNo
				Escribir "	Piscis"
			FinSi
		Caso 3:
			Si dia<=20 Entonces
				Escribir "Piscis"
			SiNo
				Escribir "Aries"
			FinSi	
		Caso 4:
			Si dia<=20 Entonces
				Escribir "Aries"
			SiNo
				Escribir "Tauro"
			FinSi	
		Caso 5:
			Si dia<=20 Entonces
				Escribir "Tauro"
			SiNo
				Escribir "Gèminis"
			FinSi	
		Caso 6:
			Si dia<=21 Entonces
				Escribir "Gèminis"
			SiNo
				Escribir "	Càncer"
			FinSi	
		Caso 7:
			Si dia<=22 Entonces
				Escribir "Càncer"
			SiNo
				Escribir "Leo"
			FinSi	
		Caso 8:
			Si dia<=23 Entonces
				Escribir "Leo"
			SiNo
				Escribir "Virgo"
			FinSi	
		Caso 9:
			Si dia<=23 Entonces
				Escribir "Virgo"
			SiNo
				Escribir "Libra"
			FinSi	
		Caso 10:
			Si dia<=23 Entonces
				Escribir "Libra"
			SiNo
				Escribir "Escorpio"
			FinSi	
		Caso 11:
			Si dia<=22 Entonces
				Escribir "Escorpio"
			SiNo
				Escribir "Sagitario"
			FinSi	
		Caso 12:
			Si dia<=21 Entonces
				Escribir "Sagitario"
			SiNo
				Escribir "Capricornio"
			FinSi	
		De Otro Modo:
			Escribir "No existe"
	FinSegun
FinAlgoritmo
