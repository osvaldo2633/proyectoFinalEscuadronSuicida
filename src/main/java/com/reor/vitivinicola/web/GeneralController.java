package com.reor.vitivinicola.web;
 
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.reor.vitivinicola.security.SecurityContextFacade;
import com.reor.vitivinicola.type.AllowedAuthorities;
 
@Controller
public class GeneralController {
 
    private static final Logger logger = Logger.getLogger(GeneralController.class);
     
    @RequestMapping(value="/index.htm")
    public String index() {
        return "index";
    }
    @RequestMapping(value="/indexLogin.htm")
    public String indexLogin() {
        return "../index";
    }
     
    @RequestMapping(value="/secured/access.htm")
    public String loginAction(Model model) {
         
        String paginaInicio = "main/index";
        try {
                paginaInicio = "index";
 
                if (SecurityContextFacade.hasAuthenticatedUserRole(AllowedAuthorities.ROLE_ADMIN)) {
                    paginaInicio = "redirect:/secured/adm/index.htm";
                } else if (SecurityContextFacade.hasAuthenticatedUserRole(AllowedAuthorities.ROLE_STAFF)) {
                    paginaInicio = "redirect:/secured/stf/index.htm";
                } else if (SecurityContextFacade.hasAuthenticatedUserRole(AllowedAuthorities.ROLE_USER)) {
                    paginaInicio = "redirect:/secured/usr/index.htm";
                }
        } catch (Exception e) { logger.error(e.getMessage(), e); }
        return paginaInicio;
    }
 
    @RequestMapping(value="/secured/adm/index.htm")
    public ModelAndView adminsHome() {
    	ModelAndView model=new ModelAndView();
    	
    	model.setViewName("foradmins/index");
    	
    	model.addObject("user", SecurityContextFacade.getAuthenticatedUser());
        return model;
    }
    @RequestMapping(value="/secured/stf/index.htm")
    public String staffsHome() {
        return "forotherusers/index";
    }  
    @RequestMapping(value="/secured/usr/index.htm")
    public ModelAndView usersHome() {
    	ModelAndView model=new ModelAndView();
    	model.setViewName("forotherusers/index");
    	model.addObject("user", SecurityContextFacade.getAuthenticatedUser());
        return model;
    }  
    
    
}