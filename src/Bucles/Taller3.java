package Bucles;
import java.util.Scanner;

public class Taller3 {
    public static void puntoUno(){
        Scanner scanner = new Scanner(System.in);

        int hamburguesa = 50;
        int papas = 30;
        int refresco = 20;

        int opcion;
        int billetera;
        int precioUnitario;
        int totalCompra = 0;

        do{
            System.out.println("KFC:");
            System.out.println("Seleccione el tipo de comida que desea comprar:");
            System.out.println("1. Hamburguesa ($" + hamburguesa + ")");
            System.out.println("2. Papas ($" + papas + ")");
            System.out.println("3. Bebida ($" + refresco + ")");
            System.out.println("4. Finalizar con la compra");
            System.out.println("5. Salir");
            opcion = scanner.nextInt();

            precioUnitario = 0;

            switch (opcion) {
                case 1:
                    precioUnitario = hamburguesa;
                    break;
                case 2:
                    precioUnitario = papas;
                    break;
                case 3: ;
                    precioUnitario = refresco;
                    break;
                case 4: ;
                    System.out.println("Total acumulado: $" + totalCompra);
                    System.out.print("¿Con cuánto vas a pagar? $");
                    billetera = scanner.nextInt();

                    if (billetera >= totalCompra) {
                        System.out.println("Gracias por tu compra. Tu cambio es: $" + (billetera - totalCompra));
                    } else {
                        System.out.println("Saldo insuficiente. No puedes pagar la compra.");
                    }
                break;
                case 5:
                    System.out.println("¡Gracias por su visita! ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }

            if (opcion >= 1 && opcion <= 3) {
                System.out.print("Ingrese la cantidad de productos: ");
                int cantidad = scanner.nextInt();

                int subtotal = precioUnitario * cantidad;
                totalCompra += subtotal;
                System.out.println("Subtotal agregado: $" + subtotal);
            }
        } while (opcion!= 5);
    }

    public static void puntoDos(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del producto: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el valor del producto: ");
        int precio = scanner.nextInt();
//        for (int descuento = 10; descuento <= 50; descuento += 10) {
//            double montoDescuento = precio * descuento / 100;
//            double precioFinal = precio - montoDescuento;
//            System.out.println(descuento + "% de descuento: $" + precioFinal);
//        }
        // Array de porcentajes de descuento
        int[] descuentos = {10, 20, 30, 40, 50};

        // Calcular y mostrar precios con descuento
        System.out.println("\n--- Precios con descuento ---");
        for (int i = 0; i < descuentos.length; i++) {
            int porcentaje = descuentos[i];
            double descuento = precio * porcentaje /100;
            double precioFinal = precio - descuento;
            System.out.println(porcentaje + "% de descuento: $" + precioFinal);
        }
    }

    public static void puntoTres (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero del 1 al 10");
        int numero = scanner.nextInt();

        if (numero < 1 || numero >10 ){
            System.out.println("El numero es incorrecto");
        } else {
            System.out.println("Tabla de multiplicar del numero: "+numero);
            int multiplicador = 1;
            while (multiplicador <= 10){
                int resultado = numero * multiplicador;
                System.out.println(+numero+ "x" +multiplicador+":"+resultado);
                multiplicador++;
            }
        }
    }
}
