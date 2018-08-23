package com.jakecode.service;

import java.util.List;

import com.jakecode.model.Examen;

public interface IExamenService {
	
	Examen registrar(Examen exm);
	void modificar(Examen exm);
	void eliminar(Integer id);
	List<Examen> listar();
	Examen listarId(int idExamen);

}
