import java.util.Scanner;

public class SumaNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        while (!sc.hasNextDouble()) {
            System.out.println("Entrada no válida. Introduce un número.");
            sc.next();
            System.out.print("Introduce el primer número: ");
        }
        double a = sc.nextDouble();

        System.out.print("Introduce el segundo número: ");
        while (!sc.hasNextDouble()) {
            System.out.println("Entrada no válida. Introduce un número.");
            sc.next();
            System.out.print("Introduce el segundo número: ");
        }
        double b = sc.nextDouble();

        double suma = a + b;
        System.out.printf("La suma de %.2f y %.2f es: %.2f%n", a, b, suma);
        sc.close();
    }
}
