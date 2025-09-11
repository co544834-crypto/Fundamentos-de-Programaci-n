import java.util.Scanner;
public class ej3_ciclo {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double res;
        char opcion;

        do{
            System.out.print("Ingrese el primer valor: ");
            int num1=sc.nextInt();
            System.out.print("Ingrese el segundo valor: ");
            int num2=sc.nextInt();
            System.out.print("Ingrese el simbolo de la opreaciòn a realizar (+, -, *, /): ");
            char sim=sc.next().charAt(0);

            switch(sim){
            case '+':
            res= num1 + num2;
            System.out.println("La suma es: "+ res);
            break;
            case '-':
            res= num1 - num2;
            System.out.println("La resta es: "+ res);
            break; 
            case '*':
            res= num1 * num2;
            System.out.println("La multiplicaciòn es: "+ res);
            break;
            case '/': 
            if (num2==0){
                System.out.println("Error de division por cero");
                }else{
                    res = num1 / num2;
                    System.out.println("La division es: "+ res);
            }  
            break;
            default: System.out.println("Operaciòn no valida");
            break;
        }
        System.out.println("Quieres consultar otra operaciòn(S/N):");
        opcion=sc.next().charAt(0);
        } while (opcion == 'S');

       sc.close();
  }
}
