package com.management.user_system.entity.primary;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter @Setter
@Table(name = "MANT_USER")
public class User {
    @Id
    private Long userId;
    private String username;
    private String name;
    private String lastname;
    private String email;
    private Integer age;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private Set<RoleUser> roles;
    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private Contract contract;

    private Character active;

}
