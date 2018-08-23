package com.jakecode.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jakecode.dao.IConsultaDAO;
import com.jakecode.model.Consulta;
import com.jakecode.model.DetalleConsulta;
import com.jakecode.service.IConsultaService;

@Service
public class ConsultaServiceImpl implements IConsultaService {

	@Autowired
	IConsultaDAO dao;

	@Override
	public Consulta registrar(Consulta cns) {
//		cns.getDetalleConsulta().forEach( x -> {
//			x.setConsulta(cns);
//		});
		
		cns.getDetalleConsulta().forEach( x -> 	x.setConsulta(cns));
		
//		for(DetalleConsulta det : cns.getDetalleConsulta()) {
//			det.setConsulta(cns);
//		}
		
		return dao.save(cns);
	}

	@Override
	public void modificar(Consulta cns) {
		dao.save(cns);
	}

	@Override
	public void eliminar(Integer id) {
		dao.delete(id);
	}

	@Override
	public List<Consulta> listar() {
		return dao.findAll();
	}

	@Override
	public Consulta listarId(int idConsulta) {
		return dao.findOne(idConsulta);
	}

}
