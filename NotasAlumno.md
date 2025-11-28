--- [SECCIÓN: Resumen y Especificación] ---

# NotasAlumno

**Resumen:** Programa que pide 3 notas al usuario (valores reales entre 0 y 10), valida cada entrada y calcula la media aritmética.

**Entradas:**

- Tres números reales (double) leídos por consola; cada nota debe estar en el rango [0, 10].

**Salidas:**

- Mensajes de petición y validación por consola.
- Mensaje final con la nota media formateada a 2 decimales: `La nota media del alumno es: X.XX`.

**Restricciones / Supuestos:**

- Se asume entrada por consola (teclado). Si el token leído no es numérico, se solicita de nuevo.
- Si la nota está fuera del rango [0,10] se informa y se pide otra nota.
- El programa exige exactamente 3 notas válidas antes de calcular la media.

--- [SECCIÓN: Casos de prueba] ---

**Casos de prueba:**

1. Normal: entradas `7`, `8.5`, `6` → media = (7 + 8.5 + 6)/3 = 7.17
2. Borde: entradas `0`, `10`, `10` → media = 6.67
3. Error/recuperación: entradas `"abc"` (no numérico), `5`, `-1` (fuera rango), `7`, `8` → el programa descarta `"abc"`, rechaza `-1` y finalmente usa 5,7,8 → media = 6.67

--- [SECCIÓN: Pseudocódigo / Algoritmo] ---

Inicio
contador <- 0
acumulador <- 0.0
Mientras contador < 3 Hacer
  Escribir "Introduce la nota ", contador+1, " (0-10):"
  Si NO hay número disponible Entonces
    Escribir "Entrada no válida. Introduce un número."
    // descartar token inválido
    continuar
  FinSi
  leer nota como real
  Si nota < 0 OR nota > 10 Entonces
    Escribir "Nota fuera de rango. Debe estar entre 0 y 10."
    continuar
  FinSi
  acumulador <- acumulador + nota
  contador <- contador + 1
FinMientras
media <- acumulador / 3
Escribir "La nota media del alumno es: ", formatear(media, 2 decimales)
Fin

--- [SECCIÓN: Nassi–Shneiderman] ---

**Nassi–Shneiderman (estructura) — NotasAlumno**

Bloque principal (secuencia):

1. Inicio

   - contador <- 0
   - acumulador <- 0.0

2. Repetición (bloque de repetición con condición al inicio/medio según preferencia)

   - Condición: contador < 3
   - Cuerpo del bloque (ordenado):
     a) Escribir "Introduce la nota " + (contador+1) + " (0-10):"
     b) Leer token
     - Si token no es numérico: mostrar "Entrada no válida. Introduce un número." -> volver al inicio del bloque (sin incrementar contador)
     - Si es numérico: convertir a real -> nota
       c) Si nota < 0 OR nota > 10 entonces:
     - Mostrar "Nota fuera de rango. Debe estar entre 0 y 10." -> volver al inicio del bloque
       d) Si nota válida entonces:
     - acumulador <- acumulador + nota
     - contador <- contador + 1

3. Después de la repetición:

   - media <- acumulador / 3
   - Escribir "La nota media del alumno es: " + formatear(media, 2 decimales)

4. Fin

Notas de formato Nassi–Shneiderman:

- El bloque de repetición puede representarse como un rectángulo vertical que contiene dentro los pasos a)-d). Las decisiones internas (token numérico / rango) se representan como subdivisiones horizontales con condiciones que retornan al inicio del bloque cuando no se cumplen.

Variantes:

- Para N notas, sustituir las constantes 3 por N y dividir por N al final.
- Para implementación robusta, documentar el comportamiento ante EOF o interrupciones.

--- [SECCIÓN: Diagrama / Explicación gráfica] ---

**Diagrama mejorado — NotasAlumno**

Resumen: diagrama del algoritmo que solicita 3 notas válidas (0-10), las suma y calcula la media.

1. Versión de flujo (descripción breve)

- Inicializar `contador = 0`, `acumulador = 0`.
- Mientras `contador < 3`:
  - Mostrar "Introduce la nota i (0-10):"
  - Intentar leer entrada
    - Si la entrada no es numérica -> Mostrar "Entrada no válida. Introduce un número." -> descartar token -> repetir
    - Si es numérico, comprobar rango:
      - Si nota < 0 o nota > 10 -> Mostrar "Nota fuera de rango (0-10)." -> repetir
      - Si válida -> `acumulador += nota`, `contador++`
- Al salir del bucle, `media = acumulador / 3` -> Mostrar resultado con 2 decimales.

2. Decisiones y etiquetas (mejoras aplicadas al diagrama gráfico original)

- Añadir etiquetas "Sí" / "No" en todas las flechas de las decisiones.
- Para la rama "no numérico" indicar explícitamente "descartar token" (equivalente a `sc.next()` en Java).
- Para la rama "fuera de rango" mostrar el rango esperado en el mensaje.
- Si se desea más robustez, añadir una comprobación de EOF / fin de entrada para terminar con mensaje claro.

--- [SECCIÓN: Implementación Java] ---

```java
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
```

--- [SECCIÓN: Pruebas ejecutadas] ---

- Ejecución 1 (entrada válida):
  - Entrada: `7` `8.5` `6`
  - Salida: `La nota media del alumno es: 7.17`

- Ejecución 2 (entrada no numérica y fuera de rango):
  - Entrada: `abc` → `Entrada no válida. Introduce un número.`
  - Entrada: `5` → aceptada
  - Entrada: `-1` → `Nota fuera de rango. Debe estar entre 0 y 10.`
  - Entrada: `7`, `8` → aceptadas
  - Salida: `La nota media del alumno es: 6.67`

--- [SECCIÓN: Comentarios y mejoras] ---

- Parametrizar el número de notas (usar `N` en lugar de 3) y validar `N > 0`.
- Permitir lectura desde fichero o argumentos de línea de comandos (añadir manejo de EOF).
- Añadir opción para reintentos limitados y contador de intentos fallidos para evitar bucles infinitos con entrada maliciosa.
- Internacionalización de mensajes (soporte multi-idioma).

---

Archivo unificado: `NotasAlumno.md` (contiene el contenido de `NotasAlumno_entrega.md`, `NotasAlumno_nassi.md` y `NotasAlumno_diagrama.md`, separado en secciones con el formato `--- [SECCIÓN: nombre] ---`).
