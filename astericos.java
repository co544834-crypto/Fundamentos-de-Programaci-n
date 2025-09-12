import java.util.Scanner;
public class astericos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Ingrese el número de líneas: ");
        n = sc.nextInt();

        //Cuadro
        System.out.println("\nCuadro");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        //Triángulo invertido
        System.out.println("\nTriángulo invertido");
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        //Pirámide 
        System.out.println("\nPirámide");
        for (int i = 1; i <= n; i++) {
            // espacios
            for (int k = 1; k <= n - i; k++) {
                System.out.print(" ");
            }
            // asteriscos
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        
    }
}
