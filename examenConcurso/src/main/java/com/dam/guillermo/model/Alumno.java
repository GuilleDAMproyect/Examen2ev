package com.dam.guillermo.model;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
private String nombre;
private String apellidos;
private String curso;
private String email;
private String fechaNacimiento;
private List<Pintura> listaPinturas;

//metodo para inscribir una pintura
public void inscripcionPintura(Pintura pinturaNueva) {
	
}

//constructor
public Alumno(String nombre, String apellidos, String curso, String email, String fechaNacimiento) {
	this.nombre = nombre;
	this.apellidos = apellidos;
	this.curso = curso;
	this.email = email;
	this.fechaNacimiento = fechaNacimiento;
	this.listaPinturas=new ArrayList<Pintura>();
}
//getters y setters
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getApellidos() {
	return apellidos;
}
public void setApellidos(String apellidos) {
	this.apellidos = apellidos;
}
public String getCurso() {
	return curso;
}
public void setCurso(String curso) {
	this.curso = curso;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getFechaNacimiento() {
	return fechaNacimiento;
}
public void setFechaNacimiento(String fechaNacimiento) {
	this.fechaNacimiento = fechaNacimiento;
}
public List<Pintura> getListaPinturas() {
	return listaPinturas;
}
public void setListaPinturas(List<Pintura> listaPinturas) {
	this.listaPinturas = listaPinturas;
}

}
