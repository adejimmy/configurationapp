package com.salary.configuration.controller;

import com.salary.configuration.domain.SalaryStructure;
import com.salary.configuration.payload.request.BasicSalaryRequestModel;
import com.salary.configuration.payload.request.SalaryStructureRequestModel;
import com.salary.configuration.payload.response.MessageResponse;
import com.salary.configuration.repositories.SalaryStructureRepository;
import com.salary.configuration.services.SalaryStructureService;
import com.salary.configuration.utilities.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.modelmapper.ModelMapper;
import javax.validation.Valid;
import java.security.Principal;
import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/salarystructure")
public class SalaryStructureController {
    @Autowired
    Utils util;
    @Autowired
    SalaryStructureRepository salaryStructureRepository;
    @Autowired
    SalaryStructureService salaryStructureService;


    @PostMapping("/addstructure")
    public ResponseEntity<?> registerSalaryStructure(@Valid @RequestBody SalaryStructureRequestModel signUpRequest) {

        String publicUserId = util.generateId(30);

        String userId = util.generateId(30);
        String logourl="";
        Integer country_id =100;
        Integer state_id=10;

        Integer group_id=100;
        String password="1234567";
        Short is_holdingcompany=1;




        SalaryStructure salarystructure = new SalaryStructure(
                publicUserId,
                signUpRequest.getSalaryStructure(),
                signUpRequest.getNoStepSalaryStructure(),
                signUpRequest.getServiceId()
                );





        salaryStructureRepository.save(salarystructure);

        return ResponseEntity.ok(new MessageResponse("Structure registered successfully!"));

    }


    @GetMapping
   // @PostAuthorize("(returnObject.size() > 0) ? principal == returnObject[0].organizationId : true")
    public List<SalaryStructureRequestModel> getSalaryStructures(Principal principal) {
        return salaryStructureService.getSalaryStructures(principal.getName());
    }

    @GetMapping("/id/{organizationId}")
    public SalaryStructure findSalStructureById(@PathVariable("organizationId") String organizationId) {
//        log.info("Inside findDepartmentById method of DepartmentController");
        return salaryStructureService.findSalaryStructureById(organizationId);
    }

}
