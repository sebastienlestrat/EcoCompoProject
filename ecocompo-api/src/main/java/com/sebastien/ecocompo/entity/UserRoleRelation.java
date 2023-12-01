package com.sebastien.ecocompo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class UserRoleRelation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_role")
    private Role role;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;
}
