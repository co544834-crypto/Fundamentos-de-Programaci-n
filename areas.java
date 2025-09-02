import java.util.Scanner;
public class areas {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        double area;

        System.out.println("1=cuadrado");
        System.out.println("2=triangulo");
        System.out.println("3=rectangulo");
        System.out.println("4=circulo");
        System.out.println("Elige una opcion (1-4)");
        int opc=sc.nextInt();

        switch(opc){
            case 1:
            System.out.println("Ingresa el valor del lado: ");
            double l=sc.nextDouble();
            area=l*l;
            System.out.println("El area es: "+ area);
            break;
            case 2: 
            System.out.println("Ingresa la base: ");
            double b=sc.nextDouble();
            System.out.println("Ingresa la altura: ");
            double a=sc.nextDouble();
            area=b*a/2;
            System.out.println("El area es: "+ area);
            break;
            case 3: 
            System.out.println("Ingresa la base: ");
            double B=sc.nextDouble();
            System.out.println("Ingresa la altura: ");
            double A=sc.nextDouble();
            area=B*A;
            System.out.println("El area es: "+ area);
            break;
            case 4: 
            System.out.println("Ingresa el radio: ");
            double r=sc.nextDouble();
            area=Math.PI*r*r;
            System.out.println("El area es: "+ area);
            break;
            default: System.out.println("No existe la opcion");
            break;
        }
        sc.close();
    }
    
}
