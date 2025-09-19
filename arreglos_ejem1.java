package parcial_2;
import java.util.Scanner;
public class arreglos_ejem1 {
    public static void main(String[] args){
        Scanner sc= new Scanner (System.in);
        
        int [] A= new int [5];
        System.out.println("Cuantos elementos va a guardar?:");
        int n=sc.nextInt();
        for(int i=0;i<=n;i++){
            System.out.println ("Introduce el valor para: " + i );
            int valor =sc.nextInt();
            A[i]=valor;
        }
        
        System.out.println("Los valores del arreglo son: ");
        for(int i=0;i<n;i++){
            
            System.out.print(A[i]+ "  ");
        }

          System.out.println("utilizando legth ");
        for(int i=0; i<A.length; i++){
            System.out.print(A[i]+ "  ");
        } 

        System.out.println("utilizando for each ");
        for(int i : A){
            System.out.print(A[i]+ "  ");  
        } 


    }
}
