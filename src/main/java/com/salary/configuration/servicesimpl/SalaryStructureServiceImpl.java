package com.salary.configuration.servicesimpl;

import org.modelmapper.TypeToken;
import com.salary.configuration.domain.SalaryStructure;
import com.salary.configuration.payload.request.SalaryStructureRequestModel;
import com.salary.configuration.repositories.SalaryStructureRepository;
import com.salary.configuration.services.SalaryStructureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.modelmapper.ModelMapper;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

@Service
public class SalaryStructureServiceImpl implements SalaryStructureService {

    @Autowired
    SalaryStructureRepository structureRepository;

    @Override
    public List<SalaryStructureRequestModel> getSalaryStructures(String organizationId) {

        List<SalaryStructure> salaryStructure = (List<SalaryStructure>) structureRepository.findAllByServiceId(organizationId);

        if (salaryStructure == null || salaryStructure.isEmpty())
            return new ArrayList<>();

        Type listType = new TypeToken<List<SalaryStructureRequestModel>>() {
        }.getType();

        return new ModelMapper().map(salaryStructure, listType);
    }

    public SalaryStructure findSalaryStructureById(String organizationId) {

        return structureRepository.findByServiceId(organizationId);
    }
}
