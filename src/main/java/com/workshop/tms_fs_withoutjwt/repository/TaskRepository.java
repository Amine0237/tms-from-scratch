package com.workshop.tms_fs_withoutjwt.repository;

import com.workshop.tms_fs_withoutjwt.domain.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
