import java.util.Scanner;
public class Verif65icar_edad{
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int edad;
        System.out.print("Ingresa una edad: ");
        edad = leer.nextInt();

        if (edad < 18) {
            System.out.println("Es menor de edad");
        } else {
            if (edad >= 65) {
                System.out.println("Adulto Mayor");
            } else {
                System.out.println("Mayor de edad");
            }
        }

        leer.close();
    }
}


