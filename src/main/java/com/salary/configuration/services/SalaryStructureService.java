package com.salary.configuration.services;

import com.salary.configuration.domain.SalaryStructure;
import com.salary.configuration.payload.request.SalaryStructureRequestModel;

import java.util.List;

public interface SalaryStructureService {

        List<SalaryStructureRequestModel> getSalaryStructures(String organizationId);

        SalaryStructure findSalaryStructureById(String organizationId);

}
