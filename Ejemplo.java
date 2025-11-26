import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejemplo {
    public static void main(String[] args) {
        try (Scanner lector = new Scanner(System.in)) {
            int primerEntero;
            while (true) {
                System.out.println("Introduce el primer entero:");
                try {
                    primerEntero = lector.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Entrada inválida: se esperaba un entero. Inténtalo de nuevo.");
                    lector.next();
                }
            }

            int segundoEntero;
            while (true) {
                System.out.println("Introduce el segundo entero:");
                try {
                    segundoEntero = lector.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Entrada inválida: se esperaba un entero. Inténtalo de nuevo.");
                    lector.next();
                }
            }

            int sumaResultado = sumar(primerEntero, segundoEntero);
            System.out.println("Resultado: " + sumaResultado);
        }
    }

    public static int sumar(int num1, int num2) {
        return num1 + num2;
    }
}
