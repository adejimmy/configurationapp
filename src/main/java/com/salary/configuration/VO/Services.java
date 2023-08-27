package com.salary.configuration.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Services {

    private String organizationId;
    private String organization_name;
    private String code;
    private String organization_address;
    private String organization_phone;
    private String email;
    private String contactPerson;
}