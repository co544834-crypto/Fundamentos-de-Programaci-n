package parcial_2;
import java.util.Scanner;
public class eje1_tarea {
     
    public static void duplicar(int numero) {
        numero = numero * 2;
        System.out.println("Dentro del método: " + numero);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;

        do {
             System.out.print("Ingrese un número: ");
            x = sc.nextInt();

            System.out.println("Antes de llamar al método: " + x);
            duplicar(x);
            System.out.println("Después de llamar al método: " + x);
           
        } while (x != 0);

}
        
}
    
