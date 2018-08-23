package com.jakecode.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jakecode.model.Examen;

public interface IExamenDAO extends JpaRepository<Examen, Integer> {

}
