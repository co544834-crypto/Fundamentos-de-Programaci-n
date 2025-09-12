import java.util.Scanner;
public class tablas {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int n;

        do{
            System.out.print("Ingresa un numero(0 para salir):");
            n=sc.nextInt();

            if(n !=0){
                for(int c=1; c<=10; c++){
                    System.out.println(n + "x" + c +" = " + n * c);

                }
            }
        }while(n != 0);
    }
    
}
