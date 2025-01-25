package com.caseGenerator.CaseNumberGenerator.Service;

import com.caseGenerator.CaseNumberGenerator.Entity.CaseSequence;
import com.caseGenerator.CaseNumberGenerator.Repository.CaseSequenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CaseSequenceService {

    @Autowired
    CaseSequenceRepository caseSequenceRepository;

    public CaseSequence findBranchCodeAndSequenceNumber(String branchCode, Integer sequenceNumber) {
        return caseSequenceRepository.findByBranchCodeAndSequenceNumber(branchCode, sequenceNumber);
    }

    public CaseSequence saveCaseSequence(CaseSequence caseGenerator) {
        return caseSequenceRepository.save(caseGenerator);
    }

}
