package parcial_2;
import java.util.Scanner;
public class arreglos_tarea4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Ingrese el número de estudiantes: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        
        String[] nombres = new String[n];
        int[] edades = new int[n];
        double[] promedios = new double[n];

        System.out.println("\n=== REGISTRO DE ESTUDIANTES ===");
        for (int i = 0; i < n; i++) {
            System.out.print("Nombre del estudiante " + (i + 1) + ": ");
            nombres[i] = sc.nextLine();

            System.out.print("Edad de " + nombres[i] + ": ");
            edades[i] = sc.nextInt();

            System.out.print("Promedio de " + nombres[i] + ": ");
            promedios[i] = sc.nextDouble();
            sc.nextLine(); 
            System.out.println();
        }

        // Mostrar tabla de datos
        System.out.println("\n=== LISTADO DE ESTUDIANTES ===");
        System.out.printf("%-20s %-10s %-10s %-15s %-15s\n", 
                          "Nombre", "Edad", "Promedio", "Caracteres", "Conversión");
        System.out.println("--------------------------------------------------------------------------");

        for (int i = 0; i < n; i++) {
            int caracteres = nombres[i].length();
            String convertido;

            // Cambiar mayúsculas/minúsculas según el caso
            if (nombres[i].equals(nombres[i].toLowerCase())) {
                convertido = nombres[i].toUpperCase();
            } else if (nombres[i].equals(nombres[i].toUpperCase())) {
                convertido = nombres[i].toLowerCase();
            } else {
                convertido = nombres[i]; 
            }

            System.out.printf("%-20s %-10d %-10.2f %-15d %-15s\n", 
                              nombres[i], edades[i], promedios[i], caracteres, convertido);
        }

        
        System.out.print("\nIngresa el nombre a buscar: ");
        String buscado = sc.nextLine();
        boolean encontrado = false;

        for (String nombre : nombres) {
            if (nombre.equalsIgnoreCase(buscado)) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println(" El estudiante " + buscado + " está en la lista.");
        } else {
            System.out.println(" El estudiante " + buscado + " no fue encontrado.");
        }

        sc.close();
    }
}


    


