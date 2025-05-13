package PoliYHerencia.Herencia;

public class Trabajador extends Persona{
    int codigoTrabajador;
    String cargo;

    public Trabajador(String pais, String apellido, String nombre, int codigoTrabajador, String cargo) {
        super(pais, apellido, nombre);
        this.codigoTrabajador = codigoTrabajador;
        this.cargo = cargo;
    }

    public int getCodigoTrabajador() {
        return codigoTrabajador;
    }

    public void setCodigoTrabajador(int codigoTrabajador) {
        this.codigoTrabajador = codigoTrabajador;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void mostrar(){
        System.out.println("nombre"+getNombre());
    }
}
