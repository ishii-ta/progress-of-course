package org.example.training.service;

import org.example.training.model.Training;
import java.util.List;

public interface TrainingService {

    List<Training> getActiveTrainings();

    List<Training> searchByName(String name);

    List<Training> upcomingSpring(String name);
}