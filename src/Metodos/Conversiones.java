package Metodos;

public class Conversiones {

    public static double metrosACm(double metros){
        return metros * 100;
    }

    public static double kilogramosALibras (double kilogramos){
        return kilogramos * 2.20462;
    }

    public static double celciusAFare (double celcius){
        return (celcius * 9/5) + 32;
    }

    public static void mostrar(double metros, double kilogramos, double celcius){
        double centimetros = metrosACm(metros);
        double libras = kilogramosALibras(kilogramos);
        double fahrenheit = celciusAFare(celcius);

        System.out.println("Resultados de la conversión:");
        System.out.println(metros + " metros = " + centimetros + " centímetros");
        System.out.println(kilogramos + " kg = " + libras + " libras");
        System.out.println(celcius + " °C = " + fahrenheit + " °F");
    }
}
