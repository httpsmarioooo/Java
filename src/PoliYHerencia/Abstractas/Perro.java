package PoliYHerencia.Abstractas;

public class Perro extends Animal{


    public Perro(String nombre, int peso) {
        super(nombre, peso);
    }

    @Override
    public String hacerSonido() {
       return "Gua guaaa";

    }
}
