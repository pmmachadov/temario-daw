import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        try (Scanner reciveDatos = new Scanner(System.in)) {
            System.out.print("Introduce un número entero: ");
            if (reciveDatos.hasNextInt()) {
                int primerEntero = reciveDatos.nextInt();
                System.out.println("Has introducido: " + primerEntero);
            } else {
                System.out.println("Entrada no válida.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
