package com.example.task.management.service.repository;

import com.example.task.management.service.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task,Long> {

    public List<Task> findByassignedUserId(Long userId);
}
