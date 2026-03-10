
package com.example.taskproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TaskController {

    // 1. Declare the Service as 'final' for best practice security
    private final TaskService taskService;

    // 2. The Constructor: This tells Spring to find the TaskService and plug it in here
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/reports")
    public String getReports() {
        // 3. Ask the service for the transaction details
        return taskService.getReports();
    }

    @GetMapping("/logs")
    public String getlogs() {
        // 4. Ask the service for the login details
        return taskService.getlogs();
    }
}