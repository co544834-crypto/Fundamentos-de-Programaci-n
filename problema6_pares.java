import java.util.Scanner;
public class problema6_pares {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Ingresa a: ");
        int a=sc.nextInt();
        System.out.print("Ingresa b: ");
        int b=sc.nextInt();
        System.out.print("Ingresa c: ");
        int c=sc.nextInt();

        boolean resultado = (a+b==c || b+c==a || a+c==b);
            System.out.println("resultado: " + resultado);
            
            sc.close();
        }
        
    }
    

