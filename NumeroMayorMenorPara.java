import java.util.Scanner;

public class NumeroMayorMenorPara {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double mayor = 0;
        double menor = 0;
        double numero;

        for (int i = 1; i <= 3; i++) {
            System.out.print(i == 1 ? "Introduce un número: " : "Introduce otro número: ");

            if (!sc.hasNextDouble()) {
                System.out.println("Entrada no válida. Introduce un número.");
                sc.next(); // descartar token inválido
                i--; // repetir la misma iteración
                continue;
            }

            numero = sc.nextDouble();

            if (i == 1) {
                mayor = numero;
                menor = numero;
            } else {
                if (numero > mayor) mayor = numero;
                if (numero < menor) menor = numero;
            }
        }

        System.out.printf("El número mayor es: %.2f, y el número menor es: %.2f%n", mayor, menor);
        sc.close();
    }
}
