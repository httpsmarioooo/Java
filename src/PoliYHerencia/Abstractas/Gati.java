package PoliYHerencia.Abstractas;

public class Gati extends Animal{


    public Gati(String nombre, int peso) {
        super(nombre, peso);
    }

    @Override
    public String hacerSonido() {
      return "Miauuuu";
    }
}
