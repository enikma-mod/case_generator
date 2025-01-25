package com.caseGenerator.CaseNumberGenerator.Controller;

import com.caseGenerator.CaseNumberGenerator.Dto.CaseMetaDataDTO;
import com.caseGenerator.CaseNumberGenerator.Entity.CaseSequence;
import com.caseGenerator.CaseNumberGenerator.Payload.CaseCreateRequestPayload;
import com.caseGenerator.CaseNumberGenerator.Repository.CaseDataRepository;
import com.caseGenerator.CaseNumberGenerator.Repository.CaseSequenceRepository;
import com.caseGenerator.CaseNumberGenerator.Service.CaseDataService;
import com.caseGenerator.CaseNumberGenerator.Service.CaseSequenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CaseDataController {

    @Autowired
    CaseSequenceService caseSequenceService;

    @Autowired
    CaseSequenceRepository caseSequenceRepository;

    @Autowired
    CaseDataRepository caseDataRepository;

    @Autowired
    CaseDataService caseDataService;

    @PostMapping("/getCaseNumber/Create")
    public Object createCaseNumber (@RequestBody CaseCreateRequestPayload createRequet) throws Exception {
        return this.caseDataService.createCase(createRequet);
    }



}
