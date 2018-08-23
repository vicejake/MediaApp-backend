package com.jakecode.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jakecode.dao.IExamenDAO;
import com.jakecode.model.Examen;
import com.jakecode.service.IExamenService;

@Service
public class ExamenServiceImpl implements IExamenService {
	
	@Autowired
	IExamenDAO dao;

	@Override
	public Examen registrar(Examen exm) {
		return dao.save(exm);
	}

	@Override
	public void modificar(Examen exm) {
		dao.save(exm);		
	}

	@Override
	public void eliminar(Integer id) {
		dao.delete(id);
	}

	@Override
	public List<Examen> listar() {
		return dao.findAll();
	}

	@Override
	public Examen listarId(int idExamen) {
		return dao.findOne(idExamen);
	}


}
