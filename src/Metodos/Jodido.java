package Metodos;
import java.util.ArrayList;
import java.util.Scanner;

public class Jodido {

    static ArrayList<String> productos = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void agregarProducto() {
        System.out.print("Ingresa el nombre del producto a agregar: ");
        String producto = scanner.nextLine();
        productos.add(producto);
    }

    public static void eliminarProducto() {
        System.out.print("Ingresa el nombre del producto a eliminar: ");
        String producto = scanner.nextLine();
        if (productos.remove(producto)) {
            System.out.println("Producto eliminado.");
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    public static void mostrarProductos() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos en la lista.");
        } else {
            System.out.println("Lista de productos:");
            for (String p : productos) {
                System.out.println("- " + p);
            }
        }
    }

    public static void buscarProducto() {
        System.out.print("Ingresa el nombre del producto a buscar: ");
        String producto = scanner.nextLine();
        if (productos.contains(producto)) {
            System.out.println("El producto está en la lista.");
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    public static void mostrar(){
        int opcion;
        String opcionDos;
        do {
            System.out.println("Lista de productos");
            System.out.println("1. Agregar productos");
            System.out.println("2. Eliminar productos");
            System.out.println("3. Mostrar todos los productos");
            System.out.println("4. Buscar productos");
            System.out.println("5. Salir");

            System.out.print("Ingresa una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion){
                case 1:
                    agregarProducto();
                    break;
                case 2:
                    eliminarProducto();
                    break;
                case 3:
                    mostrarProductos();
                    break;
                case 4:
                    buscarProducto();
                    break;
            }
        } while (opcion !=5);
    }
}
