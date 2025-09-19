package parcial_2;

import java.util.Scanner;

public class arreglos_tarea1 {
      public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int suma=0;
        System.out.print("Ingrese el número de calificaciones: ");
        int n = sc.nextInt();

        int[] calificaciones = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese la calificación " + (i + 1) + ": ");
            calificaciones[i] = sc.nextInt();
        }

       System.out.println("\n" + "CALIFICACIONES: ");
       for (int i : calificaciones) {
       System.out.print(i + " | ");
}
       for (int i=0; i<calificaciones.length; i++){
       suma += calificaciones[i];
}
      int total= calificaciones.length;
      System.out.println("\n"+"Total de calificaciones " + total);float promedio=suma/total;
      System.out.println("El promedio de las calificaciones es " +promedio);
}
}

   

