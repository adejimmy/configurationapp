package com.salary.configuration.dto;

import com.salary.configuration.domain.Grade;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SalaryStructureDto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String salaryStructureId;
    private String salaryStructure;
    private String serviceId;
    private List<Grade> grade;
    private Short noStepSalaryStructure;
    private String createdBy;
    private String createdAt;
    private String mark_delete;
    private String updatedBy;
    private Timestamp updated_at;
}
