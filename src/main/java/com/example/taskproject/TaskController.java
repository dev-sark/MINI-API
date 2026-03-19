package com.example.taskproject;

import com.example.taskproject.entity.Taskdata;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@CrossOrigin(origins = "http://localhost:5173") // Only allow your React app
@RestController
@RequestMapping("/api")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/accounts")
    public List<Taskdata> getaccounts() {
        return taskService.getaccounts();
    }

    @GetMapping("/logs")
    public String getlogs() {
        return taskService.getlogs();
    }
    @GetMapping("/addlogs")
    public String addlogs()
    {
        return taskService.addlogs();
    }
    @GetMapping ("/first5")
    public List<Taskdata> getFirst5()
    {
        return taskService.getfirstfivedata();
    }
    @GetMapping ("/greaterthan")
    public List<Taskdata> findByLoanAmountGreaterThanEqual()
    {
        return taskService.greaterthan(30000.00);
    }
    @GetMapping("/pearl")
    public String pearl()
    {
        return taskService.pearl();
    }
    @GetMapping ("/status")
    //@GetMapping("/check-status")
    public List<String> fetchStatuses() {
        // Calls your service method and returns the list of labels
        return taskService.getaccountstatus();
    }
}