package parcial_2;
import java.util.Scanner;

public class eje1_parametros {
    public static void duplicar(int numero) {
 numero = numero * 2;
 System.out.println("Número dentro del método: " + numero);
}
public static void main(String[] args) {
int numero;
 Scanner sc=new Scanner(System.in);
    do{
   
    //int numero=;
 System.out.println("Ingrese un numero:");
 numero =sc.nextInt();
 duplicar(numero);
 System.out.println("Número fuera del método: " + numero);
 }while(numero!=0);
 
}

}
