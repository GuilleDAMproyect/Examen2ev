package com.dam.guillermo.model;

import java.util.ArrayList;
import java.util.List;

public class Concurso {
	private String nombre;
	private List<Visitante> listaVisitantes;
	private List<Colegio> listaColegios;
	
	
	//metodo puntuar cuadros
	public void puntuar(Visitante visitante,Pintura pintura,int puntos) {
		if (!listaVisitantes.contains(visitante)) {
			System.out.println("usuario no encontrado, por favor registrate");
		}
		if ((puntos<0)||(puntos>5)) {
			System.out.println("valoracion incorrecta");
		}
			pintura.sumaValoracion(puntos);
	}
	

	//metodo registro colegios
	public void registroColegios(Colegio colegioNuevo) {
		
	}
	//metodo registro usuario
	public void registroVisitante(Visitante visitanteNuevo) {
		
	}
	//constructor
	public Concurso(String nombre) {
		
		this.nombre = nombre;
		this.listaColegios=new ArrayList<Colegio>();
		this.listaVisitantes=new ArrayList<Visitante>();
	}
	//getters y setters
	public List<Visitante> getListaVisitantes() {
		return listaVisitantes;
	}
	public void setListaVisitantes(List<Visitante> listaVisitantes) {
		this.listaVisitantes = listaVisitantes;
	}
	public List<Colegio> getListaColegios() {
		return listaColegios;
	}
	public void setListaColegios(List<Colegio> listaColegios) {
		this.listaColegios = listaColegios;
	}
	
}
