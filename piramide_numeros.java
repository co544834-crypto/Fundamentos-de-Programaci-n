import java.util.Scanner;
public class piramide_numeros {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int n;

        System.out.print("Ingresa un numero: ");
        n=sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println(" ");
        }
    }
}
