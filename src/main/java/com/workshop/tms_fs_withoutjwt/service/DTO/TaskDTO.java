package com.workshop.tms_fs_withoutjwt.service.DTO;

import com.workshop.tms_fs_withoutjwt.domain.Task;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.*;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class TaskDTO {
    private Long id;
    private String title;
    private String description;
    @Enumerated(EnumType.STRING)
    private Task.Status status;
    private LocalDateTime createdDate;
    private LocalDateTime dueDate;
    private Long userId;
    private Long projectId;

}
