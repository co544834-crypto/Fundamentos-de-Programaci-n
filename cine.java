import java.util.Scanner;
public class cine {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Introduce el número de personas: ");
        int personas = sc.nextInt();

        System.out.print("Introduce el día de la semana (1-7): ");
        int dia = sc.nextInt();

        System.out.print("¿Cuenta con membresía? (true/false): ");
        boolean membresia = sc.nextBoolean();

        double precioTotal = 0;

        switch (dia) {
            case 3: 
                precioTotal = personas * 30;
                break;
            case 4: 
                int parejas = personas / 2;
                int sobrante = personas % 2;
                precioTotal = (parejas * 75) + (sobrante * 50);
                break;
            default: 
                precioTotal = personas * 50;
        }

        if (membresia) {
            precioTotal = precioTotal * 0.9;
        }

        System.out.println("El precio total es: " + precioTotal);

        sc.close();
    }
    
}
