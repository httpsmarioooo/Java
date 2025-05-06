package Metodos;
import java.util.Scanner;

public class Calculadora {

    public static double sumar (double a, double b){
        double suma = (a + b);
        return suma;
    }

    public static double restar (double a, double b){
        double resta = (a - b);
        return resta;
    }

    public static double multiplicar (double a, double b){
        double multiplicacion = (a * b);
        return multiplicacion;
    }

    public static double dividir (double a, double b){
        if (b == 0) {
            System.out.println("No se puede dividir por cero.");
            return 0;
        }
        return a / b;
    }

    public static double calcularPotencia (double a, double b){
        double potencia = Math.pow(a, b);
        return potencia;
    }


    public static void mostrar (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculadora");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("5. Potencia");
        System.out.println("6. Salir");

        System.out.print("Ingresa una opción: ");
        int opcion = scanner.nextInt();

        if (opcion >= 1 && opcion <= 5) {
            System.out.print("Elige un número: ");
            double a = scanner.nextDouble();
            System.out.print("Elige otro número: ");
            double b = scanner.nextDouble();

            switch (opcion) {
                case 1:
                    System.out.println("El resultado de la suma es: " + sumar(a, b));
                    break;
                case 2:
                    System.out.println("El resultado de la resta es: " + restar(a, b));
                    break;
                case 3:
                    System.out.println("El resultado de la multiplicación es: " + multiplicar(a, b));
                    break;
                case 4:
                    System.out.println("El resultado de la división es: " + dividir(a, b));
                    break;
                case 5:
                    System.out.println("El resultado de la potencia es: " + calcularPotencia(a, b));
                    break;
            }
        } else if (opcion != 6) {
            System.out.println("Opción no válida.");
        }
    }
}
