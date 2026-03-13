package com.example.taskproject.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable // This tells Spring it's a View (Read-only)
@Table(name = "all_in_one_banking_view")
public class Taskdata {

    @Id
    @Column(name = "customer_id")
    private Long id;

    @Column(name = "customer_name")
    private String taskName;

    @Column(name = "account_type")
    private String description;

    @Column(name = "balance")
    private Double value;

    // Fields to match the rest of the view
    private String email;
    private Double loanAmount;

    public Taskdata() {}

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getTaskName() { return taskName; }
    public void setTaskName(String taskName) { this.taskName = taskName; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public Double getValue() { return value; }
    public void setValue(Double value) { this.value = value; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public Double getLoanAmount() { return loanAmount; }
    public void setLoanAmount(Double loanAmount) { this.loanAmount = loanAmount; }
}