package com.workshop.tms_fs_withoutjwt.web;

import com.workshop.tms_fs_withoutjwt.domain.Task;
import com.workshop.tms_fs_withoutjwt.service.DTO.TaskDTO;
import com.workshop.tms_fs_withoutjwt.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping
    public List<Task> getAllTasks() {
        return taskService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Task> getTaskById(@PathVariable Long id) {
        return taskService.findById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Task createTask(@RequestBody TaskDTO taskDTO) {
        return taskService.save(taskDTO);
    }

    //nothing that special

    @PutMapping("/{id}")
    public ResponseEntity<Task> updateTask(@PathVariable Long id, @RequestBody TaskDTO taskDTO) {
        if (!taskService.findById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        taskDTO.setId(id);
        return ResponseEntity.ok(taskService.save(taskDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTask(@PathVariable Long id) {
        taskService.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
