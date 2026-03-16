package org.example.training.service;

import org.example.training.model.Training;
import org.example.training.repository.TrainingRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class TrainingServiceImpl implements TrainingService {

    private final TrainingRepository repo;

    public TrainingServiceImpl(TrainingRepository repo){
        this.repo = repo;
    }

    public List<Training> getActiveTrainings(){
        return repo.findByEndDateAfter(LocalDate.now());
    }

    public List<Training> searchByName(String name){
        return repo.findByTopicContainingIgnoreCase(name);
    }

    public List<Training> upcomingSpring(String name){
        return repo.findByTopicContainingIgnoreCaseAndStartDateAfter(name,LocalDate.now());
    }
}
