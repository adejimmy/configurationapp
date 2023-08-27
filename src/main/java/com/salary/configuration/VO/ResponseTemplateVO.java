package com.salary.configuration.VO;

import com.salary.configuration.domain.SalaryStructure;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {

        private SalaryStructure structure;
        private Services services;

}
