package parcial_2;
import java.util.Scanner;

public class eje2_tarea {
    public static class Caja { int valor;}

public static class ParametrosReferencia {
    public static void duplicar(Caja c) {
        c.valor = c.valor * 2; // modificamos atributo del objeto
        System.out.println("Dentro del método: " + c.valor);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         Caja miCaja = new Caja();

        if (miCaja.valor == 0) {
            System.out.println("fin.");
            return;
        }
       
        do {
            System.out.print("Ingrese un número: ");
            miCaja.valor = sc.nextInt();
            System.out.println("Antes de llamar al método: " + miCaja.valor);
            duplicar(miCaja);
            System.out.println("Después de llamar al método: " + miCaja.valor);

            System.out.print("Ingrese un nuevo número (0 para salir): ");
            miCaja.valor = sc.nextInt();

        } while (miCaja.valor != 0);

    }
}
}
