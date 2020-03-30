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
public class Persona {
    Scanner entradaTeclado = new Scanner(System.in);
    String Nombre;
    int Edad;
    String Parentesco;
    ArrayList<Persona> listaTemperatura= new ArrayList<Persona>();
    Persona(){
        this.Nombre = ingresoNombre();
        this.Edad = ingresoEdad();
        this.Parentesco = ingresoParentesco();
    }
    String ingresoNombre(){
        String Nombre;
        System.out.print("Ingrese el nombre de la persona: ");
        Nombre = entradaTeclado.nextLine();  
        return Nombre;
    }
    int ingresoEdad(){
        int Edad;
        System.out.print("Ingrese la edad de la persona: ");
        Edad = Integer.parseInt(entradaTeclado.nextLine());  
        return Edad;
    }
    String ingresoParentesco(){
        String Parentesco;
        System.out.print("Ingrese el parentesco de la persona: ");
        Parentesco = entradaTeclado.nextLine();  
        return Parentesco;
    }
}
