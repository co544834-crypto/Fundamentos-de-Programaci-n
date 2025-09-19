package parcial_2;

import java.util.Scanner;

public class ejer3_tarea {
    public static void intercambiar(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Dentro del método -> a: " + a + ", b: " + b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;

        do {
           
            System.out.print("Ingrese el valor de x (0 para salir): ");
            x = sc.nextInt();

            System.out.print("Ingrese el valor de y (0 para salir): ");
            y = sc.nextInt();

            if (x == 0 || y == 0) {
            System.out.println("fin.");
            break;
            }

            System.out.println("Antes del método -> x: " + x + ", y: " + y);

            intercambiar(x, y);

            System.out.println("Después del método -> x: " + x + ", y: " + y);

        } while (true); 
    }
}

