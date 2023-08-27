package com.salary.configuration.repositories;

import com.salary.configuration.domain.SalaryStructure;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SalaryStructureRepository extends JpaRepository<SalaryStructure, Long> {
    List<SalaryStructure> findAllByServiceId(String organisationId);
    SalaryStructure findByServiceId(String organisationIdd);
}
