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
        int anosMascota = scanner.nextInt();
        scanner.nextLine(); // ← limpia el salto de línea pendiente

        String respuesta;

        switch (tipoAnimal){
            case "perro":
                System.out.println("Hola, soy Carlos y soy especialista en atender a perros.");

                if (anosMascota > 5) {
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

                if (anosMascota > 5){
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

    public static void controlParqueadero(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Qué tipo de vehículo tienes? (auto, moto, bicicleta): ");
        String tipoVehiculo = scanner.nextLine().toLowerCase();

        System.out.print("Hora de llegada (formato 24 horas, solo la hora): ");
        String horaLlegada = scanner.nextLine();

        int hora;
        try {
            hora = Integer.parseInt(horaLlegada);
        } catch (NumberFormatException e) {
            System.out.println("La hora ingresada no es válida.");
            return;
        }

        switch (tipoVehiculo) {
            case "auto":
            case "moto":
            case "bicicleta":
                    if (hora > 8) {
                        System.out.println("Recargo total del 20%");
                    } else {
                        System.out.println("Sin recargo");
                    }
                break;
            default:
                System.out.println("Tipo de vehículo no válido.");
        }
    }

    public static void parqueadero(){
            Scanner scanner = new Scanner(System.in);

            // Precios base por tipo de vehículo
            final int COSTO_AUTO = 5000;
            final int COSTO_MOTO = 3000;
            final int COSTO_BICICLETA = 1000;

            System.out.print("Tipo de vehículo (auto, moto, bicicleta): ");
            String tipoVehiculo = scanner.nextLine().toLowerCase();

            System.out.print("Hora de llegada (formato 24 horas, solo la hora): ");
            int hora = scanner.nextInt();

            double costoBase;
            switch (tipoVehiculo) {
                case "auto":
                    costoBase = COSTO_AUTO;
                    break;
                case "moto":
                    costoBase = COSTO_MOTO;
                    break;
                case "bicicleta":
                    costoBase = COSTO_BICICLETA;
                    break;
                default:
                    System.out.println("Tipo de vehículo no reconocido.");
                    return;
            }

            // Si llega después de las 20 horas (8 p.m.), hay recargo
            if (hora > 20) {
                costoBase *= 1.20;  // Aplica recargo del 20%
            }

            System.out.printf("El costo total del parqueo es: $%.2f%n", costoBase);
        }

        public static void tiendaRopa() {
        Scanner scanner = new Scanner(System.in);

            // Precios por tipo de prenda
            final double PRECIO_CAMISA = 25.0;
            final double PRECIO_PANTALON = 40.0;
            final double PRECIO_CHAQUETA = 60.0;
            int opcion;
            double precioUnitario = 0;

            do {
                System.out.println("Bienvenido a la tienda de ropa");
                System.out.println("Seleccione el tipo de prenda que desea comprar:");
                System.out.println("1. Camisa");
                System.out.println("2. Pantalón");
                System.out.println("3. Chaqueta");
                System.out.println("4. Salir");

                opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        precioUnitario = PRECIO_CAMISA;
                        break;
                    case 2:
                        precioUnitario = PRECIO_PANTALON;
                        break;
                    case 3: ;
                        precioUnitario = PRECIO_CHAQUETA;
                        break;
                    case 4:
                        System.out.println("¡Gracias por su visita! ¡Hasta luego!");
                        break;
                    default:
                        System.out.println("Opción no válida. Intente nuevamente.");
                }

                if (opcion >= 1 && opcion <= 3) {
                    System.out.print("Ingrese la cantidad de prendas: ");
                    int cantidad = scanner.nextInt();

                    // Calcular el total
                    double total = precioUnitario * cantidad;

                    if (cantidad > 5) {
                        total *= 0.85; // Aplica 15%
                    }

                    System.out.println("Total a pagar: " +total);
                }

            } while (opcion != 4);
        }
}

