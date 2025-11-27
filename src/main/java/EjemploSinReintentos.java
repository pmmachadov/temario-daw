import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Versión sin reintentos: pide dos enteros y si alguna entrada no es válida
 * termina mostrando un mensaje de error.
 */
public class EjemploSinReintentos {
    public static void main(String[] args) {
        try (Scanner lector = new Scanner(System.in)) {
            System.out.println("Introduce el primer entero:");
            int primerEntero;
            try {
                primerEntero = lector.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida: se esperaba un entero.");
                return;
            }

            System.out.println("Introduce el segundo entero:");
            int segundoEntero;
            try {
                segundoEntero = lector.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida: se esperaba un entero.");
                return;
            }

            int sumaResultado = sumar(primerEntero, segundoEntero);
            System.out.println("Resultado: " + sumaResultado);
        }
    }

    public static int sumar(int num1, int num2) {
        return num1 + num2;
    }
}
