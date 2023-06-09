package com.example.tasklist.domain.user;

import com.example.tasklist.domain.task.Task;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.List;
import java.util.Set;

@Data
public class User {

    private Long id;

    private String name;

    private String username;

    private String password;

    private String passwordConfirmation;

    private Set<Role> roles;

    private List<Task> tasks;
}
