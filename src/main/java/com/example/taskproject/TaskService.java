package com.example.taskproject;

import com.example.taskproject.entity.Taskdata;
import com.example.taskproject.repository.TaskRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Taskdata> getReports() {
        return taskRepository.findAll();
    }

    public String getlogs() {
        return "[SERVICE LAYER RESPONSE] BANKING-SYSTEM-FETCH-SUCCESS";
    }
}