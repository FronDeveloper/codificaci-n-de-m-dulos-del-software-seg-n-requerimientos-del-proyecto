package com.registro.usuarios.servicios;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.registro.usuarios.dto.UsuarioRegistroDTO;
import com.registro.usuarios.modelo.Usuario;

public interface UsuarioServicio extends UserDetailsService {
	
	public Usuario guardarUsuario(UsuarioRegistroDTO registroDTO);

}
