package com.jakecode.service;

import java.util.List;

import com.jakecode.model.Especialidad;

public interface IEspecialidadService {
	
	Especialidad registrar(Especialidad esp);
	void modificar(Especialidad per);
	void eliminar(Integer id);
	List<Especialidad> listar();
	Especialidad listarId(int idEspecialidad);

}
