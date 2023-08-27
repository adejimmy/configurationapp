package com.salary.configuration.repositories;

import com.salary.configuration.domain.BasicSalaryStructure;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BasicSalaryRepository extends JpaRepository<BasicSalaryStructure, Long> {
}
