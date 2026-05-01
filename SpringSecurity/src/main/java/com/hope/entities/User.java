package com.hope.entities;

import com.hope.enums.UserRoles;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String username;

    @Enumerated(EnumType.STRING)
    private UserRoles userRoles;

    private String password;
}
