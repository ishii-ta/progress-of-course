package org.example.training.controller;

import org.example.training.model.Training;
import org.example.training.service.TrainingService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/trainings")
public class TrainingController {

    private final TrainingService service;

    public TrainingController(TrainingService service){
        this.service = service;
    }

    @GetMapping
    public List<Training> getTrainings(){
        return service.getActiveTrainings();
    }

    @GetMapping(params = "name")
    public List<Training> search(@RequestParam String name){
        return service.searchByName(name);
    }

    @GetMapping("/upcoming")
    public List<Training> upcoming(@RequestParam String name){
        return service.upcomingSpring(name);
    }
}