package com.jakecode.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jakecode.model.Consulta;

public interface IConsultaDAO  extends JpaRepository<Consulta, Integer>{

}
