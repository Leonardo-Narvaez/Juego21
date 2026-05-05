package com.krakedev.juegos.servicios;

import java.util.ArrayList;
import java.util.List;

import com.krakedev.juegos.entidades.Carta;

public class Dealer {
	private ArrayList<Carta> baraja;

	public ArrayList<Carta> getBaraja() {
		return baraja;
	}

	public void setBaraja(ArrayList<Carta> baraja) {
		this.baraja = baraja;
	}

	public Dealer() {
		baraja = new ArrayList<>();
		generarNaipe();

	}

	public void generarNaipe() {
		ArrayList<String> palo = new ArrayList<>(List.of("T", "CN", "CR", "D"));
		ArrayList<String> valor = new ArrayList<>(
				List.of("A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"));
		for (String simbolo : palo) {
			for (String valor1 : valor) {
				baraja.add(new Carta(valor1, simbolo));
			}

		}
	}

	public void imprimirNaipe() {
		for (Carta naipe : baraja) {
			naipe.imprimir();
		}
	}

	public int generarAleatorio(int maximo) {
		int numerico = (int) (Math.random() * (maximo + 1));
		return numerico;
	}

	public Carta entregarCarta() {
		int posicion = generarAleatorio(baraja.size() - 1);
		Carta c = baraja.get(posicion);
		baraja.remove(posicion);

		return c;

	}
}
