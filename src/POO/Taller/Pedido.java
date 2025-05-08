package POO.Taller;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private int numeroPedido;
    private String nombreCliente;
    private double total;
    private List<String> productos;


    public Pedido() {
        productos = new ArrayList<>();
        total = 0.0;
    }

    public Pedido(int numeroPedido, String nombreCliente) {
        this.numeroPedido = numeroPedido;
        this.nombreCliente = nombreCliente;
        productos = new ArrayList<>();
        total = 0.0;
    }

    public void agregarProducto(String producto, double precio) {
        productos.add(producto);
        total += precio;
    }

    public void calcularDescuento(double porcentaje) {
        if (porcentaje >= 0 && porcentaje <= 100) {
            double descuento = total * (porcentaje / 100);
            total -= descuento;
            System.out.println("Descuento aplicado: " + porcentaje + "%");
        } else {
            System.out.println("Descuento inválido: " + porcentaje + "%. Debe estar entre 0 y 100.");
        }
    }

    // Setters para constructor vacío
    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void mostrarInfo() {
        System.out.println("-----------------------------------");
        System.out.println("Número de pedido: " + numeroPedido);
        System.out.println("Cliente: " + nombreCliente);
        System.out.println("Productos:");
        for (String producto : productos) {
            System.out.println(" - " + producto);
        }
        System.out.println("Total: $" + total);
        System.out.println("--------------------------------------");
    }

}
