package Colecciones;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Biblioteca {
    private static Set<String> libros = new HashSet<>();
    private static void agregarLibro(String titulo) {
        libros.add(titulo);
    }

    private static void mostrarLibros() {
        if (libros.isEmpty()) {
            System.out.println("No hay libros en la biblioteca.");
        } else {
            System.out.println("Libros disponibles:");
            for (String libro : libros) {
                System.out.println(libro);
            }
        }
    }

    private static void verificarLibro(String titulo) {
        if (libros.contains(titulo)) {
            System.out.println("El libro está disponible.");
        } else {
            System.out.println("El libro no está disponible.");
        }
    }

    private static void contarLibros() {
        System.out.println("Total de libros únicos en la biblioteca: " + libros.size());
    }

    public static void mostrar() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Menú de Biblioteca ---");
            System.out.println("1. Agregar libro");
            System.out.println("2. Mostrar libros disponibles");
            System.out.println("3. Verificar disponibilidad de un libro");
            System.out.println("4. Mostrar número total de libros únicos");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el título del libro: ");
                    String tituloAgregar = scanner.nextLine();
                    agregarLibro(tituloAgregar);
                    System.out.println("Libro agregado.");
                    break;
                case 2:
                    mostrarLibros();
                    break;
                case 3:
                    System.out.print("Ingrese el título del libro a verificar: ");
                    String tituloBuscar = scanner.nextLine();
                    verificarLibro(tituloBuscar);
                    break;
                case 4:
                    contarLibros();
                    break;
            }
        } while (opcion != 5);
    }
}
