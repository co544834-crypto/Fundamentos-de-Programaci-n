package parcial_2;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.InputMismatchException;
public class oper_arreglos {
   
    static ArrayList<Integer> lista = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;

        do {
            System.out.println("\n MENÚ DE ARREGLOS ");
            System.out.println("1. Guardar número");
            System.out.println("2. Mostrar números");
            System.out.println("3. Recorrer arreglo");
            System.out.println("4. Buscar número");
            System.out.println("5. Modificar número");
            System.out.println("6. Eliminar número");
            System.out.println("7. Eliminar todo el arreglo");
            System.out.println("8. Ordenar");
            System.out.println("9. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

               try {
            opcion = sc.nextInt();
            } catch (InputMismatchException e) {
            System.out.println("Carácter inválido. Ingresa un número entero.");
            sc.nextLine();//Limpiar buffer
            continue;
            }

            switch (opcion) {
                case 1:
                    guardarNumero();
                    break;
                case 2:
                    mostrarNumeros();
                    break;
                case 3:
                    recorrerArreglo();
                    break;
                case 4:
                    buscarNumero();
                    break;
                case 5:
                    modificarNumero();
                    break;
                case 6:
                    eliminarNumero();
                    break;
                case 7:
                    eliminarArreglo();
                    break;
                case 8:
                    ordenar();
                    break;
                case 9:
                    System.out.println("Salio del programa");
                    break;
                    
                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 9);
    }

    // Método para guardar un número en la lista
    public static void guardarNumero() {
        System.out.print("Ingresa un número: ");
        int numero = sc.nextInt();
        lista.add(numero);
        System.out.println("Número guardado correctamente.");
    }

    // Método para mostrar todos los números de la lista
    public static void mostrarNumeros() {
        if (lista.isEmpty()) {
            System.out.println("La lista está vacía.");
        } else {
            System.out.println("\nNúmeros en la lista:");
            for (int i = 0; i < lista.size(); i++) {
                System.out.println("[" + i + "] " + lista.get(i));
            }
        }
    }

    //Método para recorrer arreglo
    public static void recorrerArreglo(){
        if (lista.isEmpty()) {
            System.out.println("El arreglo está vacío.");
            } else {
            System.out.println("Elementos del arreglo:");
                for (int i = 0; i < lista.size(); i++) {
                System.out.println("[" + i + "] -> " + lista.get(i));
         }
       }

    }


    // Método para buscar un número en la lista
    public static void buscarNumero() {
        if (lista.isEmpty()) {
            System.out.println("La lista está vacía, no hay números para buscar.");
            return;
        }

        System.out.print("Ingresa el número a buscar: ");
        int buscado = sc.nextInt();

        int posicion = lista.indexOf(buscado);

        if (posicion != -1) {
            System.out.println("Número encontrado en la posición: " + posicion);
        } else {
            System.out.println("El número no se encontró en la lista.");
        }
    }

    //Mètodo para modificar un numero en la lista
    public static void  modificarNumero(){
        System.out.print("Ingresa la posición a modificar: ");
         try {
             int pos = sc.nextInt();
              if (pos >= 0 && pos < lista.size()) {
                System.out.print("Ingresa el nuevo valor: ");
                int nuevo = sc.nextInt();
                lista.set(pos, nuevo);
                System.out.println("Elemento modificado.");
                } else {
                    System.out.println("Posición inválida.");
                        }
                } catch (InputMismatchException e) {
                    System.out.println("Carácter inválido.");
                        sc.nextLine();
            }

    }

    //Método para eliminar un numero en la lista
    public static void eliminarNumero(){
        System.out.print("Ingresa la posición a eliminar: ");
            try {
                int posEliminar = sc.nextInt();
                if (posEliminar >= 0 && posEliminar < lista.size()) {
                     lista.remove(posEliminar);
                     System.out.println("Elemento eliminado.");
                } else {
                     System.out.println("Posición inválida.");
             }
       } catch (InputMismatchException e) {
         System.out.println("Carácter inválido.");
         sc.nextLine();
     }

    }

    //Método para eliminar todo el arreglo
    public static void eliminarArreglo(){
        lista.clear();
         System.out.println("Todos los elementos fueron eliminados.");

    }

    //Método para ordenar 
    public static void ordenar(){
     if (lista.isEmpty()) {
       System.out.println("El arreglo está vacío, no se puede ordenar.");
     } else {
       Collections.sort(lista);
       System.out.println("Arreglo ordenado.");
      }

    }
}
