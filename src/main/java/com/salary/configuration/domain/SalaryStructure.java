package com.salary.configuration.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name="_salary_structures")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SalaryStructure implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String salaryStructureId;
    @Column(name="salary_structure")
    @NotNull
    private String salaryStructure;
    @OneToMany(mappedBy = "salarysStructureId", cascade = CascadeType.ALL)
    private List<Grade> grade;
    @OneToMany(mappedBy = "salaryStructureId", cascade = CascadeType.ALL)
    private List<BasicSalaryStructure> basicSalaryStructure;
    private String serviceId;
    private Short noStepSalaryStructure;
    private String createdBy;
    private String createdAt;
    private String mark_delete;
    private String updatedBy;
    private Timestamp updated_at;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSalaryStructureId() {
        return salaryStructureId;
    }

    public void setSalaryStructureId(String salaryStructureId) {
        this.salaryStructureId = salaryStructureId;
    }

    public String getSalaryStructure() {
        return salaryStructure;
    }

    public void setSalaryStructure(String salaryStructure) {
        this.salaryStructure = salaryStructure;
    }

    public List<Grade> getGrade() {
        return grade;
    }

    public void setGrade(List<Grade> grade) {
        this.grade = grade;
    }

    public List<BasicSalaryStructure> getBasicSalaryStructure() {
        return basicSalaryStructure;
    }

    public void setBasicSalaryStructure(List<BasicSalaryStructure> basicSalaryStructure) {
        this.basicSalaryStructure = basicSalaryStructure;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public Short getNoStepSalaryStructure() {
        return noStepSalaryStructure;
    }

    public void setNoStepSalaryStructure(Short noStepSalaryStructure) {
        this.noStepSalaryStructure = noStepSalaryStructure;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Timestamp getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Timestamp updated_at) {
        this.updated_at = updated_at;
    }

    public SalaryStructure(String salaryStructureId, String salaryStructure, Short noStepSalaryStructure, String serviceId) {
        this.salaryStructureId = salaryStructureId;
        this.salaryStructure = salaryStructure;
        this.noStepSalaryStructure = noStepSalaryStructure;
        this.serviceId = serviceId;
    }

    public SalaryStructure(String salaryStructureId, String salaryStructure) {
        this.salaryStructureId = salaryStructureId;
        this.salaryStructure = salaryStructure;
    }
}
