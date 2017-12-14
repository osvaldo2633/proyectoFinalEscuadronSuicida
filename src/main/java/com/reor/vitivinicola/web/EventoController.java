package com.reor.vitivinicola.web;
import com.reor.vitivinicola.dao.*;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.reor.vitivinicola.security.SecurityContextFacade;

import java.sql.SQLException;
import java.util.Map;

import javax.sql.DataSource;

import java.util.HashMap;

@Controller
public class EventoController{
	
	
	
	
	@RequestMapping(value="/secured/adm/pruebas.htm")
    public ModelAndView prueba() {
		long user_id=SecurityContextFacade.getAuthenticatedUser().getUserId();
		ModelAndView model=new ModelAndView();
		model.setViewName("foradmins/ingreso");
		model.addObject("message","cacaprimero");
        return model;
    }
	
}