# Plantilla para resolver ejercicios Java
 
> **Nota:** El lenguaje a usar en las soluciones será **Java** exclusivamente. No se aceptarán entregas en otros lenguajes a menos que el usuario lo pida explícitamente.

Usa esta plantilla cada vez que trabajes un ejercicio Java en este proyecto. Está pensada para que sigas siempre los mismos pasos y entregues soluciones completas, claras y reproducibles.

## Plantilla (qué entregar y en qué orden)
- **Resumen:** breve enunciado del problema (1-2 líneas).
- **Entradas:** listado y tipo de cada dato de entrada.
- **Salidas:** qué debe devolver/imprimir el programa.
- **Restricciones:** límites, rangos, supuestos (por ejemplo, tamaño máximo, valores nulos).
- **Casos de prueba:** 3-5 ejemplos (mínimo: 1 normal, 1 borde, 1 error si aplica).
- **Algoritmo (diseño):** pseudocódigo y/o diagrama (organigrama / Nassi–Shneiderman).
- **Complejidad:** estimación del coste temporal y espacial (O-notation).
- **Implementación Java:** código fuente con `main` si corresponde y funciones/métodos separados.
- **Pruebas ejecutadas:** resultados de ejecutar los casos de prueba.
- **Comentarios y mejoras:** explicaciones, alternativas y optimizaciones posibles.

## Receta paso a paso (siempre seguir)
1. Leer y entender: identificar claramente qué se pide.
2. Identificar I/O: anotar entradas, salidas y formato exacto.
3. Detectar casos límite: valores mínimos, máximos, nulos y atípicos.
4. Elegir estrategia algorítmica: ordenar, búsqueda, recursión, DP, estructuras, etc.
5. Escribir pseudocódigo: claro y sin sintaxis Java detallada.
6. Validar pseudocódigo con ejemplos.
7. Implementar en Java: seguir convenciones y separar responsabilidades.
8. Probar y depurar con los casos propuestos.
9. Documentar: comentar intención, justificar complejidad.

## Cómo describir el algoritmo (elige 1 o 2)
- Pseudocódigo: preferible para comunicación humana.
- Organigrama (diagrama de flujo): útil para condicionales y bucles.
- Nassi–Shneiderman: buena para estructuras anidadas.
- Warnier / Jackson / Bertini / Tabourier: utilizar si el problema encaja en diseño por salida o árbol.

## Convenciones Java (rápidas)
- **Nombres:** `camelCase` para variables/métodos, `PascalCase` para clases.
- **Constantes:** `UPPER_SNAKE_CASE`.
- **I/O:** `Scanner` o `BufferedReader` (preferir `BufferedReader` para mucho I/O).
- **Estructura:** `main` para I/O, métodos pequeños para lógica.
- **Validaciones:** comprobar entradas y lanzar `IllegalArgumentException` o mostrar mensajes claros.
- **Comentarios:** Javadoc en métodos públicos y comentarios puntuales cuando la lógica no sea obvia.

## Notación y nombres de variables
- En el diseño (pseudocódigo) puedes usar prefijos del temario (`intCoeficiente`, `rlnNota`).
- En el código Java usa nombres descriptivos sin prefijos: `coeficienteA`, `discriminante`, `raiz1`.

## Plantilla de pseudocódigo (modelo)
- Entrada: leer variables.
- Inicio: inicializar contadores/estructuras.
- Proceso: pasos con condiciones y bucles.
- Salida: escribir resultado(s).

## Checklist antes de entregar
- **Resumen:** objetivo claro.
- **I/O:** formato respetado.
- **Casos de prueba:** incluidos y correctos.
- **Nombres:** claros y consistentes.
- **Manejo de errores:** validaciones implementadas.
- **Complejidad:** razonada.
- **Comentarios:** suficientes.
- **Compilación:** compila sin errores.
- **Ejecución:** pasa los casos de prueba incluidos.

## Ejemplo completo: ecuación de segundo grado

- **Resumen:** calcular raíces reales de ax^2 + bx + c = 0.
- **Entradas:** `a`, `b`, `c` (reales; `a != 0`).
- **Salidas:** 0, 1 o 2 raíces reales según el discriminante.
- **Casos de prueba:**
  - Normal: a=1, b=-3, c=2 → raíces 2 y 1.
  - Única raíz: a=1, b=2, c=1 → raíz -1.
  - Ninguna real: a=1, b=0, c=1 → “No hay soluciones reales”.
- **Pseudocódigo:**
  - leer a, b, c
  - discr = b*b - 4*a*c
  - si discr < 0 escribir “No hay soluciones reales”
  - sino si discr == 0 raiz = -b / (2*a); escribir raiz
  - sino s1 = (-b + sqrt(discr)) / (2*a); s2 = (-b - sqrt(discr)) / (2*a); escribir s1, s2
- **Complejidad:** O(1) tiempo, O(1) espacio.

## Uso recomendado
- Coloca esta plantilla en la raíz del repo y referencia su ruta `TEMPLATES/plantilla-ejercicios-java.md` cuando me pidas resolver un ejercicio.
- Si quieres, puedo además generar una plantilla de proyecto Java completa (con `src/` y pruebas JUnit).

---
_Plantilla copiada a la raíz del repositorio para uso como instrucciones generales._
