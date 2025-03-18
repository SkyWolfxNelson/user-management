package com.management.user_system.entity.primary;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Data
@Table(name = "MANT_JOB")
public class Job {
    @Id
    private Long jobId;
    private String name;
    private String description;
    private Float minSalary;

    @ManyToOne
    @JoinColumn(name = "department_id", nullable = false)
    private Department department;

    @OneToMany(mappedBy = "job", cascade = CascadeType.ALL)
    private Set<Contract> contract;

    private Character active;
}
