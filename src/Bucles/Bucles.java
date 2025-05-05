package Bucles;
import java.util.Scanner;


public class Bucles {

    public static void uwu(){
        Scanner scanner = new Scanner(System.in);
        int suma = 0;

        System.out.print("Ingresa un número (0 para terminar): ");
        int numero = scanner.nextInt();

        while (numero != 0) {
            suma += numero;
            System.out.print("Ingresa un número (0 para terminar): ");
            numero = scanner.nextInt();
        }

        System.out.println("La suma total es: " + suma);
    }
}
