package com.office.task_service.repository;

import com.office.task_service.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
    // Bisa ditambah custom query kalau perlu
}
