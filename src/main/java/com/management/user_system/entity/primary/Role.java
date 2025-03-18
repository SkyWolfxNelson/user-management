package com.management.user_system.entity.primary;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Data
@Table(name = "MANT_ROLE")
public class Role {
    @Id
    private Long roleId;
    private String name;
    private String code;
    private String description;

    @OneToMany(mappedBy = "role", cascade = CascadeType.ALL)
    private Set<RoleUser> users;

    private Character active;
}
