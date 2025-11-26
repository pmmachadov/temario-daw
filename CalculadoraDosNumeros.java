
/**
 * CalculadoraDosNumeros
 *
 * Resumen: Pide dos números al usuario y una operación desde un menú
 * (1: Suma, 2: Resta, 3: Multiplicación, 4: División). La resta se realiza
 * siempre entre el número mayor y el menor. Se detecta la división entre 0
 * como imposible.
 *
 * Entradas:
 *  - num1 (real) : primer número (se permite decimal)
 *  - num2 (real) : segundo número
 *  - opcion (int) : elección de operación 1..4
 *
 * Salidas:
 *  - Resultado de la operación o mensaje de error/información (p.ej. "La división
 *    entre 0 es imposible.").
 *
 * Casos de prueba:
 *  - num1=5, num2=3, opcion=1 -> "La suma es: 8.0"
 *  - num1=2, num2=7, opcion=2 -> resta entre mayor y menor -> "La resta es: 5.0"
 *  - num1=4, num2=0, opcion=4 -> "La división entre 0 es imposible."
 *  - num1=3.5, num2=2, opcion=3 -> "La multiplicación es: 7.0"
 *
 * Pseudocódigo (estilo Java):
 *  - Abrir Scanner sc
 *  - Leer num1 (reintentar hasta que sea un número válido)
 *  - Leer num2 (reintentar hasta que sea un número válido)
 *  - Mostrar menú y leer opcion (reintentar hasta que opción válida 1..4)
 *  - switch(opcion):
 *      case 1: imprimir num1+num2
 *      case 2: imprimir max(num1,num2)-min(num1,num2)
 *      case 3: imprimir num1*num2
 *      case 4: si num2 == 0 -> imprimir mensaje de imposible; sino imprimir num1/num2
 *  - Cerrar scanner
 *
 * Complejidad: O(1) tiempo y O(1) espacio.
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
                // no debería ocurrir por la validación previa
                System.out.println("Opción no válida.");
        }

        sc.close();
    }

    /**
     * Lee un número real desde el Scanner reintentando hasta obtener un double
     * válido.
     */
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

    /**
     * Lee un entero en un rango [min..max] reintentando hasta que sea válido.
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
