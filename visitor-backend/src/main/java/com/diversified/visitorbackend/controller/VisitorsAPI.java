package com.diversified.visitorbackend.controller;

import com.diversified.visitorbackend.model.Visitor;
import com.diversified.visitorbackend.service.VisitorService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.beans.Visibility;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/visitors")
@AllArgsConstructor
public class VisitorsAPI {

	private final VisitorService visitorService;

	@GetMapping
	public List<Visitor> getAll() {
		return this.visitorService.getAll();
	}

	@GetMapping("/{id}")
	public Optional<Visitor> get(@PathVariable(value="id") Integer id) {
		return this.visitorService.getVisitor(id);
	}

	@PostMapping(consumes = "application/json")
	public Visitor save(@RequestBody Visitor visitor) {
		return this.visitorService.save(visitor);
	}

	@PutMapping
	public Visitor update(Visitor visitor) {
		return this.visitorService.save(visitor);
	}

	@DeleteMapping
	public void delete(Integer id) {
		this.visitorService.delete(id);
	}

}
