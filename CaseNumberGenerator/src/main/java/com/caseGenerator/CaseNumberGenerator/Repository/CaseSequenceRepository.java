package com.caseGenerator.CaseNumberGenerator.Repository;


import com.caseGenerator.CaseNumberGenerator.Entity.CaseSequence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CaseSequenceRepository extends JpaRepository<CaseSequence, Integer> {
    CaseSequence findByBranchCodeAndSequenceNumber(String branchCode, Integer sequenceNumber);

    CaseSequence findByCaseKeyAndBranchCode(String caseKey, String branchCode);
}
