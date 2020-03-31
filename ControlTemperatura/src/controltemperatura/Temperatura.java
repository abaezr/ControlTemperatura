package controltemperatura;
import java.util.Scanner;
public class Temperatura {
        Scanner entradateclado = new Scanner(System.in);
        Temperatura(){
        }
        float ingresoTemperatura(){
            System.out.print("Ingrese la temperatura: ");
            float temp = Float.valueOf(entradateclado.nextLine());
            return temp;
        }
}
