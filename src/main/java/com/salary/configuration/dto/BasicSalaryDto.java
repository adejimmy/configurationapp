package com.salary.configuration.dto;

import com.salary.configuration.domain.Grade;
import com.salary.configuration.domain.SalaryStructure;

import javax.persistence.*;

public class BasicSalaryDto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String salaryScaleId;
    @ManyToOne
    @JoinColumn(name = "_salary_structures_id")
    private SalaryStructure salarysStructureId;
    @ManyToOne
    @JoinColumn(name = "_salary_structures_id")
    private Grade gradeId;
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
