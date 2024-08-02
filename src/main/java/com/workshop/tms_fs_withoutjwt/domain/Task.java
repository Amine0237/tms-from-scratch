package com.workshop.tms_fs_withoutjwt.domain;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    private String description;

    @Enumerated(EnumType.STRING)
    private Status status;

    private LocalDateTime createdDate;

    private LocalDateTime dueDate;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserApp user;

    @ManyToOne
    @JoinColumn(name = "project_id")
    private Project project;
    public enum Status {
        PENDING,
        IN_PROGRESS,
        COMPLETED,
    }
}
