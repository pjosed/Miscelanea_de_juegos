🕹️ 1. Miscelánea de Juegos
🎯 1.1. Ruleta

Simulación de una ruleta con 24 casillas (pares = blancas, impares = negras).

Características:

Un jugador lanza dos esferas (blanca y negra).

Se realizan N jugadas.

Se evalúa:

Color correcto de cada esfera.

Sumatoria de casillas.

Se determina cuál de las 3 condiciones otorga más ganancias.

Incluye:

✔️ Generación aleatoria

✔️ Validación de condiciones

✔️ Conteo de resultados

✔️ Selección automática de la mejor opción

❌⭕ 1.2. Triqui (Tic-Tac-Toe)

Implementación completa del clásico triqui usando 9 posiciones.

Reglas implementadas:

Tablero representado por 9 variables inicializadas en 0.

Turnos:

O → 1

X → 2

No se puede sobrescribir una casilla ocupada.

Detección de ganador por:

Filas

Columnas

Diagonales

Empate si no hay ganador en 9 jugadas.

El tablero se muestra después de cada turno.

🔢🎰 1.3. Bingo

Versión reducida de Bingo en un tablero 3×3.

Mecánica:

Se llenan las 9 casillas con números aleatorios.

El usuario genera jugadas una por una.

No se repiten números ya seleccionados.

Se gana si hay tres casillas alineadas (horizontal o vertical).

Máximo 7 jugadas:

Si no hay BINGO → juego anulado.

Incluye:

✔️ Generación controlada

✔️ Validación de repetidos

✔️ Actualización del tablero

✔️ Detección de victoria

🔢 2. Procesos Matemáticos
🧹 2.1. Eliminar un dígito

El usuario ingresa un número > 1000 y elimina un dígito específico.

Ejemplos:

12345 eliminar 2 → 1345

314111 eliminar 1 → 34

Implementación:

Reconstrucción numérica usando ciclos.

Sin conversiones mágicas.

🧮 2.2. Cálculo de PI y E

Aproximación mediante series matemáticas.

PI (Leibniz):

π/4 = 1 - 1/3 + 1/5 - 1/7 + ...


Euler:

e^x = 1 + x + x²/2! + x³/3! + ...


El usuario define cuántos términos sumar.

🔭 2.3. Funciones trigonométricas (Series de Taylor)

Cálculo manual de seno(x) y coseno(x), más funciones derivadas.

Incluye:

Serie de Taylor para:

✔️ sin(x)

✔️ cos(x)

Otras funciones (tan, sec, etc.) derivadas de estas.

Potencias y factoriales hechos a mano con ciclos.

📝 Créditos

👨‍🎓 Estudiante: Jose David Peña Campo
📘 Curso: Algoritmia y Programación I – 4362
👩‍🏫 Profesora: Rocío Ramos Rodríguez
