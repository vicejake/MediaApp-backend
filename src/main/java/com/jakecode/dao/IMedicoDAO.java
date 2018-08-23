package com.jakecode.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jakecode.model.Medico;

public interface IMedicoDAO extends JpaRepository<Medico, Integer> {

}
