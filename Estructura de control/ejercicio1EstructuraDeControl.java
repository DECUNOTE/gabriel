import java.util.Scanner;

public class ejercicio1EstructuraDeControl {
/*Crear un programa que dado un número determine si es par o impar.*/
    
/**
 * @param args
 */
public static void main(String[] args) {
    System.out.println("ingresa un valo entero");
    Scanner Leer = new Scanner(System.in);
    int num;
num = Leer.nextInt();
if (num % 2 == 0)

        System.out.println("El numero ingresado es par");

    else 
        System.out.println("El numero ingresado no es par");
        Leer.close();
    }



}


