package com.example.taskproject.repository;

import com.example.taskproject.entity.Taskdata;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Taskdata, Long> {
    List<Taskdata> findFirst5By();
    // Spring Data handles the SQL generation automatically
    List<Taskdata> findByLoanAmountGreaterThanEqual (Double Amount);
    List<Taskdata> findByValue(Double Value);



}