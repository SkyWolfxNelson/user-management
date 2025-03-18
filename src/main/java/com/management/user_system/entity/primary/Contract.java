package com.management.user_system.entity.primary;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "TRS_CONTRACT")
public class Contract {
    @Id
    private Long serviceContractId;

    private LocalDate hireDate;
    private LocalDate contractEndDate;
    private Float salary;

    @ManyToOne
    @JoinColumn(name = "job_id", nullable = false)
    private Job job;

    @OneToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    private Character active;

}
