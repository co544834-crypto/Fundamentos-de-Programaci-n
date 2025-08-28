import java.util.Scanner;
public class multa_velocidad {
    public static void main(String[] args){
       Scanner sc= new Scanner(System.in);
       //datos velocidad y cumpleaños
       System.out.print("Ingrese velocidad");
       int velocidad = sc.nextInt();

       System.out.print("¿Es cumpelaños del conductor?");
       String cumple = sc.next();
       
       if(cumple.equalsIgnoreCase("NO")){
        if(velocidad<=60){
            System.out.println("0=sin multa");
        }else{
            if(velocidad>=61 && velocidad <=80){
                System.out.println("1=multa pequeña");
            }else{
                System.out.println("2=multa grande");
            }
        }
       }else {
        System.out.println("no hay multa");
       }
       sc.close();
       }      
    }
   
