package com.reor.vitivinicola.service;
import java.io.Serializable;
import java.util.List;
import java.util.Iterator;
import com.reor.vitivinicola.dao.Evento;

public class SimpleEventoManager implements EventoManager{
	private List<Evento> even;
	
	public List<Evento> getEventos(){	
		return even;
	}
	
	public Evento getById(String id){
		Iterator itr = even.iterator();
	    Evento evento;
	    while (itr.hasNext()) {
	      evento = (Evento)itr.next();
	      if (evento.getId_evento().equals(id)) return evento;
	    }
	    return null;
	  }


}