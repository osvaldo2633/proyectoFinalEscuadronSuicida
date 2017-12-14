package com.reor.vitivinicola.dao;


import java.sql.ResultSet;

import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;

import javax.sql.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.*;

public class EventoDao implements IEventoDao{
	//variables locales
	private String EVENTO_INSERT;
	
	private JdbcTemplate template;
	
	public EventoDao() {
		Conectar con=new Conectar();
		this.template=new JdbcTemplate(con.conectar());
	}
    
    
    
    {
    	EVENTO_INSERT = 
            "insert into evento (NOMBRE_EVENTO, FECHA, DIRECCION, DESCRIPCION, IMAGEN, USER_ID)" +
            " values (?,?,?,?,?,?)";
    }
   
    public void saveEvento(Evento even) {
  
        this.template.update(
        	   "INSERT INTO evento (NOMBRE_EVENTO,FECHA,DIRECCION,DESCRIPCION,IMAGEN,USER_ID) VALUES (?,?,?,?,?,?)",
               even.getNombre_evento(), 
               even.getFecha(), 
               even.getDireccion(),
               even.getDescripcion(),
               even.getImagen(),
               even.getUser_id()             
        );
    }
    
    private static final String PRUEBA="insert into tag ()";
    
	
	public Evento getEventoById(String id){
		
		return new Evento();
	}
	
	public List<Evento> todos() {

	       String sql = "select * from evento";

	       return this.template.query(sql, new RowMapper<Evento>() {
	         
	           public Evento mapRow(ResultSet rs, int i) throws SQLException {
	               Evento p = new Evento();
	               p.setId_evento(rs.getString("ID_EVENTO"));
	               p.setNombre_evento(rs.getString("NOMBRE_EVENTO"));
	               p.setFecha(rs.getString("FECHA"));
	               p.setDireccion(rs.getString("DIRECCION"));
	               p.setDescripcion(rs.getString("DESCRIPCION"));
	               return p;
	           }
	           
	       });

	   }
} 