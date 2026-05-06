package com.krakedev.juegos.test;

import java.util.ArrayList;

import com.krakedev.juegos.entidades.Jugador;
import com.krakedev.juegos.servicios.Juego21;

public class TestJuego21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Juego21 black = new Juego21();
		

		Jugador npc1 = new Jugador("Manolo");
		Jugador npc2 = new Jugador("Sofia");
		Jugador npc3 = new Jugador("Firulais");
		Jugador npc4 = new Jugador("Alexandra");


		black.inicializar();

		black.agregarJugador(npc1);
		black.agregarJugador(npc2);
		black.agregarJugador(npc3);
		black.agregarJugador(npc4);


		

		ArrayList<Jugador> ganadores1 = new ArrayList<>();

		// PRIMERA PRUEBA

		ganadores1 = black.jugar();

		System.out.println("-----Ganadores Prueba 1-----");
		for (Jugador j : ganadores1) {
			System.out.println(j.getNickname());
		}

		// PRUEBA DOS 10 REPETICIONES
		for (int i = 0; i < 10; i++) {
			Juego21 white = new Juego21();
			ArrayList<Jugador> ganadores2 = new ArrayList<>();
			
			Jugador npc5 = new Jugador("Manolo");
			Jugador npc6 = new Jugador("Sofia");
			Jugador npc7 = new Jugador("Firulais");
			Jugador npc8 = new Jugador("Alexandra");
			
			white.inicializar();

			white.agregarJugador(npc5);
			white.agregarJugador(npc6);
			white.agregarJugador(npc7);
			white.agregarJugador(npc8);
			
			ganadores2 = white.jugar();
			
			System.out.println("-----Ganadores Prueba 2-----");
			
			for (Jugador j : ganadores2) {
				System.out.println(j.getNickname());
			}
		}
	}
}
