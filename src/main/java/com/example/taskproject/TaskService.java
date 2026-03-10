package com.example.taskproject;

import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
@Service
public class TaskService
{
    @GetMapping("/reports")
    public String getReports()
    {
        return "[SERVICE LAYER RESPONSE] MADE A TRANSACTION WITH TRANSACTION ID TR43484";
    }

    @GetMapping("/logs")
    public String getlogs()
    {
        return"[SERVICE LAYER RESPONSE] AUTH-7:35-LOGIN";
    }


}
