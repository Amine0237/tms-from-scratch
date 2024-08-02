package com.workshop.tms_fs_withoutjwt.service;



import java.util.List;
import java.util.Optional;

import com.workshop.tms_fs_withoutjwt.domain.Project;
import com.workshop.tms_fs_withoutjwt.repository.ProjectRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProjectService {

    private ProjectRepository projectRepository;
    public List<Project> findAll() {
        return projectRepository.findAll();
    }

    public Optional<Project> findById(Long id) {
        return projectRepository.findById(id);
    }

    public Project save(Project project) {
        return projectRepository.save(project);
    }

    public void deleteById(Long id) {
        projectRepository.deleteById(id);
    }
}

