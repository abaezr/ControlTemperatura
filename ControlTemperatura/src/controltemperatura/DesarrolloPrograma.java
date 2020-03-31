/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controltemperatura;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author andresbaezrincon
 */
public class DesarrolloPrograma {
        
        public void metodo(){
        Scanner entradateclado = new Scanner(System.in);
        ArrayList<Persona> listaPersona = new ArrayList<Persona>();
        Vector<Float> vectorTemperatura = new Vector<Float>();
        Vector<Integer> vectorDueño = new Vector<Integer>();
        Temperatura temp = new Temperatura();
        boolean seguir=true;
        int opc,edad;
        while(seguir ==true){
            System.out.println("*********************************");
            System.out.println("*                               *");
            System.out.println("*  1. Ingresar Nueva Persona    *");
            System.out.println("*  2. Ver lista de Personas     *");            
            System.out.println("*  3. Ingresar Nueva            *");
            System.out.println("*     Temperatura               *");
            System.out.println("*  4. Eliminar Persona          *");
            System.out.println("*  5. Generar Reporte           *");
            System.out.println("*  6. Salir                     *");
            System.out.println("*                               *");
            System.out.println("*********************************");
            System.out.println("\n---------------------------------\n");
            System.out.print("Ingrese la opcion a realizar: ");
            opc = Integer.parseInt(entradateclado.nextLine());
            switch (opc){
                case 1:
                    listaPersona.add(new Persona());
                    System.out.println("Persona creada correctamente.");
                break;
                
                case 2:
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
                break;
                
                case 3:
                    if(listaPersona.size() < 1)
                        System.out.println("No hay personas registradas");
                    else{
                    for(int i=0;i<listaPersona.size();i++){
                        System.out.println((i+1)+". "+listaPersona.get(i).Nombre);
                    }
                     System.out.print("Seleccione el numero del nombre de la persona a ingresar temperatura: ");
                     int opcionPersona = Integer.parseInt(entradateclado.nextLine());
                     vectorDueño.add(opcionPersona-1);
                     vectorTemperatura.add(temp.ingresoTemperatura());
                    }
                break;
                
                case 4:
                    int opcion;
                    if(listaPersona.size() < 1){
                        System.out.println("No hay personas ingresadas");
                    }
                    else{
                    for(int i=0;i<listaPersona.size();i++){
                        System.out.println((i+1)+". "+listaPersona.get(i).Nombre);
                    }
                     System.out.print("Seleccione el numero del nombre de la persona a elminiar: ");
                     opcion = Integer.parseInt(entradateclado.nextLine());
                     listaPersona.remove((opcion-1));
                    }
                break;
              
                case 5:
                    if(listaPersona.size() < 1)
                        System.out.println("No hay personas registradas");
                    else{
                        System.out.println("REPORTE DE TEMPERATURAS");
                        System.out.println("-----------------------------");
                        for(int i=0;i<listaPersona.size();i++){
                            System.out.println("Nombre: "+listaPersona.get(i).Nombre);
                           System.out.println("Temperatura "+(i+1)+": ");
                            for(int j=0;j<vectorDueño.size();j++){
                            if(vectorDueño.get(j) == i){
                                System.out.println(vectorTemperatura.get(j));
                            }
                            }
                        }
                            
                        }
                    
                break;
                case 6:
                System.exit(0);
                break;
                      
}
}
}
}
