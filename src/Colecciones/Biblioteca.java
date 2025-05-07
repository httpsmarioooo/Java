package Colecciones;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Biblioteca {
    static Set<String> libros = new HashSet<>();
    static Scanner scanner = new Scanner(System.in);

    public static void mostrar() {
        System.out.println("--- Biblioteca ---");
        System.out.println("1. Agregar libro");
        System.out.println("2. Mostrar todos los libros");
        System.out.println("3. Verificar si un libro está disponible");
        System.out.println("4. Ver número total de libros únicos");
        System.out.println("5. Salir");
        System.out.print("Selecciona una opción: ");
        int opcion = scanner.nextInt();
    }
}
