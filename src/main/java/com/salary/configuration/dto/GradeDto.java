package com.salary.configuration.dto;

import com.salary.configuration.domain.SalaryStructure;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GradeDto {

    private Long id;
    private String grade;
    private SalaryStructure salarysStructureId;
    private String taxable;
    private String pensionable;
    private String serviceId;
    private String mark_delete;
    private String createdAt;
    private String createdBy;
    private String updated_at;
    private Timestamp updatedBy;
}
