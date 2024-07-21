package com.registro.usuarios.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.registro.usuarios.dto.UsuarioRegistroDTO;
import com.registro.usuarios.servicios.UsuarioServicio;

@Controller
@RequestMapping("/registro")
public class RegistroUsuarioController {
	
	private UsuarioServicio usuarioServicio;

	public RegistroUsuarioController(UsuarioServicio usuarioServicio) {
		super();
		this.usuarioServicio = usuarioServicio;
	}
	
	@ModelAttribute("usuario")
	public UsuarioRegistroDTO retornarNuevoUsuarioRegistroDTO() {
		return new UsuarioRegistroDTO();
	}
	
	@GetMapping
	public String mostrarFormularioRegistro() {
		return "registro";
	}
	
	@PostMapping
	public String registrarCuentaUsuario(@ModelAttribute("usuario") UsuarioRegistroDTO registroDTO) {
		usuarioServicio.guardarUsuario(registroDTO);
		return "redirect:/registro?exito";
	}

}
