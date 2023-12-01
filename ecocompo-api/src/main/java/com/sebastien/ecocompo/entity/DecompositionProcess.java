package com.sebastien.ecocompo.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
@Data
@Entity
public class DecompositionProcess {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date creationDate;
    @Enumerated(EnumType.STRING)
    private ProcessStatusEnum status;
}
