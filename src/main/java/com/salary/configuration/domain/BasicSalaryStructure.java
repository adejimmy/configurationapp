package com.salary.configuration.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="basic_salary_scale")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BasicSalaryStructure implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String salaryScaleId;
    @ManyToOne
    @JoinColumn(name = "_salary_structures_id")
    private SalaryStructure salaryStructureId;
    @ManyToOne
    @JoinColumn(name = "_salary_grades_id")
    private Grade grades;
    private Double basic1;
    private Double basic2;
    private Double basic3;
    private Double basic4;
    private Double basic5;
    private Double basic6;
    private Double basic7;
    private Double basic8;
    private Double basic9;
    private Double basic10;
    private Double basic11;
    private Double basic12;
    private Double basic13;
    private Double basic14;
    private Double basic15;
    private Double consolidated;
    private Double updatedBy;
    private Double updated_at;
    private Double serviceId;
    private Double createdBy;
    private Double created_at;
}
