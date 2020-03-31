/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controltemperatura;

import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author andresbaezrincon
 */
public class Temperatura {
        Scanner entradateclado = new Scanner(System.in);
        float temperatura;
        int indice;
        Temperatura(int index){
            this.temperatura= (ingresoTemperatura());
            this.indice = index;
        }
        float ingresoTemperatura(){
            System.out.print("Ingrese la temperatura: ");
            float temp = Float.valueOf(entradateclado.nextLine());
            return temp;
        }
}
