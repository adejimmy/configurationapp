package com.salary.configuration.payload.request;

import com.salary.configuration.domain.BasicSalaryStructure;
import com.salary.configuration.domain.Grade;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;
import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SalaryStructureRequestModel {

    private String salaryStructure;
    private String serviceId;
    private Short  noStepSalaryStructure;
    //private String createdBy;
}
