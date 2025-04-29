//import VariablesYTiposDeDatos.Taller1;
import OperadoresLogicos.OperadoresLogicos;
import java.util.Scanner;


public class Main {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        //      Taller1.calcularPromedio(scanner);
        //      scanner.nextLine(); // ← limpia el ENTER antes de pedir texto
        //      Taller1.perfilDeUsuario(scanner);

        OperadoresLogicos.main(args);  // ← ejecuta el main de esa clase
      scanner.close();
    }
}
