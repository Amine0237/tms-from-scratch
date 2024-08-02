package com.workshop.tms_fs_withoutjwt.service.mapper;

import com.workshop.tms_fs_withoutjwt.domain.Project;
import com.workshop.tms_fs_withoutjwt.domain.Task;
import com.workshop.tms_fs_withoutjwt.domain.UserApp;
import com.workshop.tms_fs_withoutjwt.repository.ProjectRepository;
import com.workshop.tms_fs_withoutjwt.repository.UserAppRepository;
import com.workshop.tms_fs_withoutjwt.service.DTO.TaskDTO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class TaskMapper {

    private final UserAppRepository userAppRepository;
    private final ProjectRepository projectRepository;
    public Task toEntity(TaskDTO taskDTO) {
        Task task = new Task();
        task.setId(taskDTO.getId());
        task.setTitle(taskDTO.getTitle());
        task.setDescription(taskDTO.getDescription());
        task.setStatus(taskDTO.getStatus());
        task.setCreatedDate(taskDTO.getCreatedDate());
        task.setDueDate(taskDTO.getDueDate());

        Optional<UserApp> userApp = userAppRepository.findById(taskDTO.getUserId());
        userApp.ifPresent(task::setUser);

        Optional<Project> project = projectRepository.findById(taskDTO.getProjectId());
        project.ifPresent(task::setProject);

        return task;
    }
}
