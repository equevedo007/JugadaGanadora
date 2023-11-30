package com.corporosoft.jugadaganadora.test;

import com.corporosoft.jugadaganadora.bean.Numero01;
import com.corporosoft.jugadaganadora.bean.Numero02;
import com.corporosoft.jugadaganadora.bean.Numero03;
import com.corporosoft.jugadaganadora.bean.Numero04;
import com.corporosoft.jugadaganadora.bean.Numero05;
import com.corporosoft.jugadaganadora.bean.Numero06;
import com.corporosoft.jugadaganadora.servicio.ServicioJugadaGanadoraDAO;
import com.corporosoft.jugadaganadora.utils.ConexionBD;


public class test {

	public static void main(String[] args) {

		
	
		ServicioJugadaGanadoraDAO servicio = new ServicioJugadaGanadoraDAO();
		
		Numero01 objNumero01= servicio.obtenerNumero01();
		Numero02 objNumero02= servicio.obtenerNumero02();
		Numero03 objNumero03= servicio.obtenerNumero03();
		Numero04 objNumero04= servicio.obtenerNumero04();
		Numero05 objNumero05= servicio.obtenerNumero05();
		Numero06 objNumero06= servicio.obtenerNumero06();
		
		System.out.println("Numero 01 es : " + objNumero01.getNumero01());
		System.out.println("Numero 02 es : " + objNumero02.getNumero02());
		System.out.println("Numero 03 es : " + objNumero03.getNumero03());
		System.out.println("Numero 04 es : " + objNumero04.getNumero04());
		System.out.println("Numero 05 es : " + objNumero05.getNumero05());
		System.out.println("Numero 06 es : " + objNumero06.getNumero06());
		
	}

}
