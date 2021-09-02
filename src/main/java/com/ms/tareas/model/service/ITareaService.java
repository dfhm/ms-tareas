package com.ms.tareas.model.service;

import java.util.List;

import com.ms.tareas.model.entity.Tarea;

public interface ITareaService {
	public List<Tarea> findAll();

	public Tarea findById(Long id);

	public Tarea add(Tarea tarea);
	
	public void delete(Long id);
	
	public Tarea modificar(Tarea tarea);
}
