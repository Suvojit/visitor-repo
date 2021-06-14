package com.diversified.visitorbackend.service;

import com.diversified.visitorbackend.model.Visitor;
import com.diversified.visitorbackend.repository.VisitorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class VisitorService {

  private final VisitorRepository visitorRepository;

  public List<Visitor> getAll() {
    return this.visitorRepository.findAll();
  }

  public Optional<Visitor> getVisitor(Integer id) {
    return this.visitorRepository.findById(id);
  }

  public Visitor save(Visitor visitor) {
    return this.visitorRepository.save(visitor);
  }

  public Visitor update(Visitor visitor) {
    return this.getVisitor(visitor.getId())
      .map(presentVisitor -> this.visitorRepository.save(visitor))
      .orElseThrow(() -> {
        throw new IndexOutOfBoundsException();
      });
  }

  public void delete(Integer id) {
    this.getVisitor(id)
      .map(Visitor::getId)
      .ifPresentOrElse(
        this.visitorRepository::deleteById,
        () -> {
          throw new IndexOutOfBoundsException(); // TODO: Needs to change to actual exception
        }
      );
  }
}
