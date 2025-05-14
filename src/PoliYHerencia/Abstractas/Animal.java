package PoliYHerencia.Abstractas;

 public abstract  class Animal {
     private final String nombre;
     private final int peso;


     public Animal(String nombre, int peso) {
         this.nombre = nombre;
         this.peso = peso;
     }

     public int getPeso() {
         return peso;
     }

     public String getNombre() {
         return nombre;
     }

     public abstract String hacerSonido();
 }
