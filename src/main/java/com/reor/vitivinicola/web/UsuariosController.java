package com.reor.vitivinicola.web;

import com.reor.vitivinicola.dao.Conectar;
import com.reor.vitivinicola.dao.Evento;
import com.reor.vitivinicola.dao.EventoDao;
import com.reor.vitivinicola.security.SecurityContextFacade;

import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UsuariosController{
	
	JdbcTemplate template;
	
	public UsuariosController() {
		Conectar con=new Conectar();
		this.template=new JdbcTemplate(con.conectar());
	}
	
	
	
	@RequestMapping(value="/secured/usr/insertar.htm", method = RequestMethod.GET, params={"nombre","fecha","direccion","descripcion","imagen"})
    public ModelAndView insertar(
    		@RequestParam("nombre") String nombre,
    		@RequestParam("fecha") String fecha,
    		@RequestParam("direccion") String direccion,
    		@RequestParam("descripcion") String descripcion,
    		@RequestParam("imagen") String imagen
    		)throws SQLException {
		
		EventoDao evenDAO=new EventoDao();
		
		long user_id=SecurityContextFacade.getAuthenticatedUser().getUserId();
		Evento even =new Evento(
			nombre,fecha,direccion,descripcion,imagen,user_id
		);
	
		evenDAO.saveEvento(even);
		ModelAndView model=new ModelAndView();
		model.setViewName("forotherusers/formulario_evento");
		model.addObject("mensaje","Evento ingresado con éxito");
		model.addObject("user",SecurityContextFacade.getAuthenticatedUser());
		
		return model;
	
    }
	
	
	@RequestMapping(value="/secured/usr/prueba.htm")
    public ModelAndView prueba() {
		long user_id=SecurityContextFacade.getAuthenticatedUser().getUserId();
		ModelAndView model=new ModelAndView();
		model.setViewName("forotherusers/ingreso");
		model.addObject("message","caca");
        return model;
    }
	
	@RequestMapping(value="/secured/usr/formulario_evento.htm")
    public ModelAndView formularioEvento(){
		ModelAndView model=new ModelAndView();
		
		model.setViewName("forotherusers/formulario_evento");
		model.addObject("user",SecurityContextFacade.getAuthenticatedUser());
        return model;
    }
	
}