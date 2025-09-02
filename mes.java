import java.util.Scanner;
public class mes {
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);

        System.out.print("Ingresa el numero de un mes: ");
        int mes = sc.nextInt();

        switch(mes){
            case 1: System.out.println("Enero:31");
            break;
            case 2: System.out.println("Febrero:28");
            break;
            case 3: System.out.println("Marzo:31");
            break;
            case 4: System.out.println("Abril:31");
            break;
            case 5: System.out.println("Mayo:31");
            break;
            case 6: System.out.println("Junio:30");
            break;
            case 7: System.out.println("Julio:30");
            break;
            case 8: System.out.println("Agosto:31");
            break;
            case 9: System.out.println("Septiembre:30");
            break;
            case 10: System.out.println("Octubre:31");
            break;
            case 11: System.out.println("Noviembre:30");
            break;
            case 12: System.out.println("Diciembre:31");
            break;
        default: System.out.println("No existe");
        break;
        }
        sc.close();
    }
}

    