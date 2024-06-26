package com.kartik.taskservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kartik.taskservice.model.Task;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task,Long> {

    public List<Task> findByassignedUserId(Long userId);
}
