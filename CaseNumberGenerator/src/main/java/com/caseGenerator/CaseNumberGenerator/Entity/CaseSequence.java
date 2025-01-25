package com.caseGenerator.CaseNumberGenerator.Entity;

import jakarta.persistence.*;


@Entity
@Table(name="case_sequence", schema="public")
public class CaseSequence {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="id", nullable = false)
    private Long id;

    @Column(name="branch_code")
    private String branchCode;

    @Column(name = "sequence_number")
    private Integer sequenceNumber;

    @Column(name = "case_key", length = 50)
    private String caseKey;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public Integer getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(Integer sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    public String getCaseKey() {
        return caseKey;
    }

    public void setCaseKey(String caseKey) {
        this.caseKey = caseKey;
    }
}
