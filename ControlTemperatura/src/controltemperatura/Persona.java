package controltemperatura;
import java.util.Scanner;
public class Persona {
    Scanner entradaTeclado = new Scanner(System.in);
    String Nombre;
    int Edad;
    String Parentesco;
    Persona(){
        this.Nombre = ingresoNombre();
        this.Edad = ingresoEdad();
        this.Parentesco = ingresoParentesco();
    }
    String ingresoNombre(){
        String Nombre;
        System.out.print("\nIngrese el nombre de la persona: ");
        Nombre = entradaTeclado.nextLine();  
        return Nombre;
    }
    int ingresoEdad(){
        int Edad;
        System.out.print("Ingrese la edad de la persona: ");
        Edad = Integer.parseInt(entradaTeclado.nextLine());
        while (Edad <=0){
            System.out.print("Edad no valida. Ingrese una nueva edad: ");
            Edad = Integer.parseInt(entradaTeclado.nextLine());
        }
        return Edad;
    }
    String ingresoParentesco(){
        String Parentesco;
        System.out.print("Ingrese el parentesco de la persona: ");
        Parentesco = entradaTeclado.nextLine();  
        return Parentesco;
    }
}
