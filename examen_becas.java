import java.util.Scanner;
public class examen_becas {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int beca=0;
        System.out.print("Ingresa tu edad: ");
        int edad = sc.nextInt();
        System.out.print("Ingresa tu promedio: ");
        double promedio = sc.nextDouble();
            
        if (edad >= 18) {
            if (promedio > 9) {
                beca = 2000;
            } else if (promedio > 7.5 && promedio <= 8.9) {
                beca = 1000;
            } else if (promedio > 6 && promedio <= 7.5) {
                beca = 500;
            }
            else {
            if (promedio >= 9) {
                beca = 30000;
            } else if (promedio < 9 && promedio > 8) {
                beca = 2000;
            } else if (promedio <= 8 && promedio > 6) {
                beca = 100;
            }
        }

        }else{
              System.out.println("no aplicas");
        }
        
    }
}
