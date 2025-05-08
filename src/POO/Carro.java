package POO;

public class Carro {
    // Atributos
    private String marca;
    private String modelo;
    private int año;
    private boolean encendido;


    // Constructor
    public Carro(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.encendido = false; // Al crear el carro, está apagado
    }

    // Métodos
    public void encender() {
        if (!encendido) {
            encendido = true;
            System.out.println("El carro está encendido.");
        } else {
            System.out.println("El carro ya estaba encendido.");
        }
    }

    public void apagar() {
        if (encendido) {
            encendido = false;
            System.out.println("El carro se ha apagado.");
        } else {
            System.out.println("El carro ya estaba apagado.");
        }
    }

    public void mostrarInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + año);
        System.out.println("Estado: " + (encendido ? "Encendido" : "Apagado"));



//        if (encendido) {
//            System.out.println("Estado: Encendido");
//        } else {
//            System.out.println("Estado: Apagado");
//        }
    }
}
