package com.ms.tareas.model.dao;

import org.springframework.data.repository.CrudRepository;

import com.ms.tareas.model.entity.Tarea;

public interface TareaDao extends CrudRepository<Tarea, Long> {

}
