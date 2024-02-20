import java.util.Scanner;

public class ejercicio3Estructura {
    public static void main(String[] args) {
        /*Realizar un programa que solo permita introducir solo frases o palabras
        de 8 de largo. Si el usuario ingresa una frase o palabra de 8 de largo se
        deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, en
        caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la
        función Lenght() en Java*/

        Scanner Leer = new Scanner(System.in);
        String frase;
        System.out.println("Ingresa una frase y te dire si es correcto o no");
        frase= Leer.nextLine();

        if (frase.length()== 8){
            System.out.println("CORRECTO");

        }else{
        System.out.println("INCORRECTO");

        Leer.close();
        }
  }
}

