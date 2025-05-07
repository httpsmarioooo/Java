package Colecciones;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Directorio {
    private static Map<String, Double> trabajadores = new HashMap<>();

    private static void agregarTrabajador(String nombre, double salario) {
        trabajadores.put(nombre, salario);
    }

    private static void mostrarTrabajadores() {
        if (trabajadores.isEmpty()) {
            System.out.println("No hay trabajadores en el directorio.");
        } else {
            System.out.println("Trabajadores y sus salarios:");
            for (Map.Entry<String, Double> entry : trabajadores.entrySet()) {
                System.out.println(entry.getKey() + ": $" + entry.getValue());
            }
        }
    }

    private static void actualizarSalario(String nombre, double nuevoSalario) {
        if (trabajadores.containsKey(nombre)) {
            trabajadores.put(nombre, nuevoSalario);
            System.out.println("Salario actualizado.");
        } else {
            System.out.println("El trabajador no existe.");
        }
    }

    private static void calcularPromedio() {
        if (trabajadores.isEmpty()) {
            System.out.println("No hay trabajadores para calcular el promedio.");
        } else {
            double suma = 0;
            for (double salario : trabajadores.values()) {
                suma += salario;
            }
            double promedio = suma / trabajadores.size();
            System.out.println("Salario promedio: $" + promedio);
        }
    }

    public static void mostrar() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Menú del Directorio de Trabajadores ---");
            System.out.println("1. Agregar trabajador");
            System.out.println("2. Mostrar trabajadores y salarios");
            System.out.println("3. Actualizar salario de un trabajador");
            System.out.println("4. Calcular salario promedio");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del trabajador: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese el salario: ");
                    double salario = scanner.nextDouble();
                    scanner.nextLine();
                    agregarTrabajador(nombre, salario);
                    System.out.println("Trabajador agregado.");
                    break;
                case 2:
                    mostrarTrabajadores();
                    break;
                case 3:
                    System.out.print("Ingrese el nombre del trabajador: ");
                    String nombreActualizar = scanner.nextLine();
                    System.out.print("Ingrese el nuevo salario: ");
                    double nuevoSalario = scanner.nextDouble();
                    scanner.nextLine();
                    actualizarSalario(nombreActualizar, nuevoSalario);
                    break;
                case 4:
                    calcularPromedio();
                    break;
            }
        } while (opcion != 5);
    }
}
