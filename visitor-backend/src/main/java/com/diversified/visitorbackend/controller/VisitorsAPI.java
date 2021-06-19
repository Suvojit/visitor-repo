package com.diversified.visitorbackend.controller;

import com.diversified.visitorbackend.model.Visitor;
import com.diversified.visitorbackend.service.VisitorService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/visitors")
@AllArgsConstructor
public class VisitorsAPI {

	private final VisitorService visitorService;

	@GetMapping
	public List<Visitor> getAll() {
		return this.visitorService.getAll();
	}

	@GetMapping("/{id}")
	public Optional<Visitor> get(@PathVariable("id") Integer id) {
		return this.visitorService.getVisitor(id);
	}

	@PostMapping(consumes = "application/json")
	public Visitor save(@RequestBody Visitor visitor) {
		return this.visitorService.save(visitor);
	}

	@PutMapping
	public Visitor update(@RequestBody Visitor visitor) {
		return this.visitorService.update(visitor);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Integer id) {
		this.visitorService.delete(id);
	}

}
