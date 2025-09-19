package parcial_2;

public class arreglos_ejem2 {
    public static void main(String[] args){
        String nombres[]= new String [4];
        nombres[0]="Ernesto ";
        nombres[1]="Antonio ";
        nombres[2]="Corona ";
        nombres[3]="Cortés" ;

        for(String e : nombres){
            System.out.print(e);
        }
        //más simple
        String nom[]= {" Ernesto ", "Antonio ", "Corona ", "Cortés "};
        for(String e : nom){
            System.out.print(e);
        }
    }  
}
