package com.corporosoft.jugadaganadora.servicio;


import com.corporosoft.jugadaganadora.bean.Numero01;
import com.corporosoft.jugadaganadora.bean.Numero02;
import com.corporosoft.jugadaganadora.bean.Numero03;
import com.corporosoft.jugadaganadora.bean.Numero04;
import com.corporosoft.jugadaganadora.bean.Numero05;
import com.corporosoft.jugadaganadora.bean.Numero06;
import com.corporosoft.jugadaganadora.bean.UltimaJugadaBean;
import com.corporosoft.jugadaganadora.dao.DAOFactory;
import com.corporosoft.jugadaganadora.interfaces.JugadaGanadoraDAO;
import static com.corporosoft.jugadaganadora.utils.Constante.ORIGEN_DE_DATOS;

public class ServicioJugadaGanadoraDAO {
	

	DAOFactory fabrica = DAOFactory.getDAOFactory(ORIGEN_DE_DATOS);
	JugadaGanadoraDAO objJugadaGanadoraDAO=fabrica.getJugadaGanadoraDAO();
	
	public void BorrarSorte () {
		objJugadaGanadoraDAO.BorrarSorteo();
	}
	
	public void RealizarJugada () {
		objJugadaGanadoraDAO.RealizarJugada();
	}
	
	public Numero01 obtenerNumero01 () {
		Numero01 objNumero01=null;
		objNumero01=objJugadaGanadoraDAO.obtenerNumero01();
		return objNumero01;
		
	}
	
	public Numero02 obtenerNumero02 () {
		Numero02 objNumero02=null;
		objNumero02=objJugadaGanadoraDAO.obtenerNumero02();
		return objNumero02;
		
	}

	public Numero03 obtenerNumero03 () {
		Numero03 objNumero03=null;
		objNumero03=objJugadaGanadoraDAO.obtenerNumero03();
		return objNumero03;
		
	}
	
	public Numero04 obtenerNumero04() {
		Numero04 objNumero04=null;
		objNumero04=objJugadaGanadoraDAO.obtenerNumero04();
		return objNumero04;
		
	}
	
	public Numero05 obtenerNumero05() {
		Numero05 objNumero05=null;
		objNumero05=objJugadaGanadoraDAO.obtenerNumero05();
		return objNumero05;
		
	}

	public Numero06 obtenerNumero06() {
		Numero06 objNumero06=null;
		objNumero06=objJugadaGanadoraDAO.obtenerNumero06();
		return objNumero06;
		
	}
	
	public UltimaJugadaBean UltimaJugada() {
		UltimaJugadaBean objUltimaJugadaBean=null;
		objUltimaJugadaBean =objJugadaGanadoraDAO.UltimaJugada();
		return objUltimaJugadaBean;
	}




}
