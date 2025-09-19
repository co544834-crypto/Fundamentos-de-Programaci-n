package parcial_2;
import java.util.Scanner;
public class arreglos_tarea3 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] estudiantes = new String[5];

        System.out.println("=== REGISTRO DE ESTUDIANTES ===");
        for (int i = 0; i < estudiantes.length; i++) {
            System.out.print("Ingresa el nombre del estudiante " + (i + 1) + ": ");
            estudiantes[i] = sc.nextLine();
            
        }

        System.out.println("\n=== Lista de estudiantes ===");
        for (String nombre : estudiantes) {
            int caracteres = nombre.length();
            String convertido;

            // Verificar si todo está en minúsculas o mayúsculas
            if (nombre.equals(nombre.toLowerCase())) {
                convertido = nombre.toUpperCase();
            } else if (nombre.equals(nombre.toUpperCase())) {
                convertido = nombre.toLowerCase();
            } else {
                convertido = nombre; 
            }

            System.out.println("- " + nombre + " (caracteres: " + caracteres + 
                               ") -> Convertido: " + convertido);
        }

       
        System.out.print("\nIngresa el nombre a buscar: ");
        String buscado = sc.nextLine();
        boolean encontrado = false;

        for (String nombre : estudiantes) {
            if (nombre.equalsIgnoreCase(buscado)) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("El estudiante " + buscado + " está en la lista.");
        } else {
            System.out.println("El estudiante " + buscado + " no fue encontrado.");
        }

        sc.close();
    }
}

