package com.ms.tareas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ms.tareas.model.entity.Tarea;
import com.ms.tareas.model.service.ITareaService;

@RestController
public class TareaController {

	@Autowired
	private ITareaService tareaService;

	@GetMapping("/listar")
	public List<Tarea> listarTareas() {
		return tareaService.findAll();
	}

	@GetMapping("/tarea/{id}")
	public Tarea getTarea(@PathVariable Long id) {
		return tareaService.findById(id);
	}

	@PostMapping("/agregar")
	public Tarea addTarea(@RequestBody Tarea tarea) {
		return tareaService.add(tarea);
	}

	@DeleteMapping("/eliminar/{id}")
	public void deleteTarea(@PathVariable Long id) {
		tareaService.delete(id);
	}

	@PutMapping("/modificar")
	public Tarea editTarea(@RequestBody Tarea tarea) {
		return tareaService.modificar(tarea);
	}

}
