package Colecciones;
import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeTareas {
    static ArrayList<String> tareas = new ArrayList<>();
    static ArrayList<String> tareasPendientes = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
//            1. Agregar tareas.
//            2. Mostrar todas las tareas.
//            3. Marcar una tarea como completada (eliminándola de la lista).
//            4. Mostrar el número total de tareas pendientes
private static void agregarTareas (){
        System.out.println("Ingrese la nueva tarea: ");
        String tarea = scanner.nextLine();
        tareas.add(tarea);
    }

    private static void mostrarTareas(){
        System.out.println("Estas son las tareas: ");
        if (tareas.isEmpty()){
            System.out.println("No hay tareas");
        } else {
            System.out.println("Lista de tareas:");
            for (String i : tareas){
                System.out.println("-" + i);
            }
        }
    }

    private static void eliminarTareas(){
        System.out.println("Tarea a eliminar: ");
        String tarea = scanner.nextLine();
        if (tareas.remove(tarea)){
            System.out.println("Tarea removida");
        } else {
            System.out.println("Tarea no encontrada:");
        }
    }

    public static void mostrar(){
        int opcion;
        do {
            System.out.println("Lista de productos");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Mostrar tareas");
            System.out.println("3. Eliminar tarea");
            System.out.println("4. Salir");

            System.out.print("Ingresa una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion){
                case 1:
                    agregarTareas();
                    break;
                case 2:
                    mostrarTareas();
                    break;
                case 3:
                    eliminarTareas();
                    break;
            }
        } while (opcion !=4);
    }
}
