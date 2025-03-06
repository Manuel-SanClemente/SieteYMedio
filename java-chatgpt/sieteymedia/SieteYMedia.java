package sieteymedia;

import recursos.Carta;

public class SieteYMedia {

    // Calcula el valor total de las cartas
    double valorCartas(Carta[] cartas) {
        double total = 0.0;
        int val;
        int i = 0;
        while (cartas[i] != null) {
            val = cartas[i].getNumero();
            total += (val > 7) ? 0.5 : val;
            i++;
        }
        return total;
    }

    // Inserta una carta en el arreglo de cartas
    void insertarCartaEnArray(Carta[] cartas, Carta c) {
        int i = 0;
        while (cartas[i] != null) {
            i++;
        }
        cartas[i] = c;
    }

    // Muestra las cartas en el arreglo
    void mostrarCartas(Carta[] cartas) {
        int i = 0;
        while (cartas[i] != null) {
            System.out.print("\t" + cartas[i]);
            i++;
        }
    }

    // Método para comprobar si el valor de las cartas es menor a 7.5
    boolean esValorMenorQue7YMedio(Carta[] cartas) {
        return valorCartas(cartas) < 7.5;
    }

    // Método para comprobar si la banca debe seguir pidiendo cartas
    boolean esBancaDebePedirCarta(Carta[] cartasBanca, double valorCartasJugador) {
        return valorCartas(cartasBanca) < valorCartasJugador;
    }

    // Método para comprobar si la banca se pasa de 7.5
    boolean esBancaSePasoDe7YMedio(Carta[] cartasBanca) {
        return valorCartas(cartasBanca) > 7.5;
    }
}
