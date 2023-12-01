package com.sebastien.ecocompo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class CompostBucket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String volume;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;

    @ManyToOne
    @JoinColumn(name = "id_composter")
    private Composter composter;
}
