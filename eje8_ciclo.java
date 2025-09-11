import java.util.Scanner;
public class eje8_ciclo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String tipoChocolate;
        int precioBase = 0;
        int precioTotal;
        char op;

        do{
            System.out.print("¿De qué sabor quiere la tarta? (manzana, fresa, chocolate): ");
        String s = sc.next().toLowerCase();

        switch (s) {
            case "manzana":
                precioBase = 200;
                break;
            case "fresa":
                precioBase = 250;
                break;
            case "chocolate":
                System.out.print("¿Qué tipo de chocolate? (negro/blanco): ");
                tipoChocolate = sc.next().toLowerCase();
                if (tipoChocolate.equals("negro")) {
                    precioBase = 280;
                } else {
                    precioBase = 300;
                }
                break;
            default:
                System.out.println("Sabor no válido.");
                sc.close();
                return;
        }

        System.out.print("¿Cuántos snacks desea añadir? (cada uno 25): ");
        int snacks = sc.nextInt();

        System.out.print("¿Desea personalizar con un nombre? (true/false): ");
        boolean nombre = sc.nextBoolean();

        precioTotal = precioBase + (snacks * 25);
        if (nombre) {
            precioTotal += 30;
        }

        System.out.println("El precio total de la tarta es: " + precioTotal);

        System.out.println("Quiere pedir otra tarta(S/N): ");
        op=sc.next().charAt(0);

        }while (op == 'S');

        sc.close();
   }
}
