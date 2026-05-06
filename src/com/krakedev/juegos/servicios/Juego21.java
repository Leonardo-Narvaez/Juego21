package com.krakedev.juegos.servicios;

import java.util.ArrayList;

import com.krakedev.juegos.entidades.Carta;
import com.krakedev.juegos.entidades.Jugador;

public class Juego21 {

	private ArrayList<Jugador> jugadores;
	private Dealer dealer;

	public Dealer getDealer() {
		return dealer;
	}

	public void cargarValores() {
		for (Carta c : dealer.getNaipe()) {
			String valor = c.getValor();
			switch (valor) {
			case "A":
				c.setValorJuego(11);
				break;
			case "2":
				c.setValorJuego(2);
				break;
			case "3":
				c.setValorJuego(3);
				break;
			case "4":
				c.setValorJuego(4);
				break;
			case "5":
				c.setValorJuego(5);
				break;
			case "6":
				c.setValorJuego(6);
				break;
			case "7":
				c.setValorJuego(7);
				break;
			case "8":
				c.setValorJuego(8);
				break;
			case "9":
				c.setValorJuego(9);
				break;
			case "10":
				c.setValorJuego(10);
				break;
			case "J":
				c.setValorJuego(10);
				break;
			case "Q":
				c.setValorJuego(10);
				break;
			case "K":
				c.setValorJuego(10);
				break;
			default:
				c.setValorJuego(0);
				break;
			}
		}
	}

	public void inicializar() {
		jugadores = new ArrayList<>();
		dealer = new Dealer();
		cargarValores();
	}

	public void agregarJugador(Jugador jugador) {
		jugadores.add(jugador);
	}

	public void repartirCarta(Jugador jugador) {
		Carta c = dealer.entregarCarta();
		jugador.recibirCarta(c);
	}

	public void repartirRonda() {
		for (Jugador j : jugadores) {
			repartirCarta(j);
		}
		calcularTotal();
	}

	public void calcularTotal() {
		for (Jugador j : jugadores) {
			int valorTotal = 0;
			for (Carta c : j.getCartas()) {
				valorTotal += c.getValorJuego();	
			}
			j.setPuntajeCartas(valorTotal);
		}
	}

	public ArrayList<Jugador> validarGanador() {
		ArrayList<Jugador> ganadores = new ArrayList<>();
		for (Jugador j : jugadores) {
			if (j.getPuntajeCartas() == 21) {
				ganadores.add(j);
			}
		}
		return ganadores;
	}

	public ArrayList<Jugador> jugar() {
		ArrayList<Jugador> ganadores = new ArrayList<>();
		for (int i = 0; i < 3; i++) {
			repartirRonda();
			ganadores = validarGanador();
			if (ganadores.size() > 1) {
				break;
			}
		}
		return ganadores;
	}

}
