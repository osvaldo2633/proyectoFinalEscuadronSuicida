package com.reor.vitivinicola.security;

import java.util.Collection;


import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

public class SecurityUser extends User{

	private static final long serialVersionUID=1L;
	
	private long userId;
	private String nombre;
	private String apellidos;
	private String email;
	
	public SecurityUser(
			String login, String password, 
            boolean enabled, boolean accountNonExpired, boolean credentialsNonExpired,
            boolean accountNonLocked, Collection<? extends GrantedAuthority> authorities,
            Long userId,
            String nombre,
            String apellidos,
            String email
   
            ) {
		super(login, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities );
		this.userId=userId;
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.email=email;
	}
	
	
	public SecurityUser(
            String login, String password, 
            boolean enabled, boolean accountNonExpired, boolean credentialsNonExpired,
            boolean accountNonLocked, Collection<? extends GrantedAuthority> authorities
            ) { 
		super(login, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities ); 
	}


	public long getUserId() {
		return userId;
	}


	public void setUserId(long userId) {
		this.userId = userId;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellido(String apellidos) {
		this.apellidos = apellidos;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}