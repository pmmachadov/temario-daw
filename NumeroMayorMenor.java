import java.util.Scanner;

public class NumeroMayorMenor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leer primer número para inicializar mayor y menor
        double numero;
        System.out.print("Introduce un número: ");
        while (!sc.hasNextDouble()) {
            System.out.println("Entrada no válida. Introduce un número.");
            sc.next();
            System.out.print("Introduce un número: ");
        }
        numero = sc.nextDouble();

        double mayor = numero;
        double menor = numero;

        int contador = 1; // ya leímos 1 número

        // Bucle optimizado: leer los restantes hasta completar 3 números
        while (contador < 3) {
            System.out.print("Introduce otro número: ");
            if (!sc.hasNextDouble()) {
                System.out.println("Entrada no válida. Introduce un número.");
                sc.next(); // descartar token inválido
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
