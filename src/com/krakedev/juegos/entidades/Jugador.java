package com.krakedev.juegos.entidades;

import java.util.ArrayList;

public class Jugador {
	private String nickname;
	private ArrayList<Carta> cartas = new ArrayList<>();
	private int puntajeCartas;
	
	
	public String getNickname() {
		return nickname;
	}

	public ArrayList<Carta> getCartas() {
		return cartas;
	}

	public int getPuntajeCartas() {
		return puntajeCartas;
	}

	public void setPuntajeCartas(int puntajeCartas) {
		this.puntajeCartas = puntajeCartas;
	}

	public Jugador(String nickname) {
		this.nickname = nickname;
	}

	public void recibirCarta(Carta carta) {
		cartas.add(carta);
	}

	public void imprimir() {
		System.out.println("Nickname: " + nickname);
		System.out.println("---Cartas Asignadas---");
		for (Carta c : cartas) {
			c.imprimir();
		}
	}
}
