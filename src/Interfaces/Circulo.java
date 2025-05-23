package Interfaces;

public class Circulo implements Figura,Dibujable,Rotable {

    private final double radio;

    
    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public void dibujar() {
        System.out.println("Estoy dibujando un circulo");
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public void rotar() {

    }
}
