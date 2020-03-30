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
public class ControlTemperatura {
        

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entradateclado = new Scanner(System.in);
        ArrayList<Persona> listaPersona = new ArrayList<Persona>();
        String seguir,nombre,parentesco;
        int opc,edad;
        float temperatura;
        seguir = "S";
        while(seguir == "S" || seguir == "s"){
            System.out.println("*********************************");
            System.out.println("*                               *");
            System.out.println("*  1. Ingresar Nueva Persona    *");
            System.out.println("*  2. Ver lista de Personas     *");            
            System.out.println("*  2. Ingresar Temperatura      *");
            System.out.println("*  3. Eliminar Persona          *");
            System.out.println("*  4. Generar Reporte           *");
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
                 System.out.println("Nombre:");
                 for(int i=0;i<listaPersona.size();i++)
                     System.out.println((i+1)+"."+listaPersona.get(i).Nombre);
                 
                break;
            }
        
        }
    }
    
}