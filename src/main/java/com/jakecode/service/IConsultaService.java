package com.jakecode.service;

import java.util.List;

import com.jakecode.model.Consulta;

public interface IConsultaService {
	
	Consulta registrar(Consulta cns);
	void modificar(Consulta cns);
	void eliminar(Integer id);
	List<Consulta> listar();
	Consulta listarId(int idConsulta);


}
