package com.krakedev.juegos.entidades;

import java.util.ArrayList;

public class Jugador {
	private String nickname;
	private ArrayList<Carta> cartas = new ArrayList<>();

	public Jugador(String nickname) {
		this.nickname = nickname;
	}

	public void recibirCarta(Carta carta) {
		cartas.add(carta);
	}

}
