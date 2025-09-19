package parcial_2;

import java.util.Scanner;
public class arreglos_tarea2 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int reprobadas=0;
        String reprobatorias = "";
        System.out.print("Ingrese el número de calificaciones: ");
        int n = sc.nextInt();

        double[] calificaciones = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese la calificación " + (i + 1) + ": ");
            calificaciones[i] = sc.nextDouble();
        }

        float suma = 0;
        double max = calificaciones[0];
        double min = calificaciones[0];

        for (int i = 0; i < calificaciones.length; i++) {
            suma += calificaciones[i];
            if (calificaciones[i] > max) {
                max = calificaciones[i];
            }
            if (calificaciones[i] < min) {
                min = calificaciones[i];
            }
            if(calificaciones[i] < 7){
                reprobadas++;
                reprobatorias += calificaciones[i] + " ";
            }
        }

        double promedio = suma / calificaciones.length;

        System.out.println("\n=== CALIFICACIONES CAPTURADAS ===");
        for (double i : calificaciones) {
            System.out.print(i + " ");
        }
        System.out.println("\nPromedio: " + promedio);
        System.out.println("Calificación máxima: " + max);
        System.out.println("Calificación mínima: " + min);

        if (reprobadas > 0) {
            System.out.println("Número de calificaciones reprobatorias: " + reprobadas);
            System.out.println("Calificaciones reprobatorias: " + reprobatorias);
        } else {
            System.out.println("No hubo calificaciones reprobatorias");
        }

        sc.close();
    }
    
}
