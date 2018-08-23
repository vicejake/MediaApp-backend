package com.jakecode.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jakecode.dao.IPacienteDAO;
import com.jakecode.model.Paciente;
import com.jakecode.service.IPacienteService;

@Service
public class PacienteServiceImpl  implements IPacienteService{

	@Autowired
	IPacienteDAO dao;
	
	@Override
	public Paciente registrar(Paciente per) {
		return dao.save(per);
	}

	@Override
	public void modificar(Paciente per) {
		dao.save(per);
	}

	@Override
	public void eliminar(Integer id) {
		dao.delete(id);
	}

	@Override
	public List<Paciente> listar() {
		return dao.findAll();
	}

	@Override
	public Paciente listarId(int idPaciente) {
		return dao.findOne(idPaciente);
	}

}
