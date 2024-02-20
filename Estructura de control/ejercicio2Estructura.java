import java.util.Scanner;

public class ejercicio2Estructura {

    public static void main(String[] args) {
        /*Crear un programa que pida una frase y si esa frase es igual a “eureka” el
        programa pondrá un mensaje de Correcto, sino mostrará un mensaje de
        Incorrecto. Nota: investigar la función equals() en Java.*/

        Scanner Leer = new Scanner(System.in);
        String frase;
        System.out.println("ungresa una frase y te dire si es la que tengo ");
        frase = Leer.nextLine();

        if (frase.equals("eureca")){
            System.out.println("perfecto adivinaste mi frase");

        }else{
            System.out.println("no es mi frase");
        }
    
    Leer.close();
    }

    
}
