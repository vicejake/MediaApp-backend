package com.jakecode.service;

import java.util.List;

import com.jakecode.model.Paciente;

public interface IPacienteService {
	
	Paciente registrar(Paciente per);
	void modificar(Paciente per);
	void eliminar(Integer id);
	List<Paciente> listar();
	Paciente listarId(int idPaciente);
	
	

}
