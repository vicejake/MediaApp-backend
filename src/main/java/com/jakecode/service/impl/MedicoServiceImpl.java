package com.jakecode.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jakecode.dao.IMedicoDAO;
import com.jakecode.model.Medico;
import com.jakecode.service.IMedicoService;

@Service
public class MedicoServiceImpl implements IMedicoService{
	
	@Autowired
	IMedicoDAO dao;

	@Override
	public Medico registrar(Medico med) {
		return dao.save(med);
	}

	@Override
	public void modificar(Medico med) {
		dao.save(med);		
	}

	@Override
	public void eliminar(Integer id) {
		dao.delete(id);		
	}

	@Override
	public List<Medico> listar() {
		return dao.findAll();
	}

	@Override
	public Medico listarId(int idMedico) {
		return dao.findOne(idMedico);
	}

	

}
