package com.dam.guillermo.model;

import java.util.ArrayList;
import java.util.List;

public class Colegio {
private String nombre;
private String direccion;
private String email;
private String contrasena;
private String personaContacto;
private List<Alumno> listaAlumnos;

//metodo para inscribir a un alumno
public void inscribirAlumno(Alumno alumnoNuevo) {
	
}
//constructor
public Colegio(String nombre, String direccion, String email, String contrasena, String personaContacto) {

	this.nombre = nombre;
	this.direccion = direccion;
	this.email = email;
	this.contrasena = contrasena;
	this.personaContacto = personaContacto;
	this.listaAlumnos=new ArrayList<Alumno>();
}
//getters y setters
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getDireccion() {
	return direccion;
}
public void setDireccion(String direccion) {
	this.direccion = direccion;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getContrasena() {
	return contrasena;
}
public void setContrasena(String contrasena) {
	this.contrasena = contrasena;
}
public String getPersonaContacto() {
	return personaContacto;
}
public void setPersonaContacto(String personaContacto) {
	this.personaContacto = personaContacto;
}
public List<Alumno> getListaAlumnos() {
	return listaAlumnos;
}
public void setListaAlumnos(List<Alumno> listaAlumnos) {
	this.listaAlumnos = listaAlumnos;
}

}
