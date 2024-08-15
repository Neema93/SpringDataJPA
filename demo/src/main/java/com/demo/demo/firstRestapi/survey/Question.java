package com.demo.demo.firstRestapi.survey;

import java.util.List;

public class Question {
    
    public Question() {
    }
    public Question(String id, String description, List<String> option, String correctAnswer) {
        this.id = id;
        this.description = description;
        this.option = option;
        this.correctAnswer = correctAnswer;
    }
    private String id;
    private String description;
    private List<String> option;
    private String correctAnswer;
    public String getId() {
        return id;
    }
    public String getDescription() {
        return description;
    }
    public List<String> getOption() {
        return option;
    }
    public String getCorrectAnswer() {
        return correctAnswer;
    }
   

    
  
    

}
