package controltemperatura;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;
public class DesarrolloPrograma {
        Scanner entradateclado = new Scanner(System.in);
        ArrayList<Persona> listaPersona = new ArrayList<Persona>();
        Vector<Float> vectorTemperatura = new Vector<Float>();
        Vector<Integer> vectorDueño = new Vector<Integer>();
        Temperatura temp = new Temperatura();
        public void metodo(){
        boolean seguir=true;
        int opc;
        while(seguir ==true){
            System.out.println("\n*********************************");
            System.out.println("*                               *");
            System.out.println("*  1. Ingresar Nueva Persona    *");
            System.out.println("*  2. Ver lista de Personas     *");            
            System.out.println("*  3. Ingresar Nueva            *");
            System.out.println("*     Temperatura               *");
            System.out.println("*  4. Generar Reporte           *");
            System.out.println("*  5. Salir                     *");
            System.out.println("*                               *");
            System.out.println("*********************************");
            System.out.println("\n---------------------------------\n");
            System.out.print("Ingrese la opcion a realizar: ");
            opc = Integer.parseInt(entradateclado.nextLine());
            switch (opc){
                case 1:
                    listaPersona.add(new Persona());
                    System.out.println("\nPersona creada correctamente.\n");
                break;
                
                case 2:
                   verListaPersonas(); 
                break;
                
                case 3:
                    ingresarTemperatura();
                break;
                case 4:
                    generarReporte();
                break;
                case 5:
                System.exit(0);
                break;
                default:
                System.exit(0);
                 break;
                    
            }}}
        
        public void verListaPersonas(){
            if(listaPersona.size() < 1)
                        System.out.println("No hay personas registradas");
                    else{
                        System.out.println("-----------------------------");
                        for(int i=0;i<listaPersona.size();i++){
                            System.out.println("\n");
                            System.out.println("Persona No."+(i+1)+":");
                            System.out.print("Nombre: ");
                            System.out.println(listaPersona.get(i).Nombre);
                            System.out.print("Edad: ");
                            System.out.println(listaPersona.get(i).Edad);
                            System.out.print("Parentesco: ");
                            System.out.println(listaPersona.get(i).Parentesco);
                            System.out.println("\n");
                        }
                    }
        }
        public void ingresarTemperatura(){
            if(listaPersona.size() < 1)
                        System.out.println("No hay personas registradas");
                    else{
                    for(int i=0;i<listaPersona.size();i++){
                        System.out.println((i+1)+". "+listaPersona.get(i).Nombre);
                    }
                     System.out.print("Seleccione el numero del nombre de la persona a ingresar temperatura: ");
                     int opcionPersona = Integer.parseInt(entradateclado.nextLine());
                     while(opcionPersona>listaPersona.size() || opcionPersona<=0){
                         System.out.print("Entrada no valida. Ingrese una entrada Valida: ");
                         opcionPersona = Integer.parseInt(entradateclado.nextLine());
                     }
                     vectorDueño.add(opcionPersona-1);
                     vectorTemperatura.add(temp.ingresoTemperatura());
                    }
        }
        public void generarReporte(){
            if(listaPersona.size() < 1)
                        System.out.println("No hay personas registradas");
                    else{
                        System.out.println("\nREPORTE DE TEMPERATURAS");
                        System.out.println("-----------------------------\n");
                        for(int i=0;i<listaPersona.size();i++){
                           System.out.println("\nNombre: "+listaPersona.get(i).Nombre);
                           System.out.println("Temperaturas: ");
                            for(int j=0;j<vectorDueño.size();j++){
                            if(vectorDueño.get(j) == i){
                                System.out.println(vectorTemperatura.get(j));
        }}}}}}
