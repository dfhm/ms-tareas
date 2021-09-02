package com.ms.tareas.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ms.tareas.model.dao.TareaDao;
import com.ms.tareas.model.entity.Tarea;

@Service
public class TareaServiceImpl implements ITareaService {

	@Autowired
	private TareaDao tareaDao;

	@Override
	@Transactional(readOnly = true)
	public List<Tarea> findAll() {
		return (List<Tarea>) tareaDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Tarea findById(Long id) {
		return tareaDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Tarea add(Tarea tarea) {
		return tareaDao.save(tarea);

	}

	@Override
	@Transactional
	public void delete(Long id) {
		tareaDao.deleteById(id);

	}

	@Override
	@Transactional
	public Tarea modificar(Tarea tarea) {
		return tareaDao.save(tarea);
	}

}
