package com.dam.guillermo.model;

import java.util.ArrayList;
import java.util.List;

public class Pintura {
private String nombre;
private String tecnica;
private int alto;
private int ancho;
private int valoracionTotal;
private List<Visitante> listaVisitantes;
//metodo de suma
public void sumaValoracion(int valoracion) {
	valoracionTotal+=valoracion;
}
//constructor
public Pintura(String nombre, String tecnica, int alto, int ancho, int valoracionTotal) {
	
	this.nombre = nombre;
	this.tecnica = tecnica;
	this.alto = alto;
	this.ancho = ancho;
	this.valoracionTotal = valoracionTotal;
	this.listaVisitantes= new ArrayList<Visitante>();
}
//getters y setters
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getTecnica() {
	return tecnica;
}
public void setTecnica(String tecnica) {
	this.tecnica = tecnica;
}
public int getAlto() {
	return alto;
}
public void setAlto(int alto) {
	this.alto = alto;
}
public int getAncho() {
	return ancho;
}
public void setAncho(int ancho) {
	this.ancho = ancho;
}
public int getValoracionTotal() {
	return valoracionTotal;
}
public void setValoracionTotal(int valoracionTotal) {
	this.valoracionTotal = valoracionTotal;
}
public List<Visitante> getListaVisitantes() {
	return listaVisitantes;
}
public void setListaVisitantes(List<Visitante> listaVisitantes) {
	this.listaVisitantes = listaVisitantes;
}
}
