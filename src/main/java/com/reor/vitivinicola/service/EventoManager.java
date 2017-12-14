package com.reor.vitivinicola.service;
import java.io.Serializable;
import java.util.List;
import com.reor.vitivinicola.dao.Evento;


public interface EventoManager extends Serializable{
   public List<Evento> getEventos();
   public Evento getById(String id);
}