package com.caseGenerator.CaseNumberGenerator.Service;

import com.caseGenerator.CaseNumberGenerator.Dto.CaseMetaDataDTO;
import com.caseGenerator.CaseNumberGenerator.Entity.CaseData;
import com.caseGenerator.CaseNumberGenerator.Entity.CaseSequence;
import com.caseGenerator.CaseNumberGenerator.Payload.CaseCreateRequestPayload;
import com.caseGenerator.CaseNumberGenerator.Repository.CaseDataRepository;
import com.caseGenerator.CaseNumberGenerator.Repository.CaseSequenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.List;

@Service
public class CaseDataService {
    @Autowired
    CaseSequenceRepository caseSequenceRepository;

    @Autowired
    CaseDataRepository caseDataRepository;

    //get sequence number - 1000
    //get branch code - UG
    // concatenate - UG-10001
    // Increment the number by 1000 + 1 in Case
    String caseKey = "Case_Number";
    public CaseMetaDataDTO createCase(CaseCreateRequestPayload createRequest) throws Exception {

        CaseSequence caseCounterKey = this.caseSequenceRepository.findByCaseKeyAndBranchCode(caseKey, createRequest.getBranchCode());

        int count = caseCounterKey.getSequenceNumber();
        caseCounterKey.setSequenceNumber(++count);

        String caseNumber = createRequest.getBranchCode() + "-" + count;

        CaseData caseData = new CaseData();
        caseData.setCaseNumber(caseNumber);
//        caseData.setCreatedDtm(ZonedDateTime.parse("25-01-2025"));

        CaseData caseEntry = this.caseDataRepository.save(caseData);


        CaseMetaDataDTO caseMetaDataDTO =  new CaseMetaDataDTO();

        return caseMetaDataDTO;

    }
}

