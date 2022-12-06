package com.corporosoft.jugadaganadora.interfaces;

import com.corporosoft.jugadaganadora.bean.Numero01;
import com.corporosoft.jugadaganadora.bean.Numero02;
import com.corporosoft.jugadaganadora.bean.Numero03;
import com.corporosoft.jugadaganadora.bean.Numero04;
import com.corporosoft.jugadaganadora.bean.Numero05;
import com.corporosoft.jugadaganadora.bean.Numero06;
import com.corporosoft.jugadaganadora.bean.UltimaJugadaBean;


public interface JugadaGanadoraDAO {
	
	public void BorrarSorteo();
	
	public void RealizarJugada();
	
	public Numero01 obtenerNumero01();
	
	public Numero02 obtenerNumero02();
	
	public Numero03 obtenerNumero03();
	
	public Numero04 obtenerNumero04();
	
	public Numero05 obtenerNumero05();
	
	public Numero06 obtenerNumero06();
	
	public UltimaJugadaBean UltimaJugada();
	


}
