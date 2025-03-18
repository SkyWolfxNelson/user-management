package com.management.user_system.entity.primary;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Data
@Table(name = "MANT_DEPARTMENT")
public class Department {
    @Id
    private Long departmentId;
    private String name;
    private String description;

    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
    private Set<Job> jobs;

    private Character active;
}
