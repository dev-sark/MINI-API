package com.example.taskproject;

import com.example.taskproject.entity.Taskdata;
import com.example.taskproject.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Taskdata> getaccounts() {
        return taskRepository.findAll();
    }
    public List<Taskdata> getfirstfivedata()
    {
        return taskRepository.findFirst5By();
    }

    public List<Taskdata> greaterthan (Double Amount)
    {
        return taskRepository.findByLoanAmountGreaterThanEqual(30000.00);
    }

    public String getlogs()
    {
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

    }

    public String pearl()
    {
        return "Only show it to pearl ";
    }
    public List<String> getaccountstatus() {
        // 1. Fetch every customer from the database
        List<Taskdata> allCustomers = taskRepository.findAll();

        // 2. Create a list to hold the names and their new labels
        List<String> statusList = new ArrayList<>();

        // 3. Loop through every customer and apply the "Express" rule
        for (Taskdata customer : allCustomers) {

            String label;

            // This is your core logic
            if (customer.getValue() != null && customer.getValue() >= 50000) {
                label = "Express";
            } else {
                label = "Standard";
            }

            // 4. Add the formatted result to our list
            statusList.add(customer.getTaskName() + " Status: " + label);
        }

        return statusList;
    }
}



