package lab_final_jdpc_amcn_camv;

import java.util.Random;
import javax.swing.JOptionPane;

public class Lab_Final_JDPC_AMCN_CAMV {
    public static void main(String[] args) {
       
        Random rm = new Random();
        int opp;
        String textMenuopp = "MENU\n"
                + "Presiona una Opcion:\n";
        String[] topp = {"Miscelánea de Juegos", "Procesos Matemáticos", "Salir"};

        opp = JOptionPane.showOptionDialog(null, textMenuopp, "FINAL LAB", 0, -1, null, topp, "Salir");

        while (opp != 2) {
            switch (opp) { // Interruptor principal

                case 0://Miscelánea de Juegos
                    int op1;
                    String textMenuop1 = "Miscelánea de Juegos\n"
                            + "Presiona una Opcion:";
                    String[] top1 = {"Ruleta", "Triqui", "Bingo", "Salir"};

                    op1 = JOptionPane.showOptionDialog(null, textMenuop1, "FINAL LAB", 0, -1, null, top1, "Salir");

                    while (op1 != 3) {

                        switch (op1) { // INTERRUPTOR DE MISCELANEA DE JUEGOS
                            case 0://RULETA

                                String[] btndad = {"Jugar", "Salir"};
                                int conf11 = JOptionPane.showOptionDialog(null, "Bienvenido al juego de la ruleta ",
                                        "FINAL LAB", JOptionPane.DEFAULT_OPTION,
                                        -1, null,
                                        btndad, btndad[0]);
                                while (conf11 != 1) {
                                    switch (conf11) { // INTERRUPTOR DE JUEGO RULETA

                                        case 0: //JUGAR RULETA
                                          
                                           int N = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de jugadas (N):"));

        int gananciasOpcion1 = 0;
        int gananciasOpcion2 = 0;
        int gananciasOpcion3 = 0;

        int resultadoBlanca = 0;
        int resultadoNegra = 0;

        int contadorBlanca = 1;
        int contadorNegra = 19;

        for (int i = 0; i < N; i++) {
            resultadoBlanca = contadorBlanca++;
            resultadoNegra = contadorNegra++;

            int sumatoriaCasillas = resultadoBlanca + resultadoNegra;

            if (resultadoBlanca % 2 == 0 && resultadoNegra % 2 == 0 && (sumatoriaCasillas <= 19 || sumatoriaCasillas >= 29)) {
                gananciasOpcion1++;
                JOptionPane.showMessageDialog(null, "¡Ganancia en Opción 1 en la jugada " + (i + 1) + "!");
            } else if (resultadoBlanca % 2 == 0 && resultadoNegra % 2 == 0 && (sumatoriaCasillas >= 20 && sumatoriaCasillas < 29)) {
                gananciasOpcion2++;
                JOptionPane.showMessageDialog(null, "¡Ganancia en Opción 2 en la jugada " + (i + 1) + "!");
            } else if (resultadoBlanca % 2 != 0 && resultadoNegra % 2 != 0 && sumatoriaCasillas <= 21) {
                gananciasOpcion3++;
                JOptionPane.showMessageDialog(null, "¡Ganancia en Opción 3 en la jugada " + (i + 1) + "!");
            }

            if (contadorBlanca == 7) {
                contadorBlanca = 1;
            }
            if (contadorNegra == 25) {
                contadorNegra = 19;
            }
        }

        // resumen
        JOptionPane.showMessageDialog(null, "Resumen de resultados:\n\n" +
                "Opción 1: " + gananciasOpcion1 + " ganancias\n" +
                "Opción 2: " + gananciasOpcion2 + " ganancias\n" +
                "Opción 3: " + gananciasOpcion3 + " ganancias\n");

        // Mximo
        if (gananciasOpcion1 > gananciasOpcion2 && gananciasOpcion1 > gananciasOpcion3 || ( gananciasOpcion2==gananciasOpcion3)) {
            JOptionPane.showMessageDialog(null, "La Opción 1 obtiene las mayores ganancias.");
        } else if (gananciasOpcion2 > gananciasOpcion1 && gananciasOpcion2 > gananciasOpcion3|| ( gananciasOpcion1==gananciasOpcion3)) {
            JOptionPane.showMessageDialog(null, "La Opción 2 obtiene las mayores ganancias.");
        } else if (gananciasOpcion3 > gananciasOpcion1 && gananciasOpcion3 > gananciasOpcion2|| ( gananciasOpcion2==gananciasOpcion1)) {
            JOptionPane.showMessageDialog(null, "La Opción 3 obtiene las mayores ganancias.");
        } else {
            JOptionPane.showMessageDialog(null, "Todas las opciones tienen la misma cantidad de ganancias.");
        }

                                            break;
                                    }

                                    //preguntar si quiere repetie el juego
                                    conf11 = JOptionPane.showOptionDialog(null, "Quieres seguir usando el Juego de la ruleta",
                                            "FINAL LAB", JOptionPane.DEFAULT_OPTION,
                                            -1, null,
                                            btndad, btndad[0]);

                                }

                                //agradecimiento
                                JOptionPane.showMessageDialog(null,
                                        "MUCHAS GRACIAS POR UTILIZARME",
                                        "FINAL LAB",
                                        -1);

                                break;

                            case 1:// TRIQUI
                                String[] btndaddd = {"Jugar", "Salir"};

                                int conf22;
                                conf22 = JOptionPane.showOptionDialog(null, "Bienvenido a triqui!!",
                                        "FINAL LAB", JOptionPane.DEFAULT_OPTION,
                                        -1, null,
                                        btndaddd, btndaddd[0]);
                                while (conf22 != 1) {
                                    switch (conf22) {
                                        case 0: // Se ejecuta el juego triqui
                                            char jugador1 = 'O',
                                             jugador2 = 'X';

                                            char c1 = '1';
                                            char c2 = '2';
                                            char c3 = '3';
                                            char c4 = '4';
                                            char c5 = '5';
                                            char c6 = '6';
                                            char c7 = '7';
                                            char c8 = '8';
                                            char c9 = '9';
                                            boolean c11 = false,
                                             c22 = false,
                                             c33 = false,
                                             c44 = false,
                                             c55 = false,
                                             c66 = false,
                                             c77 = false,
                                             c88 = false,
                                             c99 = false;

                                            boolean ganador = false;

                                            int turnos = 1,
                                             opq1 = 0,
                                             opq2 = 0;
                                            String[] opcionfilas = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};

                                            opq1 = JOptionPane.showOptionDialog(null, "Jugador 1, escoje la posicion que desees: "
                                                    + "\n" + c1 + "   |" + c2 + "       |    " + c3 + ""
                                                    + "\n----|-------|---- "
                                                    + "\n" + c4 + "   |" + c5 + "       |" + c6 + ""
                                                    + "\n----|-------|----"
                                                    + "\n" + c7 + "   |" + c8 + "       |    " + c9 + "", "Triqui!!", 0, JOptionPane.QUESTION_MESSAGE, null, opcionfilas, "");

                                            while (turnos <= 8 & ganador == false) {
                                                turnos = turnos + 1;

                                                if (turnos % 2 == 1) {

                                                    switch (opq2) {

                                                        case 0:
                                                            c1 = jugador2;
                                                            c11 = true;
                                                            opq1 = JOptionPane.showOptionDialog(null, "Jugador 1,es tu turno, escoje la posicion que desees: "
                                                                    + "\n" + c1 + "   |" + c2 + "       |    " + c3 + ""
                                                                    + "\n----|-------|---- "
                                                                    + "\n" + c4 + "   |" + c5 + "       |" + c6 + ""
                                                                    + "\n----|-------|----"
                                                                    + "\n" + c7 + "   |" + c8 + "       |    " + c9 + "", "Triqui!!", 0, JOptionPane.QUESTION_MESSAGE, null, opcionfilas, "");
                                                            while (opq1 == c1 & c11 == true) {
                                                                opq1 = JOptionPane.showOptionDialog(null, "Jugador 1,es tu turno, escoje la posicion que desees: "
                                                                        + "\n" + c1 + "   |" + c2 + "       |    " + c3 + ""
                                                                        + "\n----|-------|---- "
                                                                        + "\n" + c4 + "   |" + c5 + "       |" + c6 + ""
                                                                        + "\n----|-------|----"
                                                                        + "\n" + c7 + "   |" + c8 + "       |    " + c9 + "", "Triqui!!", 0, JOptionPane.QUESTION_MESSAGE, null, opcionfilas, "");
                                                            }

                                                            break;
                                                        case 1:
                                                            c2 = jugador2;
                                                            c22 = true;
                                                            opq1 = JOptionPane.showOptionDialog(null, "Jugador 1,es tu turno, escoje la posicion que desees: "
                                                                    + "\n" + c1 + "   |" + c2 + "       |    " + c3 + ""
                                                                    + "\n----|-------|---- "
                                                                    + "\n" + c4 + "   |" + c5 + "       |" + c6 + ""
                                                                    + "\n----|-------|----"
                                                                    + "\n" + c7 + "   |" + c8 + "       |    " + c9 + "", "Triqui!!", 0, JOptionPane.QUESTION_MESSAGE, null, opcionfilas, "");
                                                            while (opq1 == c2 & c22 == true) {
                                                                opq1 = JOptionPane.showOptionDialog(null, "Jugador 1,es tu turno, escoje la posicion que desees: "
                                                                        + "\n" + c1 + "   |" + c2 + "       |    " + c3 + ""
                                                                        + "\n----|-------|---- "
                                                                        + "\n" + c4 + "   |" + c5 + "       |" + c6 + ""
                                                                        + "\n----|-------|----"
                                                                        + "\n" + c7 + "   |" + c8 + "       |    " + c9 + "", "Triqui!!", 0, JOptionPane.QUESTION_MESSAGE, null, opcionfilas, "");
                                                            }
                                                            break;
                                                        case 2:
                                                            c3 = jugador2;
                                                            c33 = true;
                                                            opq1 = JOptionPane.showOptionDialog(null, "Jugador 1,es tu turno, escoje la posicion que desees: "
                                                                    + "\n" + c1 + "   |" + c2 + "       |    " + c3 + ""
                                                                    + "\n----|-------|---- "
                                                                    + "\n" + c4 + "   |" + c5 + "       |" + c6 + ""
                                                                    + "\n----|-------|----"
                                                                    + "\n" + c7 + "   |" + c8 + "       |    " + c9 + "", "Triqui!!", 0, JOptionPane.QUESTION_MESSAGE, null, opcionfilas, "");
                                                            while (opq1 == c3 & c33 == true) {
                                                                opq1 = JOptionPane.showOptionDialog(null, "Jugador 1,es tu turno, escoje la posicion que desees: "
                                                                        + "\n" + c1 + "   |" + c2 + "       |    " + c3 + ""
                                                                        + "\n----|-------|---- "
                                                                        + "\n" + c4 + "   |" + c5 + "       |" + c6 + ""
                                                                        + "\n----|-------|----"
                                                                        + "\n" + c7 + "   |" + c8 + "       |    " + c9 + "", "Triqui!!", 0, JOptionPane.QUESTION_MESSAGE, null, opcionfilas, "");
                                                            }
                                                            break;
                                                        case 3:
                                                            c4 = jugador2;
                                                            c44 = true;
                                                            opq1 = JOptionPane.showOptionDialog(null, "Jugador 1,es tu turno, escoje la posicion que desees: "
                                                                    + "\n" + c1 + "   |" + c2 + "       |    " + c3 + ""
                                                                    + "\n----|-------|---- "
                                                                    + "\n" + c4 + "   |" + c5 + "       |" + c6 + ""
                                                                    + "\n----|-------|----"
                                                                    + "\n" + c7 + "   |" + c8 + "       |    " + c9 + "", "Triqui!!", 0, JOptionPane.QUESTION_MESSAGE, null, opcionfilas, "");
                                                            while (opq1 == c4 & c44 == true) {
                                                                opq1 = JOptionPane.showOptionDialog(null, "Jugador 1,es tu turno, escoje la posicion que desees: "
                                                                        + "\n" + c1 + "   |" + c2 + "       |    " + c3 + ""
                                                                        + "\n----|-------|---- "
                                                                        + "\n" + c4 + "   |" + c5 + "       |" + c6 + ""
                                                                        + "\n----|-------|----"
                                                                        + "\n" + c7 + "   |" + c8 + "       |    " + c9 + "", "Triqui!!", 0, JOptionPane.QUESTION_MESSAGE, null, opcionfilas, "");
                                                            }
                                                            break;
                                                        case 4:
                                                            c5 = jugador2;
                                                            c55 = true;
                                                            opq1 = JOptionPane.showOptionDialog(null, "Jugador 1,es tu turno, escoje la posicion que desees: "
                                                                    + "\n" + c1 + "   |" + c2 + "       |    " + c3 + ""
                                                                    + "\n----|-------|---- "
                                                                    + "\n" + c4 + "   |" + c5 + "       |" + c6 + ""
                                                                    + "\n----|-------|----"
                                                                    + "\n" + c7 + "   |" + c8 + "       |    " + c9 + "", "Triqui!!", 0, JOptionPane.QUESTION_MESSAGE, null, opcionfilas, "");
                                                            while (opq1 == c5 & c55 == true) {
                                                                opq1 = JOptionPane.showOptionDialog(null, "Jugador 1,es tu turno, escoje la posicion que desees: "
                                                                        + "\n" + c1 + "   |" + c2 + "       |    " + c3 + ""
                                                                        + "\n----|-------|---- "
                                                                        + "\n" + c4 + "   |" + c5 + "       |" + c6 + ""
                                                                        + "\n----|-------|----"
                                                                        + "\n" + c7 + "   |" + c8 + "       |    " + c9 + "", "Triqui!!", 0, JOptionPane.QUESTION_MESSAGE, null, opcionfilas, "");
                                                            }
                                                            break;
                                                        case 5:
                                                            c6 = jugador2;
                                                            c66 = true;
                                                            opq1 = JOptionPane.showOptionDialog(null, "Jugador 1,es tu turno, escoje la posicion que desees: "
                                                                    + "\n" + c1 + "   |" + c2 + "       |    " + c3 + ""
                                                                    + "\n----|-------|---- "
                                                                    + "\n" + c4 + "   |" + c5 + "       |" + c6 + ""
                                                                    + "\n----|-------|----"
                                                                    + "\n" + c7 + "   |" + c8 + "       |    " + c9 + "", "Triqui!!", 0, JOptionPane.QUESTION_MESSAGE, null, opcionfilas, "");
                                                            while (opq1 == c6 & c66 == true) {
                                                                opq1 = JOptionPane.showOptionDialog(null, "Jugador 1,es tu turno, escoje la posicion que desees: "
                                                                        + "\n" + c1 + "   |" + c2 + "       |    " + c3 + ""
                                                                        + "\n----|-------|---- "
                                                                        + "\n" + c4 + "   |" + c5 + "       |" + c6 + ""
                                                                        + "\n----|-------|----"
                                                                        + "\n" + c7 + "   |" + c8 + "       |    " + c9 + "", "Triqui!!", 0, JOptionPane.QUESTION_MESSAGE, null, opcionfilas, "");
                                                            }
                                                            break;
                                                        case 6:
                                                            c7 = jugador2;
                                                            c77 = true;
                                                            opq1 = JOptionPane.showOptionDialog(null, "Jugador 1,es tu turno, escoje la posicion que desees: "
                                                                    + "\n" + c1 + "   |" + c2 + "       |    " + c3 + ""
                                                                    + "\n----|-------|---- "
                                                                    + "\n" + c4 + "   |" + c5 + "       |" + c6 + ""
                                                                    + "\n----|-------|----"
                                                                    + "\n" + c7 + "   |" + c8 + "       |    " + c9 + "", "Triqui!!", 0, JOptionPane.QUESTION_MESSAGE, null, opcionfilas, "");
                                                            while (opq1 == c7 & c77 == true) {
                                                                opq1 = JOptionPane.showOptionDialog(null, "Jugador 1,es tu turno, escoje la posicion que desees: "
                                                                        + "\n" + c1 + "   |" + c2 + "       |    " + c3 + ""
                                                                        + "\n----|-------|---- "
                                                                        + "\n" + c4 + "   |" + c5 + "       |" + c6 + ""
                                                                        + "\n----|-------|----"
                                                                        + "\n" + c7 + "   |" + c8 + "       |    " + c9 + "", "Triqui!!", 0, JOptionPane.QUESTION_MESSAGE, null, opcionfilas, "");
                                                            }
                                                            break;
                                                        case 7:
                                                            c8 = jugador2;
                                                            c88 = true;
                                                            opq1 = JOptionPane.showOptionDialog(null, "Jugador 1,es tu turno, escoje la posicion que desees: "
                                                                    + "\n" + c1 + "   |" + c2 + "       |    " + c3 + ""
                                                                    + "\n----|-------|---- "
                                                                    + "\n" + c4 + "   |" + c5 + "       |" + c6 + ""
                                                                    + "\n----|-------|----"
                                                                    + "\n" + c7 + "   |" + c8 + "       |    " + c9 + "", "Triqui!!", 0, JOptionPane.QUESTION_MESSAGE, null, opcionfilas, "");
                                                            while (opq1 == c8 & c88 == true) {
                                                                opq1 = JOptionPane.showOptionDialog(null, "Jugador 1,es tu turno, escoje la posicion que desees: "
                                                                        + "\n" + c1 + "   |" + c2 + "       |    " + c3 + ""
                                                                        + "\n----|-------|---- "
                                                                        + "\n" + c4 + "   |" + c5 + "       |" + c6 + ""
                                                                        + "\n----|-------|----"
                                                                        + "\n" + c7 + "   |" + c8 + "       |    " + c9 + "", "Triqui!!", 0, JOptionPane.QUESTION_MESSAGE, null, opcionfilas, "");
                                                            }
                                                            break;
                                                        case 8:
                                                            c9 = jugador2;
                                                            c99 = true;
                                                            opq1 = JOptionPane.showOptionDialog(null, "Jugador 1,es tu turno, escoje la posicion que desees: "
                                                                    + "\n" + c1 + "   |" + c2 + "       |    " + c3 + ""
                                                                    + "\n----|-------|---- "
                                                                    + "\n" + c4 + "   |" + c5 + "       |" + c6 + ""
                                                                    + "\n----|-------|----"
                                                                    + "\n" + c7 + "   |" + c8 + "       |    " + c9 + "", "Triqui!!", 0, JOptionPane.QUESTION_MESSAGE, null, opcionfilas, "");
                                                            while (opq2 == c9 & c99 == true) {
                                                                opq1 = JOptionPane.showOptionDialog(null, "Jugador 1,es tu turno, escoje la posicion que desees: "
                                                                        + "\n" + c1 + "   |" + c2 + "       |    " + c3 + ""
                                                                        + "\n----|-------|---- "
                                                                        + "\n" + c4 + "   |" + c5 + "       |" + c6 + ""
                                                                        + "\n----|-------|----"
                                                                        + "\n" + c7 + "   |" + c8 + "       |    " + c9 + "", "Triqui!!", 0, JOptionPane.QUESTION_MESSAGE, null, opcionfilas, "");
                                                            }
                                                            break;
                                                    }

                                                    while (opq1 == opq2) {

                                                        opq1 = JOptionPane.showOptionDialog(null, "Jugador 1,es tu turno, escoje la posicion que desees: "
                                                                + "\n" + c1 + "   |" + c2 + "       |    " + c3 + ""
                                                                + "\n----|-------|---- "
                                                                + "\n" + c4 + "   |" + c5 + "       |" + c6 + ""
                                                                + "\n----|-------|----"
                                                                + "\n" + c7 + "   |" + c8 + "       |    " + c9 + "", "Triqui!!", 0, JOptionPane.QUESTION_MESSAGE, null, opcionfilas, "");
                                                    }

                                                    // GANADORES
                                                    if ((c1 == jugador1 & c2 == jugador1 & c3 == jugador1) || (c1 == jugador1 & c5 == jugador1 & c9 == jugador1) || (c1 == jugador1 & c4 == jugador1 & c7 == jugador1) || (c2 == jugador1 & c5 == jugador1 & c8 == jugador1) || (c3 == jugador1 & c6 == jugador1 & c9 == jugador1)) {
                                                        ganador = true;
                                                        turnos = 10;
                                                        JOptionPane.showMessageDialog(null, "Gano el jugador 1:)", "BIEN JUGADO!!, que vuelva pronto", JOptionPane.INFORMATION_MESSAGE);

                                                    } else {

                                                        if ((c1 == jugador2 & c2 == jugador2 & c3 == jugador2) || (c1 == jugador2 & c5 == jugador2 & c9 == jugador2) || (c1 == jugador2 & c4 == jugador2 & c7 == jugador2) || (c2 == jugador2 & c5 == jugador2 & c8 == jugador2) || (c3 == jugador2 & c6 == jugador2 & c9 == jugador2)) {
                                                            ganador = true;
                                                            turnos = 10;
                                                            JOptionPane.showMessageDialog(null, "Gano el jugador 2:)", "BIEN JUGADO!!, que vuelva pronto", JOptionPane.INFORMATION_MESSAGE);

                                                        }
                                                    }

                                                } else {
                                                    switch (opq1) {
                                                        case 0:
                                                            c1 = jugador1;
                                                            c11 = true;
                                                            opq2 = JOptionPane.showOptionDialog(null, "Jugador 2,es tu turno, escoje la posicion que desees: "
                                                                    + "\n" + c1 + "   |" + c2 + "       |    " + c3 + ""
                                                                    + "\n----|-------|---- "
                                                                    + "\n" + c4 + "   |" + c5 + "       |" + c6 + ""
                                                                    + "\n----|-------|----"
                                                                    + "\n" + c7 + "   |" + c8 + "       |    " + c9 + "", "Triqui!!", 0, JOptionPane.QUESTION_MESSAGE, null, opcionfilas, "");

                                                            break;
                                                        case 1:
                                                            c2 = jugador1;
                                                            c22 = true;
                                                            opq2 = JOptionPane.showOptionDialog(null, "Jugador 2,es tu turno, escoje la posicion que desees: "
                                                                    + "\n" + c1 + "   |" + c2 + "       |    " + c3 + ""
                                                                    + "\n----|-------|---- "
                                                                    + "\n" + c4 + "   |" + c5 + "       |" + c6 + ""
                                                                    + "\n----|-------|----"
                                                                    + "\n" + c7 + "   |" + c8 + "       |    " + c9 + "", "Triqui!!", 0, JOptionPane.QUESTION_MESSAGE, null, opcionfilas, "");

                                                            break;
                                                        case 2:
                                                            c3 = jugador1;
                                                            c33 = true;
                                                            opq2 = JOptionPane.showOptionDialog(null, "Jugador 2,es tu turno, escoje la posicion que desees: "
                                                                    + "\n" + c1 + "   |" + c2 + "       |    " + c3 + ""
                                                                    + "\n----|-------|---- "
                                                                    + "\n" + c4 + "   |" + c5 + "       |" + c6 + ""
                                                                    + "\n----|-------|----"
                                                                    + "\n" + c7 + "   |" + c8 + "       |    " + c9 + "", "Triqui!!", 0, JOptionPane.QUESTION_MESSAGE, null, opcionfilas, "");
                                                            break;
                                                        case 3:
                                                            c4 = jugador1;
                                                            c44 = true;
                                                            opq2 = JOptionPane.showOptionDialog(null, "Jugador 2,es tu turno, escoje la posicion que desees: "
                                                                    + "\n" + c1 + "   |" + c2 + "       |    " + c3 + ""
                                                                    + "\n----|-------|---- "
                                                                    + "\n" + c4 + "   |" + c5 + "       |" + c6 + ""
                                                                    + "\n----|-------|----"
                                                                    + "\n" + c7 + "   |" + c8 + "       |    " + c9 + "", "Triqui!!", 0, JOptionPane.QUESTION_MESSAGE, null, opcionfilas, "");
                                                            break;
                                                        case 4:
                                                            c5 = jugador1;
                                                            c55 = true;
                                                            opq2 = JOptionPane.showOptionDialog(null, "Jugador 2,es tu turno, escoje la posicion que desees: "
                                                                    + "\n" + c1 + "   |" + c2 + "       |    " + c3 + ""
                                                                    + "\n----|-------|---- "
                                                                    + "\n" + c4 + "   |" + c5 + "       |" + c6 + ""
                                                                    + "\n----|-------|----"
                                                                    + "\n" + c7 + "   |" + c8 + "       |    " + c9 + "", "Triqui!!", 0, JOptionPane.QUESTION_MESSAGE, null, opcionfilas, "");
                                                            break;
                                                        case 5:
                                                            c6 = jugador1;
                                                            c66 = true;
                                                            opq2 = JOptionPane.showOptionDialog(null, "Jugador 2,es tu turno, escoje la posicion que desees: "
                                                                    + "\n" + c1 + "   |" + c2 + "       |    " + c3 + ""
                                                                    + "\n----|-------|---- "
                                                                    + "\n" + c4 + "   |" + c5 + "       |" + c6 + ""
                                                                    + "\n----|-------|----"
                                                                    + "\n" + c7 + "   |" + c8 + "       |    " + c9 + "", "Triqui!!", 0, JOptionPane.QUESTION_MESSAGE, null, opcionfilas, "");
                                                            break;
                                                        case 6:
                                                            c7 = jugador1;
                                                            c77 = true;
                                                            opq2 = JOptionPane.showOptionDialog(null, "Jugador 2,es tu turno, escoje la posicion que desees: "
                                                                    + "\n" + c1 + "   |" + c2 + "       |    " + c3 + ""
                                                                    + "\n----|-------|---- "
                                                                    + "\n" + c4 + "   |" + c5 + "       |" + c6 + ""
                                                                    + "\n----|-------|----"
                                                                    + "\n" + c7 + "   |" + c8 + "       |    " + c9 + "", "Triqui!!", 0, JOptionPane.QUESTION_MESSAGE, null, opcionfilas, "");
                                                            break;
                                                        case 7:
                                                            c8 = jugador1;
                                                            c88 = true;
                                                            opq2 = JOptionPane.showOptionDialog(null, "Jugador 2,es tu turno, escoje la posicion que desees: "
                                                                    + "\n" + c1 + "   |" + c2 + "       |    " + c3 + ""
                                                                    + "\n----|-------|---- "
                                                                    + "\n" + c4 + "   |" + c5 + "       |" + c6 + ""
                                                                    + "\n----|-------|----"
                                                                    + "\n" + c7 + "   |" + c8 + "       |    " + c9 + "", "Triqui!!", 0, JOptionPane.QUESTION_MESSAGE, null, opcionfilas, "");
                                                            break;
                                                        case 8:
                                                            c9 = jugador1;
                                                            c99 = true;
                                                            opq2 = JOptionPane.showOptionDialog(null, "Jugador 2,es tu turno, escoje la posicion que desees: "
                                                                    + "\n" + c1 + "   |" + c2 + "       |    " + c3 + ""
                                                                    + "\n----|-------|---- "
                                                                    + "\n" + c4 + "   |" + c5 + "       |" + c6 + ""
                                                                    + "\n----|-------|----"
                                                                    + "\n" + c7 + "   |" + c8 + "       |    " + c9 + "", "Triqui!!", 0, JOptionPane.QUESTION_MESSAGE, null, opcionfilas, "");
                                                            break;

                                                    }

                                                    while (opq2 == opq1) {

                                                        opq2 = JOptionPane.showOptionDialog(null, "Jugador 2,es tu turno, escoje la posicion que desees: "
                                                                + "\n" + c1 + "   |" + c2 + "       |    " + c3 + ""
                                                                + "\n----|-------|---- "
                                                                + "\n" + c4 + "   |" + c5 + "       |" + c6 + ""
                                                                + "\n----|-------|----"
                                                                + "\n" + c7 + "   |" + c8 + "       |    " + c9 + "", "Triqui!!", 0, JOptionPane.QUESTION_MESSAGE, null, opcionfilas, "");
                                                    }

// GANADORES
                                                    if ((c1 == jugador1 & c2 == jugador1 & c3 == jugador1) || (c1 == jugador1 & c5 == jugador1 & c9 == jugador1) || (c1 == jugador1 & c4 == jugador1 & c7 == jugador1) || (c2 == jugador1 & c5 == jugador1 & c8 == jugador1) || (c3 == jugador1 & c6 == jugador1 & c9 == jugador1) || (c7 == jugador1 & c8 == jugador1 & c9 == jugador1) | (c3 == jugador1 & c5 == jugador1 & c7 == jugador1) || (c4 == jugador1 & c5 == jugador1 & c6 == jugador1)) {
                                                        ganador = true;
                                                        turnos = 10;
                                                        JOptionPane.showMessageDialog(null, "Gano el jugador 1:)", "BIEN JUGADO!!, que vuelva pronto", JOptionPane.INFORMATION_MESSAGE);

                                                    } else {

                                                        if ((c1 == jugador2 & c2 == jugador2 & c3 == jugador2) || (c1 == jugador2 & c5 == jugador2 & c9 == jugador2) || (c1 == jugador2 & c4 == jugador2 & c7 == jugador2) || (c2 == jugador2 & c5 == jugador2 & c8 == jugador2) || (c3 == jugador2 & c6 == jugador2 & c9 == jugador2) || (c7 == jugador2 & c8 == jugador2 & c9 == jugador2) | (c3 == jugador2 & c5 == jugador2 & c7 == jugador2) | (c4 == jugador2 & c5 == jugador2 & c6 == jugador2)) {
                                                            ganador = true;
                                                            turnos = 10;
                                                            JOptionPane.showMessageDialog(null, "Gano el jugador 2:)", "BIEN JUGADO!!, que vuelva pronto", JOptionPane.INFORMATION_MESSAGE);

                                                        }

                                                    }
                                                }

                                            }
                                            ganador = true;

                                            JOptionPane.showMessageDialog(null, "THANKS FOR PLAYING!!!", "Adios!", JOptionPane.INFORMATION_MESSAGE);
                                        // while con conf22 como opp

                                    }
                                    conf22 = JOptionPane.showOptionDialog(null, "¿Quieres serguir jugando triqui?",
                                            "FINAL LAB", JOptionPane.DEFAULT_OPTION,
                                            -1, null,
                                            btndaddd, btndaddd[0]);

                                }
                                JOptionPane.showMessageDialog(null,
                                        "MUCHAS GRACIAS POR UTILIZARME",
                                        "FINAL LAB",
                                        -1);

                                break;

                            ////////////////////////////////FIN JUEGO TRIQUI////////////////////////////////////////////////
                            case 2: // JUEGO DE BINGO

                                String[] btnbingo = {"Jugar", "Salir"};
                                int conf33 = JOptionPane.showOptionDialog(null, "Bienvenido al juego de Bingo ",
                                        "FINAL LAB", JOptionPane.DEFAULT_OPTION,
                                        -1, null,
                                        btnbingo, btnbingo[0]);

                                while (conf33 != 1) {
                                    switch (conf33) {

                                        case 0: // JUGAR BINGO
                                            int r1,
                                             r2 = 0,
                                             r3 = 0,
                                             r4 = 0,
                                             r5 = 0,
                                             r6 = 0,
                                             r7 = 0,
                                             r8 = 0,
                                             r9 = 0;
                                            String r11 = "1";
                                            String r12 = "2";
                                            String r13 = "3";
                                            String r14 = "4";
                                            String r15 = "5";
                                            String r16 = "6";
                                            String r17 = "7";
                                            String r18 = "8";
                                            String r19 = "9";

                                            //validar que no se repitan numeros
                                            r1 = rm.nextInt(9) + 1;
                                            r11 = "" + r1;

                                            do {
                                                r2 = rm.nextInt(9) + 1;
                                                r12 = "" + r2;

                                            } while (r2 == r1);

                                            do {
                                                r3 = rm.nextInt(9) + 1;
                                                r13 = "" + r3;
                                            } while (r3 == r2 | r3 == r1);

                                            do {
                                                r4 = rm.nextInt(9) + 1;
                                                r14 = "" + r4;
                                            } while (r4 == r3 | r4 == r2 | r4 == r1);

                                            do {
                                                r5 = rm.nextInt(9) + 1;
                                                r15 = "" + r5;
                                            } while (r5 == r4 | r5 == r3 | r5 == r2 | r5 == r1);

                                            do {
                                                r6 = rm.nextInt(9) + 1;
                                                r16 = "" + r6;
                                            } while (r6 == r5 | r6 == r4 | r6 == r3 | r6 == r2 | r6 == r1);

                                            do {
                                                r7 = rm.nextInt(9) + 1;
                                                r17 = "" + r7;
                                            } while (r7 == r6 | r7 == r5 | r7 == r4 | r7 == r3 | r7 == r2 | r7 == r1);

                                            do {
                                                r8 = rm.nextInt(9) + 1;
                                                r18 = "" + r8;
                                            } while (r8 == r7 | r8 == r6 | r8 == r5 | r8 == r4 | r8 == r3 | r8 == r2 | r8 == r1);

                                            do {
                                                r9 = rm.nextInt(9) + 1;
                                                r19 = "" + r9;
                                            } while (r9 == r8 | r9 == r7 | r9 == r6 | r9 == r5 | r9 == r4 | r9 == r3 | r9 == r2 | r9 == r1);
                                            //////

                                            String[] botones = {" SEGUIR!!"}; // TABLEROOOOO
                                            JOptionPane.showOptionDialog(null, "Este es su carton:)):\n"
                                                    + " ----------------- \n"
                                                    + "|  " + r11 + "  |  " + r12 + "  |  " + r13 + "  |\n"
                                                    + " ----------------- \n"
                                                    + "|  " + r14 + "  |  " + r15 + "  |  " + r16 + "  |\n"
                                                    + " ----------------- \n"
                                                    + "|  " + r17 + "  |  " + r18 + "  |  " + r19 + "  |\n"
                                                    + " ----------------- ", "------FINAL LAB------", JOptionPane.DEFAULT_OPTION, -1, null, botones, botones[0]);

                                            int bal1,
                                             bal2,
                                             bal3,
                                             jug = 1,
                                             gandr = 0;

                                            while (jug <= 7 & gandr != 1) { // empieza el juego

                                                bal1 = rm.nextInt(9) + 1;

                                                do {
                                                    bal2 = rm.nextInt(9) + 1;
                                                } while (bal2 == bal1);

                                                do {
                                                    bal3 = rm.nextInt(9) + 1;
                                                } while (bal3 == bal2 | bal3 == bal1);
                                                //DEPENDIENDO DE CADA BALOTA UN CASO

                                                switch (bal1) {
                                                    case 1:
                                                        if (r1 == 1) {
                                                            r11 = "X";
                                                        } else if (r2 == 1) {
                                                            r12 = "X";
                                                        } else if (r3 == 1) {
                                                            r13 = "X";
                                                        } else if (r4 == 1) {
                                                            r14 = "X";
                                                        } else if (r5 == 1) {
                                                            r15 = "X";
                                                        } else if (r6 == 1) {
                                                            r16 = "X";
                                                        } else if (r7 == 1) {
                                                            r17 = "X";
                                                        } else if (r8 == 1) {
                                                            r18 = "X";
                                                        } else if (r9 == 1) {
                                                            r19 = "X";
                                                        }
                                                        break;

                                                    case 2:
                                                        if (r1 == 2) {
                                                            r11 = "X";
                                                        } else if (r2 == 2) {
                                                            r12 = "X";
                                                        } else if (r3 == 2) {
                                                            r13 = "X";
                                                        } else if (r4 == 2) {
                                                            r14 = "X";
                                                        } else if (r5 == 2) {
                                                            r15 = "X";
                                                        } else if (r6 == 2) {
                                                            r16 = "X";
                                                        } else if (r7 == 2) {
                                                            r17 = "X";
                                                        } else if (r8 == 2) {
                                                            r18 = "X";
                                                        } else if (r9 == 2) {
                                                            r19 = "X";
                                                        }
                                                        break;

                                                    case 3:
                                                        if (r1 == 3) {
                                                            r11 = "X";
                                                        } else if (r2 == 3) {
                                                            r12 = "X";
                                                        } else if (r3 == 3) {
                                                            r13 = "X";
                                                        } else if (r4 == 3) {
                                                            r14 = "X";
                                                        } else if (r5 == 3) {
                                                            r15 = "X";
                                                        } else if (r6 == 3) {
                                                            r16 = "X";
                                                        } else if (r7 == 3) {
                                                            r17 = "X";
                                                        } else if (r8 == 3) {
                                                            r18 = "X";
                                                        } else if (r9 == 3) {
                                                            r19 = "X";
                                                        }

                                                        break;
                                                    case 4:
                                                        if (r1 == 4) {
                                                            r11 = "X";
                                                        } else if (r2 == 4) {
                                                            r12 = "X";
                                                        } else if (r3 == 4) {
                                                            r13 = "X";
                                                        } else if (r4 == 4) {
                                                            r14 = "X";
                                                        } else if (r5 == 4) {
                                                            r15 = "X";
                                                        } else if (r6 == 4) {
                                                            r16 = "X";
                                                        } else if (r7 == 4) {
                                                            r17 = "X";
                                                        } else if (r8 == 4) {
                                                            r18 = "X";
                                                        } else if (r9 == 4) {
                                                            r19 = "X";
                                                        }

                                                        break;
                                                    case 5:
                                                        if (r1 == 5) {
                                                            r11 = "X";
                                                        } else if (r2 == 5) {
                                                            r12 = "X";
                                                        } else if (r3 == 5) {
                                                            r13 = "X";
                                                        } else if (r4 == 5) {
                                                            r14 = "X";
                                                        } else if (r5 == 5) {
                                                            r15 = "X";
                                                        } else if (r6 == 5) {
                                                            r16 = "X";
                                                        } else if (r7 == 5) {
                                                            r17 = "X";
                                                        } else if (r8 == 5) {
                                                            r18 = "X";
                                                        } else if (r9 == 5) {
                                                            r19 = "X";
                                                        }

                                                        break;
                                                    case 6:
                                                        if (r1 == 6) {
                                                            r11 = "X";
                                                        } else if (r2 == 6) {
                                                            r12 = "X";
                                                        } else if (r3 == 6) {
                                                            r13 = "X";
                                                        } else if (r4 == 6) {
                                                            r14 = "X";
                                                        } else if (r5 == 6) {
                                                            r15 = "X";
                                                        } else if (r6 == 6) {
                                                            r16 = "X";
                                                        } else if (r7 == 6) {
                                                            r17 = "X";
                                                        } else if (r8 == 6) {
                                                            r18 = "X";
                                                        } else if (r9 == 6) {
                                                            r19 = "X";
                                                        }

                                                        break;
                                                    case 7:
                                                        if (r1 == 7) {
                                                            r11 = "X";
                                                        } else if (r2 == 7) {
                                                            r12 = "X";
                                                        } else if (r3 == 7) {
                                                            r13 = "X";
                                                        } else if (r4 == 7) {
                                                            r14 = "X";
                                                        } else if (r5 == 7) {
                                                            r15 = "X";
                                                        } else if (r6 == 7) {
                                                            r16 = "X";
                                                        } else if (r7 == 7) {
                                                            r17 = "X";
                                                        } else if (r8 == 7) {
                                                            r18 = "X";
                                                        } else if (r9 == 7) {
                                                            r19 = "X";
                                                        }

                                                        break;
                                                    case 8:
                                                        if (r1 == 8) {
                                                            r11 = "X";
                                                        } else if (r2 == 8) {
                                                            r12 = "X";
                                                        } else if (r3 == 8) {
                                                            r13 = "X";
                                                        } else if (r4 == 8) {
                                                            r14 = "X";
                                                        } else if (r5 == 8) {
                                                            r15 = "X";
                                                        } else if (r6 == 8) {
                                                            r16 = "X";
                                                        } else if (r7 == 8) {
                                                            r17 = "X";
                                                        } else if (r8 == 8) {
                                                            r18 = "X";
                                                        } else if (r9 == 8) {
                                                            r19 = "X";
                                                        }

                                                        break;
                                                    case 9:
                                                        if (r1 == 9) {
                                                            r11 = "X";
                                                        } else if (r2 == 9) {
                                                            r12 = "X";
                                                        } else if (r3 == 9) {
                                                            r13 = "X";
                                                        } else if (r4 == 9) {
                                                            r14 = "X";
                                                        } else if (r5 == 9) {
                                                            r15 = "X";
                                                        } else if (r6 == 9) {
                                                            r16 = "X";
                                                        } else if (r7 == 9) {
                                                            r17 = "X";
                                                        } else if (r8 == 9) {
                                                            r18 = "X";
                                                        } else if (r9 == 9) {
                                                            r19 = "X";
                                                        }

                                                        break;
                                                }
                                                switch (bal2) {
                                                    case 1:
                                                        if (r1 == 1) {
                                                            r11 = "X";
                                                        } else if (r2 == 1) {
                                                            r12 = "X";
                                                        } else if (r3 == 1) {
                                                            r13 = "X";
                                                        } else if (r4 == 1) {
                                                            r14 = "X";
                                                        } else if (r5 == 1) {
                                                            r15 = "X";
                                                        } else if (r6 == 1) {
                                                            r16 = "X";
                                                        } else if (r7 == 1) {
                                                            r17 = "X";
                                                        } else if (r8 == 1) {
                                                            r18 = "X";
                                                        } else if (r9 == 1) {
                                                            r19 = "X";
                                                        }

                                                        break;
                                                    case 2:
                                                        if (r1 == 2) {
                                                            r11 = "X";
                                                        } else if (r2 == 2) {
                                                            r12 = "X";
                                                        } else if (r3 == 2) {
                                                            r13 = "X";
                                                        } else if (r4 == 2) {
                                                            r14 = "X";
                                                        } else if (r5 == 2) {
                                                            r15 = "X";
                                                        } else if (r6 == 2) {
                                                            r16 = "X";
                                                        } else if (r7 == 2) {
                                                            r17 = "X";
                                                        } else if (r8 == 2) {
                                                            r18 = "X";
                                                        } else if (r9 == 2) {
                                                            r19 = "X";
                                                        }

                                                        break;
                                                    case 3:
                                                        if (r1 == 3) {
                                                            r11 = "X";
                                                        } else if (r2 == 3) {
                                                            r12 = "X";
                                                        } else if (r3 == 3) {
                                                            r13 = "X";
                                                        } else if (r4 == 3) {
                                                            r14 = "X";
                                                        } else if (r5 == 3) {
                                                            r15 = "X";
                                                        } else if (r6 == 3) {
                                                            r16 = "X";
                                                        } else if (r7 == 3) {
                                                            r17 = "X";
                                                        } else if (r8 == 3) {
                                                            r18 = "X";
                                                        } else if (r9 == 3) {
                                                            r19 = "X";
                                                        }

                                                        break;
                                                    case 4:
                                                        if (r1 == 4) {
                                                            r11 = "X";
                                                        } else if (r2 == 4) {
                                                            r12 = "X";
                                                        } else if (r3 == 4) {
                                                            r13 = "X";
                                                        } else if (r4 == 4) {
                                                            r14 = "X";
                                                        } else if (r5 == 4) {
                                                            r15 = "X";
                                                        } else if (r6 == 4) {
                                                            r16 = "X";
                                                        } else if (r7 == 4) {
                                                            r17 = "X";
                                                        } else if (r8 == 4) {
                                                            r18 = "X";
                                                        } else if (r9 == 4) {
                                                            r19 = "X";
                                                        }

                                                        break;
                                                    case 5:
                                                        if (r1 == 5) {
                                                            r11 = "X";
                                                        } else if (r2 == 5) {
                                                            r12 = "X";
                                                        } else if (r3 == 5) {
                                                            r13 = "X";
                                                        } else if (r4 == 5) {
                                                            r14 = "X";
                                                        } else if (r5 == 5) {
                                                            r15 = "X";
                                                        } else if (r6 == 5) {
                                                            r16 = "X";
                                                        } else if (r7 == 5) {
                                                            r17 = "X";
                                                        } else if (r8 == 5) {
                                                            r18 = "X";
                                                        } else if (r9 == 5) {
                                                            r19 = "X";
                                                        }

                                                        break;
                                                    case 6:
                                                        if (r1 == 6) {
                                                            r11 = "X";
                                                        } else if (r2 == 6) {
                                                            r12 = "X";
                                                        } else if (r3 == 6) {
                                                            r13 = "X";
                                                        } else if (r4 == 6) {
                                                            r14 = "X";
                                                        } else if (r5 == 6) {
                                                            r15 = "X";
                                                        } else if (r6 == 6) {
                                                            r16 = "X";
                                                        } else if (r7 == 6) {
                                                            r17 = "X";
                                                        } else if (r8 == 6) {
                                                            r18 = "X";
                                                        } else if (r9 == 6) {
                                                            r19 = "X";
                                                        }

                                                        break;
                                                    case 7:
                                                        if (r1 == 7) {
                                                            r11 = "X";
                                                        } else if (r2 == 7) {
                                                            r12 = "X";
                                                        } else if (r3 == 7) {
                                                            r13 = "X";
                                                        } else if (r4 == 7) {
                                                            r14 = "X";
                                                        } else if (r5 == 7) {
                                                            r15 = "X";
                                                        } else if (r6 == 7) {
                                                            r16 = "X";
                                                        } else if (r7 == 7) {
                                                            r17 = "X";
                                                        } else if (r8 == 7) {
                                                            r18 = "X";
                                                        } else if (r9 == 7) {
                                                            r19 = "X";
                                                        }

                                                        break;
                                                    case 8:
                                                        if (r1 == 8) {
                                                            r11 = "X";
                                                        } else if (r2 == 8) {
                                                            r12 = "X";
                                                        } else if (r3 == 8) {
                                                            r13 = "X";
                                                        } else if (r4 == 8) {
                                                            r14 = "X";
                                                        } else if (r5 == 8) {
                                                            r15 = "X";
                                                        } else if (r6 == 8) {
                                                            r16 = "X";
                                                        } else if (r7 == 8) {
                                                            r17 = "X";
                                                        } else if (r8 == 8) {
                                                            r18 = "X";
                                                        } else if (r9 == 8) {
                                                            r19 = "X";
                                                        }

                                                        break;
                                                    case 9:
                                                        if (r1 == 9) {
                                                            r11 = "X";
                                                        } else if (r2 == 9) {
                                                            r12 = "X";
                                                        } else if (r3 == 9) {
                                                            r13 = "X";
                                                        } else if (r4 == 9) {
                                                            r14 = "X";
                                                        } else if (r5 == 9) {
                                                            r15 = "X";
                                                        } else if (r6 == 9) {
                                                            r16 = "X";
                                                        } else if (r7 == 9) {
                                                            r17 = "X";
                                                        } else if (r8 == 9) {
                                                            r18 = "X";
                                                        } else if (r9 == 9) {
                                                            r19 = "X";
                                                        }

                                                        break;
                                                }
                                                switch (bal3) {
                                                    case 1:
                                                        if (r1 == 1) {
                                                            r11 = "X";
                                                        } else if (r2 == 1) {
                                                            r12 = "X";
                                                        } else if (r3 == 1) {
                                                            r13 = "X";
                                                        } else if (r4 == 1) {
                                                            r14 = "X";
                                                        } else if (r5 == 1) {
                                                            r15 = "X";
                                                        } else if (r6 == 1) {
                                                            r16 = "X";
                                                        } else if (r7 == 1) {
                                                            r17 = "X";
                                                        } else if (r8 == 1) {
                                                            r18 = "X";
                                                        } else if (r9 == 1) {
                                                            r19 = "X";
                                                        }

                                                        break;
                                                    case 2:
                                                        if (r1 == 2) {
                                                            r11 = "X";
                                                        } else if (r2 == 2) {
                                                            r12 = "X";
                                                        } else if (r3 == 2) {
                                                            r13 = "X";
                                                        } else if (r4 == 2) {
                                                            r14 = "X";
                                                        } else if (r5 == 2) {
                                                            r15 = "X";
                                                        } else if (r6 == 2) {
                                                            r16 = "X";
                                                        } else if (r7 == 2) {
                                                            r17 = "X";
                                                        } else if (r8 == 2) {
                                                            r18 = "X";
                                                        } else if (r9 == 2) {
                                                            r19 = "X";
                                                        }

                                                        break;
                                                    case 3:
                                                        if (r1 == 3) {
                                                            r11 = "X";
                                                        } else if (r2 == 3) {
                                                            r12 = "X";
                                                        } else if (r3 == 3) {
                                                            r13 = "X";
                                                        } else if (r4 == 3) {
                                                            r14 = "X";
                                                        } else if (r5 == 3) {
                                                            r15 = "X";
                                                        } else if (r6 == 3) {
                                                            r16 = "X";
                                                        } else if (r7 == 3) {
                                                            r17 = "X";
                                                        } else if (r8 == 3) {
                                                            r18 = "X";
                                                        } else if (r9 == 3) {
                                                            r19 = "X";
                                                        }

                                                        break;
                                                    case 4:
                                                        if (r1 == 4) {
                                                            r11 = "X";
                                                        } else if (r2 == 4) {
                                                            r12 = "X";
                                                        } else if (r3 == 4) {
                                                            r13 = "X";
                                                        } else if (r4 == 4) {
                                                            r14 = "X";
                                                        } else if (r5 == 4) {
                                                            r15 = "X";
                                                        } else if (r6 == 4) {
                                                            r16 = "X";
                                                        } else if (r7 == 4) {
                                                            r17 = "X";
                                                        } else if (r8 == 4) {
                                                            r18 = "X";
                                                        } else if (r9 == 4) {
                                                            r19 = "X";
                                                        }

                                                        break;
                                                    case 5:
                                                        if (r1 == 5) {
                                                            r11 = "X";
                                                        } else if (r2 == 5) {
                                                            r12 = "X";
                                                        } else if (r3 == 5) {
                                                            r13 = "X";
                                                        } else if (r4 == 5) {
                                                            r14 = "X";
                                                        } else if (r5 == 5) {
                                                            r15 = "X";
                                                        } else if (r6 == 5) {
                                                            r16 = "X";
                                                        } else if (r7 == 5) {
                                                            r17 = "X";
                                                        } else if (r8 == 5) {
                                                            r18 = "X";
                                                        } else if (r9 == 5) {
                                                            r19 = "X";
                                                        }

                                                        break;
                                                    case 6:
                                                        if (r1 == 6) {
                                                            r11 = "X";
                                                        } else if (r2 == 6) {
                                                            r12 = "X";
                                                        } else if (r3 == 6) {
                                                            r13 = "X";
                                                        } else if (r4 == 6) {
                                                            r14 = "X";
                                                        } else if (r5 == 6) {
                                                            r15 = "X";
                                                        } else if (r6 == 6) {
                                                            r16 = "X";
                                                        } else if (r7 == 6) {
                                                            r17 = "X";
                                                        } else if (r8 == 6) {
                                                            r18 = "X";
                                                        } else if (r9 == 6) {
                                                            r19 = "X";
                                                        }

                                                        break;
                                                    case 7:
                                                        if (r1 == 7) {
                                                            r11 = "X";
                                                        } else if (r2 == 7) {
                                                            r12 = "X";
                                                        } else if (r3 == 7) {
                                                            r13 = "X";
                                                        } else if (r4 == 7) {
                                                            r14 = "X";
                                                        } else if (r5 == 7) {
                                                            r15 = "X";
                                                        } else if (r6 == 7) {
                                                            r16 = "X";
                                                        } else if (r7 == 7) {
                                                            r17 = "X";
                                                        } else if (r8 == 7) {
                                                            r18 = "X";
                                                        } else if (r9 == 7) {
                                                            r19 = "X";
                                                        }

                                                        break;
                                                    case 8:
                                                        if (r1 == 8) {
                                                            r11 = "X";
                                                        } else if (r2 == 8) {
                                                            r12 = "X";
                                                        } else if (r3 == 8) {
                                                            r13 = "X";
                                                        } else if (r4 == 8) {
                                                            r14 = "X";
                                                        } else if (r5 == 8) {
                                                            r15 = "X";
                                                        } else if (r6 == 8) {
                                                            r16 = "X";
                                                        } else if (r7 == 8) {
                                                            r17 = "X";
                                                        } else if (r8 == 8) {
                                                            r18 = "X";
                                                        } else if (r9 == 8) {
                                                            r19 = "X";
                                                        }

                                                        break;
                                                    case 9:
                                                        if (r1 == 9) {
                                                            r11 = "X";
                                                        } else if (r2 == 9) {
                                                            r12 = "X";
                                                        } else if (r3 == 9) {
                                                            r13 = "X";
                                                        } else if (r4 == 9) {
                                                            r14 = "X";
                                                        } else if (r5 == 9) {
                                                            r15 = "X";
                                                        } else if (r6 == 9) {
                                                            r16 = "X";
                                                        } else if (r7 == 9) {
                                                            r17 = "X";
                                                        } else if (r8 == 9) {
                                                            r18 = "X";
                                                        } else if (r9 == 9) {
                                                            r19 = "X";
                                                        }

                                                        break;

                                                }

                                                // Vaidar reultados //
                                                if (r11 == "X" && r12 == "X" && r13 == "X") {
                                                    JOptionPane.showOptionDialog(null, "Jugada No. " + jug + "\n"
                                                            + "\n"
                                                            + "Balota 1: " + bal1 + "\n"
                                                            + "Balota 2: " + bal2 + "\n"
                                                            + "Balota 3: " + bal3 + "\n"
                                                            + " ----------------- \n"
                                                            + "|  " + r11 + "  |  " + r12 + "  |  " + r13 + "  |\n"
                                                            + " ----------------- \n"
                                                            + "|  " + r14 + "  |  " + r15 + "  |  " + r16 + "  |\n"
                                                            + " ----------------- \n"
                                                            + "|  " + r17 + "  |  " + r18 + "  |  " + r19 + "  |\n"
                                                            + " ----------------- \n"
                                                            + "\n"
                                                            + "¡BINGO!", "FINAL LAB:", JOptionPane.DEFAULT_OPTION, -1, null, botones, botones[0]);
                                                    gandr = gandr + 1;

                                                } else if (r14 == "X" && r15 == "X" && r16 == "X") {
                                                    JOptionPane.showOptionDialog(null, "Jugada #" + jug + "\n"
                                                            + "\n"
                                                            + "Balota 1: " + bal1 + "\n"
                                                            + "Balota 2: " + bal2 + "\n"
                                                            + "Balota 3: " + bal3 + "\n"
                                                            + " ----------------- \n"
                                                            + "|  " + r11 + "  |  " + r12 + "  |  " + r13 + "  |\n"
                                                            + " ----------------- \n"
                                                            + "|  " + r14 + "  |  " + r15 + "  |  " + r16 + "  |\n"
                                                            + " ----------------- \n"
                                                            + "|  " + r17 + "  |  " + r18 + "  |  " + r19 + "  |\n"
                                                            + " ----------------- \n"
                                                            + "\n"
                                                            + "¡BINGO!", "FINAL LAB", JOptionPane.DEFAULT_OPTION, -1, null, botones, botones[0]);
                                                    gandr = gandr + 1;

                                                } else if (r17 == "X" && r18 == "X" && r19 == "X") {
                                                    JOptionPane.showOptionDialog(null, "Jugada #" + jug + "\n"
                                                            + "\n"
                                                            + "Balota 1: " + bal1 + "\n"
                                                            + "Balota 2: " + bal2 + "\n"
                                                            + "Balota 3: " + bal3 + "\n"
                                                            + " ----------------- \n"
                                                            + "|  " + r11 + "  |  " + r12 + "  |  " + r13 + "  |\n"
                                                            + " ----------------- \n"
                                                            + "|  " + r14 + "  |  " + r15 + "  |  " + r16 + "  |\n"
                                                            + " ----------------- \n"
                                                            + "|  " + r17 + "  |  " + r18 + "  |  " + r19 + "  |\n"
                                                            + " ----------------- \n"
                                                            + "\n"
                                                            + "¡BINGO!", "FINAL LAB", JOptionPane.DEFAULT_OPTION, -1, null, botones, botones[0]);
                                                    gandr = gandr++;

                                                } else if (r11 == "X" && r14 == "X" && r17 == "X") {
                                                    JOptionPane.showOptionDialog(null, "Jugada #" + jug + "\n"
                                                            + "\n"
                                                            + "Balota 1: " + bal1 + "\n"
                                                            + "Balota 2: " + bal2 + "\n"
                                                            + "Balota 3: " + bal3 + "\n"
                                                            + " ----------------- \n"
                                                            + "|  " + r11 + "  |  " + r12 + "  |  " + r13 + "  |\n"
                                                            + " ----------------- \n"
                                                            + "|  " + r14 + "  |  " + r15 + "  |  " + r16 + "  |\n"
                                                            + " ----------------- \n"
                                                            + "|  " + r17 + "  |  " + r18 + "  |  " + r19 + "  |\n"
                                                            + " ----------------- \n"
                                                            + "\n"
                                                            + "¡BINGO!", "FINAL LAB", JOptionPane.DEFAULT_OPTION, -1, null, botones, botones[0]);
                                                    gandr = gandr + 1;

                                                } else if (r12 == "X" && r15 == "X" && r18 == "X") {
                                                    JOptionPane.showOptionDialog(null, "Jugada #" + jug + "\n"
                                                            + "\n"
                                                            + "Balota 1: " + bal1 + "\n"
                                                            + "Balota 2: " + bal2 + "\n"
                                                            + "Balota 3: " + bal3 + "\n"
                                                            + " ----------------- \n"
                                                            + "|  " + r11 + "  |  " + r12 + "  |  " + r13 + "  |\n"
                                                            + " ----------------- \n"
                                                            + "|  " + r14 + "  |  " + r15 + "  |  " + r16 + "  |\n"
                                                            + " ----------------- \n"
                                                            + "|  " + r17 + "  |  " + r18 + "  |  " + r19 + "  |\n"
                                                            + " ----------------- \n"
                                                            + "\n"
                                                            + "¡BINGO!", "FINAL LAB", JOptionPane.DEFAULT_OPTION, -1, null, botones, botones[0]);
                                                    gandr = gandr + 1;

                                                } else if (r13 == "X" && r16 == "X" && r19 == "X") {
                                                    JOptionPane.showOptionDialog(null, "Jugada #" + jug + "\n"
                                                            + "\n"
                                                            + "Balota 1: " + bal1 + "\n"
                                                            + "Balota 2: " + bal2 + "\n"
                                                            + "Balota 3: " + bal3 + "\n"
                                                            + " ----------------- \n"
                                                            + "|  " + r11 + "  |  " + r12 + "  |  " + r13 + "  |\n"
                                                            + " ----------------- \n"
                                                            + "|  " + r14 + "  |  " + r15 + "  |  " + r16 + "  |\n"
                                                            + " ----------------- \n"
                                                            + "|  " + r17 + "  |  " + r18 + "  |  " + r19 + "  |\n"
                                                            + " ----------------- \n"
                                                            + "\n"
                                                            + "¡BINGO!", "FINAL LAB", JOptionPane.DEFAULT_OPTION, -1, null, botones, botones[0]);
                                                    gandr = gandr + 1;

                                                } else {
                                                    JOptionPane.showOptionDialog(null, "Jugada No." + jug + "\n"
                                                            + "\n"
                                                            + "Balota 1: " + bal1 + "\n"
                                                            + "Balota 2: " + bal2 + "\n"
                                                            + "Balota 3: " + bal3 + "\n"
                                                            + " ----------------- \n"
                                                            + "|  " + r11 + "  |  " + r12 + "  |  " + r13 + "  |\n"
                                                            + " ----------------- \n"
                                                            + "|  " + r14 + "  |  " + r15 + "  |  " + r16 + "  |\n"
                                                            + " ----------------- \n"
                                                            + "|  " + r17 + "  |  " + r18 + "  |  " + r19 + "  |\n"
                                                            + " ----------------- \n"
                                                            + "\n"
                                                            + "Que mal:(( Suerte para la prxima!!",
                                                            "FINAL LAB", JOptionPane.DEFAULT_OPTION, -1, null, botones, botones[0]);

                                                }
                                                jug = jug + 1;
                                                //SUMAR 1 A LAS JUGADAS TOTALES

                                            }
                                            break;

                                    }
                                    // FIN MQ INICIAL BINGO
                                    conf33 = JOptionPane.showOptionDialog(null, "Quieres seguir usando el Juego de Bingo ",
                                            "FINAL LAB", JOptionPane.DEFAULT_OPTION,
                                            -1, null,
                                            btnbingo, btnbingo[0]);
                                    //CONTINUA SI DESEA USAR EL PROGRAMA DE NUEVO
                                }
                                JOptionPane.showMessageDialog(null,
                                        "GRACIAS POR UTILIZARME",
                                        "FINAL LAB",
                                        -1);

                                break;

                        }

                        ////// FIN DD INICIAL //////////////////
                        op1 = JOptionPane.showOptionDialog(null, textMenuop1, "FINAL LAB", 0, -1, null, top1, "Salir");
                    }

                    ////  FIN MQ INICIAL //////////
                    break;

                case 1://porcesos matematicos

                    JOptionPane.showMessageDialog(null, "EN CONSTRUCCION...");
                    break;

            }
///////////// FIN DD INICIAL ///////////

            opp = JOptionPane.showOptionDialog(null, textMenuopp, "FINAL LAB", 0, -1, null, topp, "Salir");
        }

        JOptionPane.showMessageDialog(null, "GRACIAS POR UTILIZARME", "FINAL LAB", -1);

    }
    
}
