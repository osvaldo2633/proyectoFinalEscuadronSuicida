package com.reor.vitivinicola.dao;

import java.sql.SQLException;

public interface IEventoDao{
	public void saveEvento(Evento ev)throws SQLException;
	public Evento getEventoById(String Id);
}