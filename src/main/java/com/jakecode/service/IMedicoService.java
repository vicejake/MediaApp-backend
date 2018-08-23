package com.jakecode.service;

import java.util.List;

import com.jakecode.model.Medico;

public interface IMedicoService {
	
	Medico registrar(Medico med);
	void modificar(Medico med);
	void eliminar(Integer id);
	List<Medico> listar();
	Medico listarId(int idMedico);

}
