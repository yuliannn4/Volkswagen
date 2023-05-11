
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
       String gama ="";
       String gamaSeleccionada="";
       String planseleccionado="";
       String auto="";
       String autoSeleccionado="";
       
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
        
        System.out.println("Modelos Disoponibles");
            for (int i=0; i< modelos.length; i++){
             System.out.println((i + 1) + ". " + modelos[i]);
             
            }
            
        System.out.print("Selecciona un MODELO: ");

        auto=obtenerDatos.nextLine();    
        
        System.out.println("\n");
            
        switch(auto){
            case "1": autoSeleccionado="POLO";
            break;
            case "2": autoSeleccionado="VENTUS";
            break;
            case "3": autoSeleccionado="VIRTUS";
            break;   
        }
            
            
        System.out.println("Gamas disponibles: ");
        System.out.println("1- BASICO");
        System.out.println("2- INTERMEDIO");
        System.out.println("3- ALTA");
        System.out.print("Selecciona una GAMA: ");
        gama=obtenerDatos.nextLine();
        switch(gama){
            case "1": gamaSeleccionada="BASICA";
            break;
            case "2": gamaSeleccionada="INTERMEDIA";
            break;
            case "3": gamaSeleccionada="AVANZADA";
            break;   
        }

System.out.println("\n");
            
            String planes []= {"Efectivo" , "70 30" , "80 20" , "100% financiado"};
                System.out.println("Planes disponibles ");
                    for (int p = 0; p < planes.length; p++) {
                        System.out.println((p + 1) + ". " + planes[p]);
                    }   
           System.out.print("Selecciona un PLAN: ");
            Scanner sel = new Scanner(System.in);
            int seleccion = sel.nextInt();
            
System.out.println("\n");            
            
                if(seleccion >=1 && seleccion <= planes.length){
                    planseleccionado = planes[seleccion-1];
                        System.out.println("Elegiste el modelo " + autoSeleccionado +", gama " + gamaSeleccionada+ ", plan " + planseleccionado  );
                }
            
}
                    

                
       
    }
    

