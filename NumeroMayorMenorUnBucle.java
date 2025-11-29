import java.util.Scanner;

public class NumeroMayorMenorUnBucle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double numero;
        double mayor = Double.NEGATIVE_INFINITY;
        double menor = Double.POSITIVE_INFINITY;

        int contador = 0;
        final int TOTAL = 3; // leer 3 números

        while (contador < TOTAL) {
            System.out.print("Introduce un número: ");
            if (!sc.hasNextDouble()) {
                System.out.println("Entrada no válida. Introduce un número.");
                sc.next(); // limpiar token inválido
                continue;
            }

            numero = sc.nextDouble();

            if (numero > mayor) {
                mayor = numero;
            }
            if (numero < menor) {
                menor = numero;
            }

            contador++;
        }

        System.out.printf("El número mayor es: %.2f, y el número menor es: %.2f%n", mayor, menor);
        sc.close();
    }
}
