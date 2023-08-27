package com.salary.configuration.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Timestamp;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StepDto implements Serializable {

    private Long id;
    private String salaryStepId;
    private String salaryStep;
    private String registeredBy;
    private Timestamp registered_on;
}
