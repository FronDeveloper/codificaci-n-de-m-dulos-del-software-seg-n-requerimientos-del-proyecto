package com.registro.usuarios.dto;

public class UsuarioRegistroDTO {

	private Long id;
	private String nombre;
	private String apellido;
	private String email;
	private String password;
	
	/* MÉTODO GETTERS AND SETTERS */
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	/* MÉTODO CONSTRUCTOR */
	public UsuarioRegistroDTO(Long id, String nombre, String apellido, String email, String password) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.password = password;
	}
	
	/* MÉTODO CONSTRUCTOR */
	public UsuarioRegistroDTO(String nombre, String apellido, String email, String password) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.password = password;
	}
	
	/* MÉTODO CONSTRUCTOR */
	public UsuarioRegistroDTO(String email) {
		super();
		this.email = email;
	}
	
	/* MÉTODO CONSTRUCTOR VACÍO*/
	public UsuarioRegistroDTO() {
		super();
	}
	
}
