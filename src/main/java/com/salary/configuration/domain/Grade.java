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
@Table(name="_salary_grades")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Grade implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull
    private String grade;
    @ManyToOne
    @JoinColumn(name = "_salary_structures_id")
    private SalaryStructure salarysStructureId;
    @OneToMany(mappedBy = "grades", cascade = CascadeType.ALL)
    private List<BasicSalaryStructure> basicSalaryStructure;
    private String taxable;
    private String pensionable;
    private String serviceId;
    private String mark_delete;
    private String createdAt;
    private String createdBy;
    private String updated_at;
    private Timestamp updatedBy;



}
