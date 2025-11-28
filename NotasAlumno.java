import java.util.Scanner;

public class NotasAlumno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        double acumulador = 0.0;

        while (contador < 3) {
            System.out.print("Introduce la nota " + (contador + 1) + " (0-10): ");
            if (!sc.hasNextDouble()) {
                System.out.println("Entrada no válida. Introduce un número.");
                sc.next(); // descartar token inválido
                continue;
            }

            double nota = sc.nextDouble();
            if (nota < 0 || nota > 10) {
                System.out.println("Nota fuera de rango. Debe estar entre 0 y 10.");
                continue;
            }

            acumulador += nota;
            contador++;
        }

        double media = acumulador / 3.0;
        System.out.printf("La nota media del alumno es: %.2f%n", media);
        sc.close();
    }
}
