package com.corporosoft.jugadaganadora.dao;

import com.corporosoft.jugadaganadora.interfaces.JugadaGanadoraDAO;

public class MySQLDAOFactory extends DAOFactory{

	@Override
	public JugadaGanadoraDAO getJugadaGanadoraDAO() {
		// TODO Auto-generated method stub
		return new MySQLJugadaGanadoraDAO();
	}

}
