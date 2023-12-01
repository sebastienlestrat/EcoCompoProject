package com.sebastien.ecocompo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class ComposterDecompositionRelation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_decompositionprocess")
    private DecompositionProcess decompositionProcess;

    @ManyToOne
    @JoinColumn(name = "id_composter")
    private Composter composter;
}
