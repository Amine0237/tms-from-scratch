package com.workshop.tms_fs_withoutjwt.service;

import com.workshop.tms_fs_withoutjwt.domain.Task;
import com.workshop.tms_fs_withoutjwt.repository.ProjectRepository;
import com.workshop.tms_fs_withoutjwt.repository.TaskRepository;
import com.workshop.tms_fs_withoutjwt.repository.UserAppRepository;
import com.workshop.tms_fs_withoutjwt.service.DTO.TaskDTO;
import com.workshop.tms_fs_withoutjwt.service.mapper.TaskMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class TaskService {

    private final TaskRepository taskRepository;
    private final UserAppRepository userAppRepository;
    private final ProjectRepository projectRepository;
    private final TaskMapper taskMapper;
    public List<Task> findAll() {
        return taskRepository.findAll();
    }

    public Optional<Task> findById(Long id) {
        return taskRepository.findById(id);
    }

    public Task save(TaskDTO taskDTO) {
        return taskRepository.save(taskMapper.toEntity(taskDTO));
    }
    public void deleteById(Long id) {
        taskRepository.deleteById(id);
    }
}