import java.util.Scanner;

public class DiaSemana {
    public static void main(String[] args) {
        // abrir scanner para leer de teclado
        Scanner sc = new Scanner(System.in);

        int num;

        while (true) {
            // pedir entrada y limpiar token
            System.out.print("Introduzca un número (1-7): ");
            // leer línea completa y eliminar espacios en blanco alrededor
            String token = sc.nextLine().trim();

            // intentar convertir a entero
            try {
                num = Integer.parseInt(token);

                // usar switch para comprobar 1..7 y mostrar día
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
                        // número fuera de 1..7 -> volver a pedir
                        System.out.println("El número introducido no es válido. Inténtelo de nuevo.");
                        continue; // vuelve a la siguiente iteración del while
                }

                // si llegamos aquí, se imprimió un día válido -> salir del bucle
                break;

            } catch (NumberFormatException e) {
                // token no es un entero
                System.out.println("Entrada no válida: se esperaba un número entero. Inténtelo de nuevo.");
                // vuelve a pedir (fin del catch, el while repite)
            }
        }

        // cerrar scanner
        sc.close();
    }
}
