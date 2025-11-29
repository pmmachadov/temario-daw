import java.util.Scanner;

public class NumeroMayorMenor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Declarar variables (se inicializan tras leer el primer número)
        double numero, mayor, menor;
        int contador;
        System.out.print("Introduce un número: ");
        while (!sc.hasNextDouble()) {
            System.out.println("Entrada no válida. Introduce un número.");
            sc.next(); // Descartar token inválido
            System.out.print("Introduce un número: ");
        }
        numero = sc.nextDouble(); // Leer el primer número

        // inicializar mayor/menor/contador a partir del primer número leído
        mayor = numero;
        menor = numero;

        contador = 1; // ya leímos 1 número

        // Bucle optimizado: leer los restantes hasta completar 3 números
        while (contador < 3) {
            System.out.print("Introduce otro número: ");
            if (!sc.hasNextDouble()) {
                System.out.println("Entrada no válida. Introduce un número.");
                sc.next(); // descartar token inválido
                continue;
            }

            numero = sc.nextDouble(); // Leer el siguiente número

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
