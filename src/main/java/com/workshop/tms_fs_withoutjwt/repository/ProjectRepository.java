package com.workshop.tms_fs_withoutjwt.repository;

import com.workshop.tms_fs_withoutjwt.domain.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
