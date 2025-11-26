import java.util.Scanner;

public class mySuma {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa un numero");
        int numero1 = entrada.nextInt();

        System.out.println("Ingresa otro numero");
        int numero2 = entrada.nextInt();

        int resultado = numero1 + numero2;
        System.out.println("La suma de los numeros es " + resultado);

        entrada.close();
    }
}
