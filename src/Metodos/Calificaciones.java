package Metodos;

public class Calificaciones {
    public static double calificaciones(double notaUno, double notaDos, double notaTres){
        double promedio = (notaUno + notaDos + notaTres) / 3;
        return promedio;
    }

    //Propuesta hecha por Michaell  - Nos gustó la idea de poner el if  por separado.
//    public static String aprobado(double nota_final){
//        if (nota_final>=60){
//            return "El estudiante aprobó";
//        }
//        return "El estudiante reprobó";
//    }
//
//    public static void imprime(double nota1, double nota2, double nota3){
//        double resultado=promedio(nota1,nota2,nota3);
//        String pasa= aprobado(resultado);
//        System.out.println("la nota promedio es: "+resultado);
//        System.out.println(pasa);
//    }


    public static void mostrar (double notaUno, double notaDos, double notaTres){
        double promedio = calificaciones(notaUno, notaDos, notaTres);
        System.out.println("Resultado de tu promedio: " + promedio);

        if (promedio >= 60) {
            System.out.println("¡Aprobó!");
        } else {
            System.out.println("Perdió.");
        }
    }
}

