
/**
 * CalculadoraDosNumerosInt
 *
 * Versión del programa `CalculadoraDosNumeros` adaptada para trabajar SOLO con
 * números enteros (type `int`). Este fichero incluye comentarios que indican
 * las diferencias relevantes con respecto a la versión original (que usaba
 * `double`).
 *
 * Diferencias principales respecto a `CalculadoraDosNumeros.java`:
 * - Tipos: usa `int` en lugar de `double` para todas las entradas y operaciones.
 * - Lectura: se usa `Integer.parseInt` (método `readInt`) en lugar de
 *   `Double.parseDouble` (método `readDouble`).
 * - División: la división entre enteros es división entera (trunca hacia 0).
 *   Aquí se muestra el cociente entero y el resto (`%`) cuando la división
 *   es posible. En la versión `double` se muestra la división con decimales.
 * - Comprobaciones de 0: iguales conceptualmente, pero se comparan como `int`.
 * - Salida: los resultados se muestran como enteros; no hay notación decimal.
 *
 * Entrada / Salida esperada (ejemplos):
 *  - num1=5, num2=3, opcion=1 -> "La suma es: 8"
 *  - num1=2, num2=7, opcion=2 -> "La resta es: 5"
 *  - num1=4, num2=0, opcion=4 -> "La división entre 0 es imposible."
 *  - num1=7, num2=2, opcion=4 -> "La división entera es: 3 (resto 1)"
 */

import java.util.Scanner;

public class CalculadoraDosNumerosInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lectura de enteros en lugar de números reales
        int num1 = readInt(sc, "Introduzca el primer número entero: ");
        int num2 = readInt(sc, "Introduzca el segundo número entero: ");

        int opcion = readIntInRange(sc,
                "Seleccione una opción:\n 1 = Suma\n 2 = Resta\n 3 = Multiplicación\n 4 = División\nOpción: ",
                1, 4);

        switch (opcion) {
            case 1:
                // Suma de enteros
                System.out.println("La suma es: " + (num1 + num2));
                break;
            case 2: {
                // Resta entre mayor y menor (como en la versión double)
                int mayor = Math.max(num1, num2);
                int menor = Math.min(num1, num2);
                System.out.println("La resta es: " + (mayor - menor));
                break;
            }
            case 3:
                // Multiplicación entera
                System.out.println("La multiplicación es: " + (num1 * num2));
                break;
            case 4: {
                // División entera: mostramos cociente y resto.
                int mayor = Math.max(num1, num2);
                int menor = Math.min(num1, num2);
                if (menor == 0) {
                    System.out.println("La división entre 0 es imposible.");
                } else {
                    int cociente = mayor / menor; // división entera (truncamiento)
                    int resto = mayor % menor;
                    System.out.println("La división entera es: " + cociente + " (resto " + resto + ")");
                }
                break;
            }
            default:
                // No debería ocurrir por la validación previa
                System.out.println("Opción no válida.");
        }

        sc.close();
    }

    /**
     * Lee un entero desde el Scanner reintentando hasta obtener un int válido.
     * Equivalente a `readDouble` de la versión original, pero usando enteros.
     */
    private static int readInt(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            String line = sc.nextLine().trim();
            try {
                return Integer.parseInt(line);
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida: se esperaba un número entero. Inténtelo de nuevo.");
            }
        }
    }

    /**
     * Lee un entero en el rango [min..max] reintentando hasta que sea válido.
     * Reutiliza la misma lógica que la versión original aunque ésta trabajaba con
     * `int` para la opción también.
     */
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
