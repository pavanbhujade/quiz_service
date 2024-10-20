package com.quiz.controller;

import com.quiz.entities.Quiz;
import com.quiz.services.QuizService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuizController {

    private QuizService quizService;

    public QuizController(QuizService quizService) {
        this.quizService = quizService;
    }

    //Create
    @PostMapping()
    public Quiz create(@RequestBody Quiz quiz) {

        return quizService.add(quiz);
    }

    //getAll
    @GetMapping
    public List<Quiz> getAll(){
        return quizService.get();
    }

    //Get by id
    @GetMapping("/{id}")
    public Quiz getById(@PathVariable Long id){
        return quizService.get(id);
    }

}
