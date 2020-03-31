/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controltemperatura;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author andresbaezrincon
 */
public class DesarrolloPrograma {
        
        public void metodo(){
        Scanner entradateclado = new Scanner(System.in);
        ArrayList<Persona> listaPersona = new ArrayList<Persona>();
        ArrayList<Temperatura> listaTemperatura = new ArrayList<Temperatura>();
        boolean seguir=true;
        int opc,edad;
        while(seguir ==true){
            System.out.println("*********************************");
            System.out.println("*                               *");
            System.out.println("*  1. Ingresar Nueva Persona    *");
            System.out.println("*  2. Ver lista de Personas     *");            
            System.out.println("*  3. Ingresar o modificar      *");
            System.out.println("*     temperatura               *");
            System.out.println("*  4. Eliminar Persona          *");
            System.out.println("*  5. Generar Reporte           *");
            System.out.println("*  6. Salir                     *");
            System.out.println("*                               *");
            System.out.println("*********************************");
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
                    for(int i=0;i<listaPersona.size();i++){
                        System.out.println((i+1)+". "+listaPersona.get(i).Nombre);
                    }
                     System.out.print("Seleccione el numero del nombre de la persona a ingresar temperatura: ");
                     int opcionPersona = Integer.parseInt(entradateclado.nextLine());
                     listaTemperatura.add(new Temperatura(opcionPersona-1));
               
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
                            for(int j=0;j<listaPersona.size();j++){
                            if(listaTemperatura.get(i).indice == j){
                            System.out.println("\n");
                            System.out.print("Nombre: ");
                            System.out.println(listaPersona.get(j).Nombre);
                            System.out.print("Temperatura: ");
                            System.out.println(listaTemperatura.get(i).temperatura);
                            System.out.println("\n");
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
