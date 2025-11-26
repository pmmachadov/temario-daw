# Ejercicio: Ejemplo — Suma de dos enteros

**Resumen**

Programa que solicita dos enteros por teclado y muestra su suma.

**Entradas**

- Dos enteros (`int`) leídos desde la entrada estándar (teclado).
- Cada número se introduce seguido de `Enter` (puedes escribir ambos en la misma línea separados por espacio y pulsar Enter).

**Salidas**

- Imprime una línea con `Resultado: N` donde `N` es la suma de los dos enteros.
- Si alguna entrada no es un entero válido, imprime `Entrada inválida: se esperaba un entero.` y finaliza.

**Restricciones / Supuestos**

- Se usan tipos `int` de Java (rango -2^31 .. 2^31-1).
- No se realiza comprobación explícita de overflow.
- Interacción en modo consola (no se requiere usar `echo`).

**Casos de prueba**

- Normal: entrada `3` y `4` → salida `Resultado: 7`.
- Borde (máximo): entrada `2147483647` y `0` → salida `Resultado: 2147483647`.
- Error de formato: entrada `a` y `3` → salida `Entrada inválida: se esperaba un entero.`

**Algoritmo (pseudocódigo)**

- Abrir lector (Scanner) para entrada estándar.
- Solicitar primer entero; leer y validar; si no es entero mostrar error y terminar.
- Solicitar segundo entero; leer y validar; si no es entero mostrar error y terminar.
- Calcular la suma usando un método separado.
- Mostrar `Resultado: ` + suma.
- Cerrar lector.

**Complejidad**

- Tiempo: O(1).
- Espacio: O(1).

**Implementación Java**

Archivo: `Ejemplo.java`

```java
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Clase de ejemplo para sumar dos enteros leídos desde la entrada estándar.
 * El programa solicita dos enteros al usuario, valida que la entrada sea
 * realmente un entero y muestra la suma.
 */
public class Ejemplo {
    /**
     * Punto de entrada del programa.
     * @param args argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {
        // Usamos try-with-resources para cerrar automáticamente el Scanner
        try (Scanner lector = new Scanner(System.in)) {
            // Pedimos y validamos el primer entero
            System.out.println("Introduce el primer entero:");
            int primerEntero;
            try {
                primerEntero = lector.nextInt();
            } catch (InputMismatchException e) {
                // Si la entrada no es un entero, informamos y salimos
                System.out.println("Entrada inválida: se esperaba un entero.");
                return;
            }

            // Pedimos y validamos el segundo entero
            System.out.println("Introduce el segundo entero:");
            int segundoEntero;
            try {
                segundoEntero = lector.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida: se esperaba un entero.");
                return;
            }

            // Calculamos la suma delegando en un método separado
            int sumaResultado = sumar(primerEntero, segundoEntero);
            // Mostramos el resultado al usuario
            System.out.println("Resultado: " + sumaResultado);
        }
    }

    /**
     * Suma dos enteros y devuelve el resultado.
     * @param num1 primer sumando
     * @param num2 segundo sumando
     * @return la suma de num1 y num2
     */
    public static int sumar(int num1, int num2) {
        return num1 + num2;
    }
}
```

**Pruebas ejecutadas (comandos y salida)**

- Compilar:

```powershell
javac Ejemplo.java
```

- Ejecutar (interactivo):

```powershell
java Ejemplo
# luego escribir 3 <Enter> y 4 <Enter>
# salida: Resultado: 7
```

- Prueba automática (solo verificación):

```powershell
echo 7 8 | java Ejemplo
# salida:
# Introduce el primer entero:
# Introduce el segundo entero:
# Resultado: 15
```

**Comentarios y mejoras**

- Manejar overflow usando `long` o comprobaciones explícitas.
- Añadir opción para aceptar argumentos por línea de comandos: `java Ejemplo 3 4`.
- Añadir pruebas unitarias con JUnit para el método `sumar`.
- Internacionalizar mensajes o añadir modo silencioso (solo imprimir el número).

**Comandos rápidos**

```powershell
javac Ejemplo.java
java Ejemplo
```

---

Archivo generado automáticamente con la documentación del ejercicio `Ejemplo`.
