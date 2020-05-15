package com.dam.guillermo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.dam.guillermo.model.Concurso;
import com.dam.guillermo.model.Pintura;
import com.dam.guillermo.model.Visitante;




public class ConcursoTest {
static Visitante visitante;
static Pintura pintura;
static Concurso concurso;
	
@BeforeAll
private static void inicializacionObjetos(){
	visitante=new Visitante("pepe","1234");
	pintura=new Pintura("paisaje", "pincel", 1, 2, 0);
	concurso=new Concurso("los arboles");
}
@Test
public void procesoPuntuacion() {
	//el usuario existe
	concurso.getListaVisitantes().add(visitante);
	concurso.puntuar(visitante, pintura, 3);
	assertEquals(3,concurso.getListaVisitantes().get(0).getPinturasPuntuadas().get(0).getValoracionTotal());
	
//puntuacion no valida
	assertEquals("valoracion incorrecta",concurso.puntuar(visitante, pintura, 10);));
}
}
