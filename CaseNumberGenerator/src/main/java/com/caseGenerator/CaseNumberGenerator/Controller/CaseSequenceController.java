package com.caseGenerator.CaseNumberGenerator.Controller;

import com.caseGenerator.CaseNumberGenerator.Entity.CaseSequence;
import com.caseGenerator.CaseNumberGenerator.Repository.CaseSequenceRepository;
import com.caseGenerator.CaseNumberGenerator.Service.CaseSequenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CaseSequenceController {

    @Autowired
    CaseSequenceService caseGeneratorService;

    @Autowired
    CaseSequenceRepository caseGeneratorRepository;

    @GetMapping("/searchCaseInfo/{branchCode}/{sequenceNumber}")
    public CaseSequence getSequenceDetails(@PathVariable("branchCode") String branchCode, @PathVariable("sequenceNumber") Integer sequenceNumber) {
        try {
            return caseGeneratorService.findBranchCodeAndSequenceNumber(branchCode, sequenceNumber);
        } catch (Exception e) {
            throw new RuntimeException(e + "Error retrieving Data");
        }
    }

    @GetMapping("/getAll")
    public List<CaseSequence>  findAllValues() {
        return caseGeneratorRepository.findAll();
    }
}
