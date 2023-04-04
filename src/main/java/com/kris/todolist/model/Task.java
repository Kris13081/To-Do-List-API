package com.kris.todolist.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private CompletionStatus completionStatus;


    public Task(Long id, String name, String description, CompletionStatus completionStatus) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.completionStatus = completionStatus;
    }

    public Task(String name, String description, CompletionStatus completionStatus) {
        this.name = name;
        this.description = description;
        this.completionStatus = completionStatus;
    }

    public Task() {

    }
}
