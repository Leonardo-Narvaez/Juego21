package com.krakedev.juegos.test;

import com.krakedev.juegos.entidades.Jugador;
import com.krakedev.juegos.servicios.Juego21;

public class TestJuego21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Juego21 black = new Juego21();

		Jugador npc1 = new Jugador("Manolo");
		Jugador npc2 = new Jugador("Sofia");
		Jugador npc3 = new Jugador("Firulais");

		black.inicializar();

		black.agregarJugador(npc1);
		black.agregarJugador(npc2);
		black.agregarJugador(npc3);

		black.repartirRonda();
		System.out.println("---Jugador 1---");
		npc1.imprimir();
		System.out.println("---Jugador 2---");
		npc2.imprimir();
		System.out.println("---Jugador 3---");
		npc3.imprimir();

		System.out.println("---Cartas en la Baraja---");
		black.getDealer().imprimirNaipe();
	}

}
