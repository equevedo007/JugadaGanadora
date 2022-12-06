package com.corporosoft.jugadaganadora.dao;

import com.corporosoft.jugadaganadora.interfaces.JugadaGanadoraDAO;

public abstract class DAOFactory {
	
	public abstract JugadaGanadoraDAO getJugadaGanadoraDAO();
	
	public static final int MYSQL=1;
	
public static DAOFactory getDAOFactory(int edinson){
		
		switch (MYSQL) {
		case 1:
			
			return new MySQLDAOFactory();

		default:
			return null;
		}
	}

}
