import VariablesYTiposDeDatos.Taller1;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        Taller1.calcularPromedio(scanner);
        scanner.nextLine(); // ← limpia el ENTER antes de pedir texto
        Taller1.perfilDeUsuario(scanner);
        scanner.close();
    }
}
