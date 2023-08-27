package com.salary.configuration.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name="_salary_steps")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Step implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String salaryStepId;
    private String salaryStep;
    private String registeredBy;
    private Timestamp registered_on;
}
