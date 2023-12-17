package com.corporosoft.jugadaganadora.test;


import com.corporosoft.jugadaganadora.servicio.ServicioJugadaGanadoraDAO;

import java.util.ArrayList;
import java.util.List;

public class test {

	public static void main(String[] args) {

		ServicioJugadaGanadoraDAO servicio = new ServicioJugadaGanadoraDAO();

		List<String> lista = new ArrayList<String>();

		lista.add(servicio.obtenerNumero01().getNumero01());
		lista.add(servicio.obtenerNumero02().getNumero02());
		lista.add(servicio.obtenerNumero03().getNumero03());
		lista.add(servicio.obtenerNumero04().getNumero04());
		lista.add(servicio.obtenerNumero05().getNumero05());
		lista.add(servicio.obtenerNumero06().getNumero06());

		for (int i = 0; i < lista.size(); i++) {

			System.out.println("Resulta : " + lista.get(i));

		}

		System.out.println(" Resulta " + Utilitarios.listaOrdenada(lista));




	}

}
