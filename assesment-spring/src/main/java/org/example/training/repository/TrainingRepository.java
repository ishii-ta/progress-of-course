package org.example.training.repository;

import org.example.training.model.Training;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface TrainingRepository extends JpaRepository<Training,Integer> {

    List<Training> findByEndDateAfter(LocalDate date);

    List<Training> findByTopicContainingIgnoreCase(String name);

    List<Training> findByTopicContainingIgnoreCaseAndStartDateAfter(String name, LocalDate date);
}