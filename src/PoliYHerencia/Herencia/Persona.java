package PoliYHerencia.Herencia;

public class Persona {
        String nombre;
        String apellido;
        String pais;

    public Persona() {
    }

    public Persona(String pais, String apellido, String nombre) {
        this.pais = pais;
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }


}


