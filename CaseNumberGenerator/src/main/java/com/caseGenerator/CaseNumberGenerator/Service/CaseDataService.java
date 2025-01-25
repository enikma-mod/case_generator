package com.caseGenerator.CaseNumberGenerator.Service;

import com.caseGenerator.CaseNumberGenerator.Dto.CaseMetaDataDTO;
import com.caseGenerator.CaseNumberGenerator.Repository.CaseDataRepository;
import com.caseGenerator.CaseNumberGenerator.Repository.CaseSequenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    public String saveCaseNumber(CaseMetaDataDTO dto) {
        CaseSequenceRepository metaData = (CaseSequenceRepository) caseSequenceRepository.findByBranchCodeAndSequenceNumber(dto.getBranchCode(), dto.getSequenceNumber());
        return (dto.getBranchCode() + "-" + dto.getSequenceNumber());
    }
}


//        try {
//            if (metaData != null) {
////                metaData.save()
//            }
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
