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

**Algoritmo (Diseño / Pseudocódigo):**

- Leer entrada.
- Si la entrada no es un entero: escribir "Entrada no válida: se esperaba un número entero." y terminar.
- Si es entero, usar `switch` sobre el valor:
  - caso 1 → escribir `Lunes`
  - caso 2 → escribir `Martes`
  - caso 3 → escribir `Miércoles`
  - caso 4 → escribir `Jueves`
  - caso 5 → escribir `Viernes`
  - caso 6 → escribir `Sábado`
  - caso 7 → escribir `Domingo`
  - default → escribir `El número introducido no es válido.`

**Complejidad:**

- **Tiempo:** O(1) — operaciones constantes.
- **Espacio:** O(1) — uso de variables escalares.

**Implementación Java (código completo):**

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

**Compilar y ejecutar (PowerShell):**

```powershell
cd 'c:\Users\pmachado\Desktop\trabajo\2\temario-daw'
javac DiaSemana.java
java DiaSemana
```

**Pruebas ejecutadas (salidas esperadas):**

- Ejecutar `java DiaSemana` y teclear `1` → imprime: `Lunes`
- Ejecutar `java DiaSemana` y teclear `4` → imprime: `Jueves`
- Ejecutar `java DiaSemana` y teclear `8` → imprime: `El número introducido no es válido.`
- Ejecutar `java DiaSemana` y teclear `a` → imprime: `Entrada no válida: se esperaba un número entero.`

**Comentarios y mejoras:**

- Alternativa más compacta: usar un array `String[] dias = {"Lunes","Martes","Miércoles","Jueves","Viernes","Sábado","Domingo"};` y validar `if (num>=1 && num<=7) System.out.println(dias[num-1]);` para evitar el `switch`.
- Si se requiere mucho I/O (varias entradas), preferir `BufferedReader` por rendimiento frente a `Scanner`.
- Para uso como librería, en vez de imprimir se podría devolver el `String` del día y lanzar `IllegalArgumentException` en caso de entrada inválida (mejor para pruebas unitarias).

**Ubicación del código en el repo:**

- Archivo Java: `DiaSemana.java` (creado en la raíz del repositorio).

---

Archivo generado automáticamente por el asistente. Si quieres que ejecute los
casos aquí y pegue las salidas reales, dime y lo ejecuto en PowerShell.
