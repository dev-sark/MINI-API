package com.example.taskproject.repository;

import com.example.taskproject.entity.Taskdata;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Taskdata, Long> {
    // Spring Data handles the SQL generation automatically
}