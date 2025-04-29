package VariablesYTiposDeDatos;
import java.time.Year;
import java.util.Scanner;

public class Taller1 {
    public static void calcularPromedio(Scanner scanner){
        System.out.print("Primera calificación: ");
        int primeraCali = scanner.nextInt();
        System.out.print("Segunda calificacion: ");
        int segundaCali = scanner.nextInt();
        System.out.print("Tercera calificacion: ");
        int terceraCali = scanner.nextInt();

        //Hecho por mi:
//        int operacion = (primeraCali + segundaCali + terceraCali) / 3;
//        double casteoDos = operacion;

        //Propuesta dado por chat:
        double promedio = (double)(primeraCali + segundaCali + terceraCali) / 3;

        System.out.println("El resultado es: "+promedio);
    }


    public static void perfilDeUsuario(Scanner scanner){
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Ingrese su nacionalidad: ");
        String nacionalidad = scanner.nextLine();

        System.out.print("Ingrese su ocupación: ");
        String ocupacion = scanner.nextLine();

        System.out.print("Ingrese su salario mensual: ");
        Double salarioMensual = scanner.nextDouble();

        int anioActual = Year.now().getValue();
        int anioNacimiento = anioActual - edad;

        System.out.println("\n--- PERFIL DE USUARIO ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Año de Nacimiento: " + anioNacimiento);
        System.out.println("Edad: " + edad);
        System.out.println("Nacionalidad: " + nacionalidad);
        System.out.println("Ocupación: " + ocupacion);
        System.out.println("Salario Mensual: $" + salarioMensual);
    }
}