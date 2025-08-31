package PROYECTOFINAL;

import java.util.Scanner;

public class PROYECTOFINAL {
 
    public static void main (String[ ] arqs){
      String cliente;
        double c1,c2,c3,tc,pc;
        Scanner lectura=new Scanner(System.in);
                    
       System.out.print("Ingresar nombre del cliente: ");
       cliente=lectura.next();
       
       System.out.print("Ingresar la 1era compra realizada: ");
       c1=lectura.nextDouble();
       
       System.out.print("Ingresar la 2da compra realizada: ");
       c2=lectura.nextDouble();
       
       System.out.print("Ingresar la 3era compra realizada: ");
       c3=lectura.nextDouble();
       
       tc=c1+c2+c3;
       pc=tc/3;
       
       System.out.print("Resultados del proyecto : ");
       System.out.println("La compra total es: "+tc);
       System.out.println("El promedio de compra es: "+pc);
     
    }
}
  

