package parcial_2;

import java.util.Scanner;

public class ejer4_tarea {
   

public static class Persona {
    String nombre;
    int edad;

    Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
}

public static class EjercicioReferencia {
    // Método que aumenta la edad de la persona
    public static void cumplirAnios(Persona p) {
        p.edad += 1;
        System.out.println("Dentro del método -> " + p.nombre +
                " tiene ahora " + p.edad + " años");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        int edad;

        do {
           
            System.out.print("Ingrese el nombre (o 'salir' para terminar): ");
            nombre = sc.next();

            if (nombre.equalsIgnoreCase("salir")) {
                System.out.println("finalizado por el usuario.");
                break;
            }

            System.out.print("Ingrese la edad (0 para terminar): ");
            edad = sc.nextInt();

        
            if (edad == 0) {
                System.out.println("fin");
                break;
            }

            // Crear objeto Persona
            Persona persona1 = new Persona(nombre, edad);

    
            System.out.println("Antes del método -> " + persona1.nombre +
                    " tiene " + persona1.edad + " años");

           
            cumplirAnios(persona1);

            
            System.out.println("Después del método -> " + persona1.nombre +
                    " tiene " + persona1.edad + " años");

        } while (true); 
    }
}
}
