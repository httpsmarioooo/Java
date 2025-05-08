package POO.Taller;

public class Auto {
    private String marca;
    private String modelo;
    private int anio;
    private int kilometraje;

    // Constructor vacío
    public Auto() {
        this.kilometraje = 0;
    }

    // Constructor parametrizado
    public Auto(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.kilometraje = 123;
    }

    // Setters
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void actualizarKilometraje(int km) {
        if (km > 0) {
            kilometraje += km;
            System.out.println("Kilometraje actualizado en +" + km + " km.");
        } else {
            System.out.println("Kilometraje inválido. Debe ser un número positivo.");
        }
    }

    public void mostrarInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + anio);
        System.out.println("-----------------------------------");
    }

    // Mostrar información detallada si se pide
    public void mostrarInfo(boolean detallado) {
        mostrarInfo();
        if (detallado) {
            System.out.println("Kilometraje: " + kilometraje + " km");
            System.out.println("-----------------------------------");
        }
    }
}
