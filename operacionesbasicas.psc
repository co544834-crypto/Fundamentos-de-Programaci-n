Algoritmo operacionesbasicas
	Definir num1, num2 Como Entero
	Definir sim Como Caracter 
	Definir res Como Real
	Escribir "Ingresa el primer valor: "
	Leer num1 
	Escribir "Ingresa el segundo valor: "
	Leer num2
	Escribir "Ingresa el simbolo de la operacion a realizar (+, -, *, /): "
	Leer sim
	
	Segun sim Hacer
		Caso " + ":
			res<-num1+num2
			Escribir "La suma es: " ,res
		Caso " - ":
			res<-num1-num2
			Escribir "La resta es: " ,res
		Caso " * ":
			res<-num1*num2
			Escribir "La multiplicaci�n es: " ,res
		Caso " / ":
			Si num2 = 0 Entonces
				Escribir "Erro de division por cero"
			SiNo
				res<-num1/num2
				Escribir "La divisi�n es: " ,res
			FinSi
			
		De Otro Modo:
			Escribir "Operaci�n no valida"
			
	FinSegun
	
	
FinAlgoritmo
