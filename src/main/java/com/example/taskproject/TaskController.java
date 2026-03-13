package com.example.taskproject;

import com.example.taskproject.entity.Taskdata;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/reports")
    public List<Taskdata> getReports() {
        return taskService.getReports();
    }

    @GetMapping("/logs")
    public String getlogs() {
        return taskService.getlogs();
    }
}