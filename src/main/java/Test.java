import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num;

            while (true) {
                System.out.print("Introduzca un número (1-7): ");
                String token = sc.nextLine().trim();
                try {
                    num = Integer.parseInt(token);
                    switch (num) {
                        case 1:
                            System.out.println("Lunes");
                            break;
                        case 2:
                            System.out.println("Martes");
                            break;
                        case 3:
                            System.out.println("Miércoles");
                            break;
                        case 4:
                            System.out.println("Jueves");
                            break;
                        case 5:
                            System.out.println("Viernes");
                            break;
                        case 6:
                            System.out.println("Sábado");
                            break;
                        case 7:
                            System.out.println("Domingo");
                            break;
                        default:
                            System.out.println("El número introducido no es válido. Inténtelo de nuevo.");
                            continue;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("lajdljadlfjd");
                }
            }
        }
    }
}
