package OperadoresLogicos;
import java.util.Scanner;

public class OperadoresLogicos {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in); // ← Esto es lo que faltaba

        // Comparación

//        System.out.println("Igualdad: " + (100 != 10));
//        System.out.println(100 > 10);
//        System.out.println(100 >= 10);
//        System.out.println(100 < 10);
//        System.out.println(100 <= 10);

        // Lógicos
//        System.out.println(100 > 10 && 50 > 5);
//        System.out.println(100 > 10 && 50 < 5);
//        System.out.println(100 > 10 || 50 > 5);
//        System.out.println(5 == 5  || 7 > 5);
//        System.out.println(5 == 6  || 7 > 5);

//        System.out.println(!(5 == 5));
//        System.out.println(!true);
//        System.out.println(189 != 5);

        //1
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Hola " + nombre + " espero que te encuentre muy bien yupiiii:");


        //2
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();
        System.out.println(edad < 18 ? "Eres menor de edad" : "Eres mayor de edad");


        //3
        System.out.print("Ingrese un numero decimal: ");
        double numero = scanner.nextDouble();
        double recortado = Math.floor(numero * 100) / 100.0;
        System.out.println("Su numero con dos decimales de precision: " + recortado);
        scanner.nextLine();


        //4
        System.out.print("Ingresa una frase: ");
        String frase = scanner.nextLine();
        System.out.println("En mayúsculas: " + frase.toUpperCase());
        System.out.println("En minúsculas: " + frase.toLowerCase());


        //5
        System.out.print("Calcular el promedio de 3 numeros");
        System.out.print("Ingrese el primer numero: ");
        float numeroFloatA = scanner.nextFloat();
        System.out.print("Ingrese el segundo numero: ");
        float numeroFloatB = scanner.nextFloat();
        System.out.print("Ingrese el tercer numero: ");
        float numeroFloatC = scanner.nextFloat();

        float operacion = ((numeroFloatA + numeroFloatB + numeroFloatC)/3);

        System.out.println("El resultado es: "+operacion);
    }

}
