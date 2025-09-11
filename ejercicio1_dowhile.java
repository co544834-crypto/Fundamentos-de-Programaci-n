public class ejercicio1_dowhile {
     public static void main(String[] args){
    
    int n=1;
    int resultado=0;
 
    while(n<10){
             resultado=resultado + n;
             n++;
           }
    
    System.out.println("el resultado es: "+ resultado);  
    
    //ciclo do while
     n=1;
     resultado=0;

    do{
        resultado=resultado +n;;
        n++;
    }while (n<10);
    System.out.println("el resultado es: "+ resultado);  

    //ciclo for

    n=1;
    resultado=0;

    for(n=1;n<10;n++){
     resultado=resultado+n;
    }
    System.out.println("el resultado es: "+ resultado);  
 }

}

