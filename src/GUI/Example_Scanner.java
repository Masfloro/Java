package GUI;
import java.util.Scanner;
public class Example_Scanner {

    public void mandarMensaje(){
        //Aqui se mandara el mensaje
        
    }
    
    public static void main(String[] args) {

        Scanner objScanner = new Scanner(System.in);

        int edad;
        String nombre;

        System.out.println("Ingrese su nombre");
        nombre = objScanner.nextLine();
        System.out.println("Ingrese su edad");
        edad = objScanner.nextInt();

        System.out.println("Bienvenido " + nombre + " de " + edad + " años");

        if (edad<= 20) {
            System.out.println("\t siguiente");
        } else {
            System.out.println("a");
            
        }
        




 
        

        
    }
}
