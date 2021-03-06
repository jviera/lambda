package com.vieracode;

import com.vieracode.common.Posicion;
import com.vieracode.model.Jugador;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Jugador> listaJugadores = new ArrayList<>();

        listaJugadores.add(new Jugador("Jorge Campos", LocalDate.of(2018, 10, 30), Posicion.PORTERO));
        listaJugadores.add(new Jugador("Claudio Suarez", LocalDate.of(2018, 10, 30), Posicion.DEFENSA));
        listaJugadores.add(new Jugador("Alberto Garcia Azpe", LocalDate.of(2018, 10, 30), Posicion.MEDIO));
        listaJugadores.add(new Jugador("Luis Hernandez", LocalDate.of(2018, 10, 30), Posicion.DELANTERO));
        listaJugadores.add(new Jugador("Cuahutemoc Blanco", LocalDate.of(2018, 10, 30), Posicion.DELANTERO));

        listaJugadores.sort((p1, p2) -> p1.getNombre().compareTo(p2.getNombre()));

        for (Jugador jugador : listaJugadores) {
            System.out.printf("%s %s %s %n", jugador.getNombre(), jugador.getFechaNacimiento(), jugador.getPosicion());
        }
    }
}