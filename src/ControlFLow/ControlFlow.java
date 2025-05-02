package ControlFLow;
import java.util.Scanner;

public class ControlFlow {
    public static void teoria(String[] args) {
        System.out.println("Ignore");
    }

    public static void soloIf(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese tu edad: ");
        int edad = scanner.nextInt();

        if(edad >= 18){
            System.out.println("Muy bien puedes ingresar");
        }
    }

    public static void ifConElse(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese tu edad, ojo si eres menor de 18 te saldra otro mensaje: ");
        int edad = scanner.nextInt();

        if(edad >= 18){
            System.out.println("Muy bien puedes ingresar");
        } else {
            System.out.println("Estas muy beibi");
        }
    }

    public static void numeroParImpar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero para saber si esp par o impar: ");
        int numero  = scanner.nextInt();

        if (numero % 2 ==0){
            System.out.println("Es par");
        } else{
            System.out.println("Es impar");
        }
    }

    public static void ifAnidados(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        int edad  = scanner.nextInt();

//        if (edad > 60) {
//            System.out.println("Entre cucho");
//        } else if (edad >= 18) {
//            System.out.println("Entre pues, eres mayor de edad");
//        } else {
//            System.out.println("No puedes entrar, eres menor de edad");
//        }

        if (edad > 60) {
            System.out.println("Entre cucho");
        } else if (edad >= 18 && edad <= 60) {
            System.out.println("Estas entre los 18 y 60");
        } else {
            System.out.println("No puedes entrar, eres menor de edad");
        }
    }


    public static void usuarioRico (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        int edad = scanner.nextInt();
        System.out.println("Ingrese su dinero: ");
        double dinero = scanner.nextDouble();

        if (edad >= 18 && dinero > 50){
            System.out.println("Bienvenido");
        } else {
            System.out.println("No,adios");
        }
    }


    public static void calificaciones(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese tu calificacion: ");
        String calificacion = scanner.nextLine().toLowerCase();

        switch (calificacion){
            case "a":
                System.out.println("Alto");
                break;
            case "b":
                System.out.println("Medio");
                break;
            case "c":
                System.out.println("Bajo");
                break;
            case "f":
                System.out.println("Perdió");
                break;
            default:
                System.out.println("Cual es esa calificacion");
        }
    }


    public static void diaDeLaSemana(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero de la semana: ");
        int numero = scanner.nextInt();

        switch (numero){
            case 1:
                System.out.println("lUNES");
                break;
            case 2:
                System.out.println("MARTES");
                break;
            case 3:
                System.out.println("MIERCOLES");
                break;
            case 4:
                System.out.println("JUEVES");
                break;
            case 5:
                System.out.println("VIERNES");
                break;
            case 6:
                System.out.println("SABADO");
                break;
            case 7:
                System.out.println("DOMINGO");
                break;
            default:
                if (numero <= 0) {
                    System.out.println("Opción inválida, ingrese un número positivo");
                } else {
                    System.out.println("Opción inválida, la semana solo tiene 7 días");
                }
        }
    }

    public static void pets (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un nombre de la mascota, : ");
        String animal = scanner.nextLine().toLowerCase();

        switch (animal) {
            case "perro":
            case "gato":
            case "hamster":
                System.out.println("Es un animal doméstico");
                break;

            case "leon":
            case "tigre":
            case "leopardo":
                System.out.println("Es un felino salvaje");
                break;

            case "pez":
            case "tiburon":
            case "ballena":
                System.out.println("Es un pez");
                break;

            case "pajaro":
            case "aguila":
            case "canario":
                System.out.println("Es un ave");
                break;

            default:
                System.out.println("Animal no clasificado en el sistema");
        }
    }


    public static void sugerirClasificacion() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el nombre de un animal: ");
        String animal = scanner.nextLine().toLowerCase();

        String[] domesticos = {"perro", "gato", "hamster"};
        String[] felinos = {"leon", "tigre", "leopardo"};
        String[] peces = {"pez", "tiburon", "ballena"};
        String[] aves = {"pajaro", "aguila", "canario"};

        boolean encontrado = false; //Al principio, asumimos que no se ha encontrado ningún animal, por eso se inicia en false.

        //El for sirve para repetir una acción con cada elemento de la lista.
        for (String a : domesticos) { //La variable a representa cada uno de los elementos del arreglo domesticos durante la iteración.
            if (animal.contains(a) || a.contains(animal)) {
                System.out.println("- " + a + " (animal doméstico)");
                encontrado = true; //Si se encuentra una coincidencia, se imprime el animal... Y se cambia encontrado = true; para indicar que sí se encontró algo.
            }
        }

        for (String a : felinos) {
            if (animal.contains(a) || a.contains(animal)) {
                System.out.println("- " + a + " (felino salvaje)");
                encontrado = true;
            }
        }

        for (String a : peces) {
            if (animal.contains(a) || a.contains(animal)) {
                System.out.println("- " + a + " (pez)");
                encontrado = true;
            }
        }

        for (String a : aves) {
            if (animal.contains(a) || a.contains(animal)) {
                System.out.println("- " + a + " (ave)");
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontró una coincidencia. Intenta con otro animal.");
        }

        scanner.close();
    }
}
