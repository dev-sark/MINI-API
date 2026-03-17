package com.example.taskproject;
import java.util.Scanner;

import com.example.taskproject.entity.Taskdata;
import com.example.taskproject.repository.TaskRepository;
import org.springframework.scheduling.config.Task;
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
    public List<Taskdata> getTasks() {
        return taskRepository.findFirst5By();
    }

    public List<Taskdata> greaterthan (Double Amount)
    {
        return taskRepository.findByLoanAmountGreaterThanEqual(30000.00);
    }

    public String getlogs() {
        return "[SERVICE LAYER RESPONSE] BANKING-SYSTEM-FETCH-SUCCESS";
    }
    public String addlogs()
    {
        if(taskRepository.count() >=10)
        {
           return "There are more records boss ";
        }
        else
        {
            return"[SERVICE LAYER RESPONSE] TASK FOUND";
        }


       // return "logs added";
    }
}
