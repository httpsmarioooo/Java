package ControlFLow;
import java.util.Scanner;

public class Taller2 {
    public static void supermercado() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el total de la compra: $");
        double totalCompra = scanner.nextDouble();

        System.out.print("Ingrese la cantidad de productos comprados: ");
        int cantidadProductos = scanner.nextInt();
        scanner.nextLine(); // limpia el buffer

        System.out.print("¿El cliente tiene membresía? (sí/no): ");
        String tipoCliente = scanner.nextLine().trim().toLowerCase();

        double descuento = 0;

        switch (tipoCliente) {
            case "si":
                descuento += 0.10; // 10%
                break;
            case "no":
                break;
            default:
                System.out.println("Tipo de cliente no válido. Se aplicará como 'normal'.");
        }

        if (cantidadProductos > 10) {
            descuento += 0.05; // 5% adicional por cantidad
        }

        double totalConDescuento = totalCompra * (1 - descuento);

        System.out.println("Total con descuento aplicado: $" + String.format("%.2f", totalConDescuento));
        scanner.close();
    }

    public static void veterinaria(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Que tipo de animal tienes (perro, gato, ave, otro) : ");
        String tipoAnimal = scanner.nextLine().toLowerCase();
        System.out.println("Cuantos años tiene la mascota?: ");
        int añosMascota = scanner.nextInt();
        scanner.nextLine(); // ← limpia el salto de línea pendiente

        String respuesta;

        switch (tipoAnimal){
            case "perro":
                System.out.println("Hola, soy Carlos y soy especialista en atender a perros.");

                if (añosMascota > 5) {
                    System.out.println("Se recomienda añadirle una vacuna, ya que a los animales mayores de 5 años les es más frecuente contraer nuevas enfermedades.");
                }

                System.out.println("¿Desea suministrarle esa vacuna? (si / no)");
                respuesta = scanner.nextLine().toLowerCase();

                switch (respuesta) {
                    case "si":
                        System.out.println("Vacuna inyectada");
                        break;
                    case "no":
                        System.out.println("Vacuna no suministrada");
                        break;
                    default:
                        System.out.println("Respuesta no válida.");
                }
                break;


            case "gato":
                System.out.println("Hola soy David y soy especialista en antender a gatos.");

                if (añosMascota > 5){
                    System.out.println("Se recomienda añadirle una vacuna, ya que a los animales mayores de 5 años, son frecuentes a contraer nuevas enfermedades.");
                }

                System.out.println("¿Desea suministrarle esa vacuna? (si / no)");
                respuesta = scanner.nextLine().toLowerCase();

                switch (respuesta) {
                    case "si":
                        System.out.println("Vacuna inyectada");
                        break;
                    case "no":
                        System.out.println("Vacuna no suministrada");
                        break;
                    default:
                        System.out.println("Respuesta no válida.");
                }
                break;
            default:
                System.out.println("Seleccione una opcion correcta.");
        }
    }
}
