import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1;
        while (true) {
            System.out.print("Introduce un numero");
            String line = sc.nextLine().trim();
            try {
                num1 = Double.parseDouble(line);
                break;
            } catch (Exception e) {
                System.out.println("No es un numero valido");
            }
        }

        double num2;
        while (true) {
            System.out.println("Introduce el segundo numero");
            String line = sc.nextLine().trim();
            try {
                num2 = Double.parseDouble(line);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Entrada no valida");

            }
        }

        double mayor = Math.max(num1, num2);
        double menor = Math.min(num1, num2);

        int opcion;
        while (true) {
            System.out.print(
                    "Seleccione una opción:\n 1 = Suma\n 2 = Resta\n 3 = Multiplicación\n 4 = División\nOpción: ");
        }

    }
}
