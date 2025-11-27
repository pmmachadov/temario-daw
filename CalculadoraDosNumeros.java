import java.util.Scanner;

public class CalculadoraDosNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1;
        while (true) {
            System.out.print("Introduzca el primer número: ");
            String line = sc.nextLine().trim();
            try {
                num1 = Double.parseDouble(line);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida: se esperaba un número. Inténtelo de nuevo.");
            }
        }

        double num2;
        while (true) {
            System.out.print("Introduzca el segundo número: ");
            String line = sc.nextLine().trim();
            try {
                num2 = Double.parseDouble(line);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida: se esperaba un número. Inténtelo de nuevo.");
            }
        }

        // Calculamos mayor y menor una sola vez
        double mayor = Math.max(num1, num2);
        double menor = Math.min(num1, num2);

        int opcion;
        while (true) {
            System.out.print(
                    "Seleccione una opción:\n 1 = Suma\n 2 = Resta\n 3 = Multiplicación\n 4 = División\nOpción: ");
            String line = sc.nextLine().trim();
            try {
                opcion = Integer.parseInt(line);
                if (opcion >= 1 && opcion <= 4)
                    break;
                System.out.println("Opción fuera de rango. Inténtelo de nuevo.");
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida: se esperaba un número entero. Inténtelo de nuevo.");
            }
        }

        String salida;
        switch (opcion) {
            case 1:
                salida = "La suma es: " + (num1 + num2);
                break;
            case 2:
                salida = "La resta es: " + (mayor - menor);
                break;
            case 3:
                salida = "La multiplicación es: " + (num1 * num2);
                break;
            case 4:
                if (menor == 0.0)
                    salida = "La división entre 0 es imposible.";
                else
                    salida = "La división es: " + (mayor / menor);
                break;
            default:
                salida = "Opción no válida.";
        }

        System.out.println(salida);

        sc.close();
    }

}
