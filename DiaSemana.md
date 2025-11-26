**Resumen:**

- **Resumen:** Programa que lee un número entero (1–7) y muestra el día de la semana
  correspondiente en español.

**Entradas:**

- **`num` (int):** número entero leído por teclado; se espera que esté en 1..7.

**Salidas:**

- Imprime en consola el nombre del día correspondiente (`Lunes` .. `Domingo`) o
  un mensaje de error si la entrada no es válida.

**Restricciones:**

- `num` debe ser un entero; valores válidos 1..7. Si la entrada no es entera,
  se muestra un mensaje indicando entrada no válida.

**Casos de prueba:**

- Entrada: `1` → Salida esperada: `Lunes`
- Entrada: `4` → Salida esperada: `Jueves`
- Entrada: `7` → Salida esperada: `Domingo`
- Entrada: `8` → Salida esperada: `El número introducido no es válido.`
- Entrada: `a` (no numérica) → Salida esperada: `Entrada no válida: se esperaba un número entero.`

**Algoritmo (diseño):**

- Pseudocódigo:
  - leer entrada
  - si la entrada no es un entero: escribir mensaje de entrada no válida y terminar
  - según el valor entero (switch/case 1..7): imprimir nombre del día
  - si no está en 1..7: imprimir "El número introducido no es válido."

**Complejidad:**

- Tiempo: O(1) — operaciones constantes (lectura y selección)
- Espacio: O(1) — solo variables escalares

**Implementación Java:**

```java
/**
 * DiaSemana
 *
 * Resumen: Programa que pide un número (1-7) y escribe el día de la semana
 * correspondiente en español.
 */
import java.util.Scanner;

public class DiaSemana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número (1-7): ");
        if (!sc.hasNextInt()) {
            System.out.println("Entrada no válida: se esperaba un número entero.");
            sc.close();
            return;
        }
        int num = sc.nextInt();

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
                System.out.println("El número introducido no es válido.");
                break;
        }

        sc.close();
    }
}
```

**Pruebas ejecutadas:**

- (Simuladas) Salidas esperadas al ejecutar `java DiaSemana` y teclear la entrada:
  - Entrada `1` → `Lunes`
  - Entrada `4` → `Jueves`
  - Entrada `8` → `El número introducido no es válido.`
  - Entrada `a` → `Entrada no válida: se esperaba un número entero.`

**Comentarios y mejoras:**

- Alternativa: usar un array `String[] dias = {"Lunes",...,"Domingo"};` y
  comprobar índice `num-1` para acortar el código.
- Para grandes cantidades de I/O, usar `BufferedReader` en vez de `Scanner`.
- Validaciones adicionales podrían lanzar `IllegalArgumentException` si se
  prefiere que el programa falle en modo biblioteca en vez de imprimir.

**Ubicación del código:**

- Archivo Java: `DiaSemana.java` en la raíz del repositorio.
