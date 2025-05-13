package PoliYHerencia.Herencia;

public class Externo extends Persona {
    String empresaAsociada;
    int rut;

    public Externo() {
    }

    public Externo(String pais, String apellido, String nombre, String empresaAsociada, int rut) {
        super(pais, apellido, nombre);
        this.empresaAsociada = empresaAsociada;
        this.rut = rut;
    }

    public String getEmpresaAsociada() {
        return empresaAsociada;
    }

    public void setEmpresaAsociada(String empresaAsociada) {
        this.empresaAsociada = empresaAsociada;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public void mostrar(){
        System.out.println("NOMBRE: "+getNombre()+"RUT :"+getRut());
    }
}
