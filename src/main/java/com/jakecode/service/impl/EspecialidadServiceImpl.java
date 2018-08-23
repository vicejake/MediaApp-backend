package com.jakecode.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jakecode.dao.IEspecialidadDAO;
import com.jakecode.model.Especialidad;
import com.jakecode.service.IEspecialidadService;

@Service
public class EspecialidadServiceImpl implements IEspecialidadService{
	
	@Autowired
	IEspecialidadDAO dao;

	@Override
	public Especialidad registrar(Especialidad esp) {
		return dao.save(esp);
	}

	@Override
	public void modificar(Especialidad per) {
		dao.save(per);
	}

	@Override
	public void eliminar(Integer id) {
		dao.delete(id);
	}

	@Override
	public List<Especialidad> listar() {
		return dao.findAll();
	}

	@Override
	public Especialidad listarId(int idEspecialidad) {
		return dao.findOne(idEspecialidad);
	}
	
	
}
