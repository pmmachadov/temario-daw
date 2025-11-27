
/**
 * CalculadoraDosNumeros
 *
 * Resumen: Pide dos números al usuario y una operación desde un menú
 * (1: Suma, 2: Resta, 3: Multiplicación, 4: División). La resta se realiza
 * siempre entre el número mayor y el menor. Se detecta la división entre 0
 * como imposible.
 */

import java.util.Scanner;

public class CalculadoraDosNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num1 = readDouble(sc, "Introduzca el primer número: ");
        double num2 = readDouble(sc, "Introduzca el segundo número: ");

        int opcion = readIntInRange(sc,
                "Seleccione una opción:\n 1 = Suma\n 2 = Resta\n 3 = Multiplicación\n 4 = División\nOpción: ",
                1, 4);

        switch (opcion) {
            case 1:
                System.out.println("La suma es: " + (num1 + num2));
                break;
            case 2: {
                double mayor = Math.max(num1, num2);
                double menor = Math.min(num1, num2);
                System.out.println("La resta es: " + (mayor - menor));
                break;
            }
            case 3:
                System.out.println("La multiplicación es: " + (num1 * num2));
                break;
            case 4: {
                double mayor = Math.max(num1, num2);
                double menor = Math.min(num1, num2);
                if (menor == 0.0) {
                    System.out.println("La división entre 0 es imposible.");
                } else {
                    System.out.println("La división es: " + (mayor / menor));
                }
                break;
            }
            default:
                System.out.println("Opción no válida.");
        }

        sc.close();
    }

    private static double readDouble(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            String line = sc.nextLine().trim();
            try {
                return Double.parseDouble(line);
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida: se esperaba un número. Inténtelo de nuevo.");
            }
        }
    }

    private static int readIntInRange(Scanner sc, String prompt, int min, int max) {
        while (true) {
            System.out.print(prompt);
            String line = sc.nextLine().trim();
            try {
                int v = Integer.parseInt(line);
                if (v >= min && v <= max)
                    return v;
                System.out.println("Opción fuera de rango. Inténtelo de nuevo.");
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida: se esperaba un número entero. Inténtelo de nuevo.");
            }
        }
    }
}
