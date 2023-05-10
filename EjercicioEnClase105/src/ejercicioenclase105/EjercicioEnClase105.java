
package ejercicioenclase105;

import java.util.Date;
import java.util.Scanner;


public class EjercicioEnClase105 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /**Vende solo de la marca XXX tres modelos (buscar que hay en el mercado hoy) en promoción, cada uno con sus gamas básico, medio y alto.
El vendedor debería :
- Ingresar el nombre del vendedor
-Ingresar el nombre del cliente , dni y teléfono.*/
       
       String vendedor ="";
       String cliente ="";
       int dni=0;
       long telefono =0;
       
       
       //ingresando los datos
       
       System.out.println(" Concesionaria Volkswagen-EL Alemán");
       System.out.println("\n");
       
       //pidiendo datos de contacto
        System.out.print("Por favor ingresa tu nombre: ");
            Scanner nom = new Scanner(System.in);
                vendedor = nom.next();
                
         System.out.print("Por favor ingresa nombre del cliente: ");
            Scanner clien = new Scanner(System.in);
                cliente = clien.nextLine();


        System.out.print("Ingresa DNI sin puntos: ");
            Scanner dn = new Scanner(System.in);
                dni = dn.nextInt();
        
        System.out.print("Ingresa telefono: ");
            Scanner tel = new Scanner(System.in);
                telefono = tel.nextLong();
                
                
        Scanner obtenerDatos= new Scanner(System.in);
        Date fecha= new Date();
        
        String modelos []= {"POLO", "VENTO", "VIRTUS"};
        int gamaBasica []= {1000000, 1200000, 1300000};
        int gamaIntermedia []= {1400000, 1500000, 1600000};
        int gamaAlta []= {1700000, 1800000, 1900000};
        
       
    }
    
}
