import java.util.Scanner;
public class Pares {
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);

    int a,b,c,ab,bc,ac,resu;
    
    System.out.print("Ingrese el valor a:");
    a =sc.nextInt();
    System.out.print("Ingrese el valor b:");
    b =sc.nextInt();
    System.out.print("Ingrese el valor c:");
    c =sc.nextInt();

    ab=a+b;
    bc=b+c;
    ac=a+c;

    if(ab==10 || bc==10 || ac==10){
        resu=10;
    }else{
        if(ab==bc+10 || ab==ac+10){
            resu=5;
        }else {
      resu=0;
    }
}
        System.out.println("El resultado es:"+resu);
    sc.close();
            
    }


}
