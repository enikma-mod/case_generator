package com.caseGenerator.CaseNumberGenerator.Repository;

import com.caseGenerator.CaseNumberGenerator.Entity.CaseData;
import com.caseGenerator.CaseNumberGenerator.Entity.CaseSequence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CaseDataRepository extends JpaRepository<CaseData, Long> {
//    CaseSequence saveCaseData(CaseSequence userEntity);
}
