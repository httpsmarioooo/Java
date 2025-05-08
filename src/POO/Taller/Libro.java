package POO.Taller;

public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private boolean disponible;

    public Libro (String titulo, String autor, int anioPublicacion){
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.disponible =  true;
    }

    public void prestar() {
        if (disponible){
            disponible = false;
            System.out.println("El libro se prestó");
        } else {
            System.out.println("El libro ya ha sido prestado");
        }
    }

    public void devolver() {
        disponible = true;
        System.out.println("El libro se devolvió");
    }

    public void mostrarInfo(){
        System.out.println("Titulo del libro: "+titulo);
        System.out.println("Marca del libro: "+autor);
        System.out.println("Año del publicación del libro: "+anioPublicacion);
        System.out.println("------------------------------------------------");
        System.out.println("Estado: "+(disponible ? "Disponible": "Prestado"));
        System.out.println("------------------------------------------------");
    }
}
