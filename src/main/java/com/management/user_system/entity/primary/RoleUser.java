package com.management.user_system.entity.primary;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name= "TRS_ROLE_USER")
public class RoleUser {
    @Id
    private Long roleUserId;

    @ManyToOne
    @JoinColumn(name = "role_id", nullable = false)
    private Role role;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    private LocalDate assignedDate;

    private Character active;
}
