package com.jakecode.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jakecode.model.Paciente;

@Repository
public interface IPacienteDAO extends JpaRepository<Paciente, Integer> {

}
