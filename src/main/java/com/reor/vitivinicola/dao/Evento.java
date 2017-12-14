package com.reor.vitivinicola.dao;

import java.util.Date;

public class Evento{

	private String id_evento;
	private String nombre_evento;
	private String fecha;
	private String direccion;
	private String descripcion;
	private String imagen;
	private long user_id;
	
	
	public Evento(){
	}
	
	public Evento(String nombre_evento, String fecha,String direccion, String descripcion,
			String imagen, long user_id){
		
		this.nombre_evento=nombre_evento;
		this.fecha=fecha;
		this.direccion=direccion;
		this.descripcion=descripcion;
		this.imagen=imagen;
		this.user_id=user_id;
	}
	
	
	public String getId_evento() {
		return id_evento;
	}

	public void setId_evento(String id_evento) {
		this.id_evento = id_evento;
	}

	public String getNombre_evento() {
		return nombre_evento;
	}

	public void setNombre_evento(String nombre_evento) {
		this.nombre_evento = nombre_evento;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public long getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	

	

	


}