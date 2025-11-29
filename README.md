🕹️ 1. Miscelánea de Juegos
1.1. Ruleta

Simulación de una ruleta con 24 casillas:

Pares → blancas

Impares → negras

Un jugador lanza dos esferas (una blanca y una negra) durante N jugadas.
Dependiendo de la combinación de colores y la sumatoria de las casillas, se calcula por cuál de las opciones el jugador obtendría mayores ganancias.

Incluye:

Generación de valores aleatorios

Conteo de victorias por cada una de las 3 condiciones

Determinación del mejor resultado final

1.2. Triqui (Tic-Tac-Toe)

Implementación del clásico triqui con:

9 posiciones inicializadas en 0

Turnos alternados:

Jugador O → valor 1

Jugador X → valor 2

Validación para evitar jugadas sobre casillas ocupadas

Detección de ganador en filas, columnas y diagonales

Empate si se completan las 9 jugadas sin ganador

El tablero se actualiza y muestra después de cada movimiento.

1.3. Bingo

Juego de bingo reducido a un tablero 3×3 con 9 variables:

Se llena con números generados aleatoriamente

El usuario va generando “jugadas” una por una

No se pueden repetir números seleccionados

Se gana si aparecen tres valores alineados horizontal o verticalmente

Máximo 7 jugadas — si no hay BINGO, se anula

El tablero se actualiza tras cada selección válida.

🔢 2. Procesos Matemáticos
2.1. Eliminar un dígito

El usuario ingresa un número mayor a 1000 y escoge un dígito para eliminar.
Ejemplo:
12345 eliminar 2 → 1345
314111 eliminar 1 → 34

Incluye manejo por ciclos y reconstrucción manual del número.

2.2. Cálculo de PI y E

Aproximación mediante series:

PI usando:

π/4 = 1 – 1/3 + 1/5 – 1/7 + ...

Euler (e^x) usando:

1 + x + x²/2! + x³/3! + …

El usuario define cuántos términos usar en la sumatoria.

2.3. Funciones trigonométricas (Series de Taylor)

Implementación de:

seno(x)
coseno(x)
Con base en sus series de Taylor.
El programa también permite calcular funciones derivadas como tangente, secante, etc.

Las potencias y factoriales se implementan manualmente con ciclos, sin librerías externas

📚 Créditos

Estudiante: Jose David Peña Campo
Curso: Algoritmia y Programación I – 4362
Profesora: Rocío Ramos Rodríguez
