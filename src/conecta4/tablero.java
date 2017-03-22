package conecta4;

import java.util.*;
/**
 *
 * @author Ayoub
 */
@SuppressWarnings("unused")
public class tablero {

    private int filas = 6;
    private static int columnas = 7;
    static ficha mesa[][];
    static int huecos[] = new int[columnas];
    private ficha vacio = new ficha("-");
    static boolean victoria = false;

// TABLERO
    tablero() {
        mesa = new ficha[filas][columnas];

        for (int i = 0; i <= filas; i++) {
            huecos[i] = 6;
        }

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                mesa[i][j] = vacio;
            }
        }
    }

//GETCASILLA
    ficha getCasilla(int fil, int col) {
        return mesa[col - 1][fil - 1];
    }

//PONERFICHA
    public boolean ponerFicha(ficha tipo, int columna) {
        int col = columna - 1;
        boolean aux = false;

        try {
            int fil_aux = huecos[col];

            if (huecos[col] == 0) {
                huecos[col] = 0;
                mesa[fil_aux - 1][col] = mesa[fil_aux - 1][col];
                aux = false;
            } else {
                mesa[fil_aux - 1][col] = tipo;
                huecos[col] = huecos[col] - 1;
                aux = true;
            }

        } catch (ArrayIndexOutOfBoundsException err) {
            System.out.println("Error al insertar la ficha");
            partida.cambiarTurno();
            aux = false;
        }

        cuatroEnRaya(tipo);
        return aux;
    }

//CUATROENRAYA
    public boolean cuatroEnRaya(ficha ficha) {
        boolean aux = false;
        ficha ganador;
        int cuenta = 0;

        try {

        } catch (IndexOutOfBoundsException err) {
        }

        // COMPROBAR VERTICAL
        for (int j = 0; j < getColumnas() - 1; j++) {
            cuenta = 0;
            for (int i = getFilas() - 1; i >= 0; i--) {

                if (mesa[i][j].getTipo_() == ficha.getTipo_()) {
                    cuenta++;
                    if (cuenta == 4) {
                        System.out.println("GANO LA FICHA "  + ficha );
                        victoria = true;
                        return true;
                    }
                } else {
                    cuenta = 0;
                }

            }
        }

        return aux;
    }

//GETFILAS
    public int getFilas() {
        return filas;
    }

//GETCOLUMNAS
    public int getColumnas() {
        return columnas;
    }
}
