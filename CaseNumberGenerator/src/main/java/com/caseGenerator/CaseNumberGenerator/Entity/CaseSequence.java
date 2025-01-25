package com.caseGenerator.CaseNumberGenerator.Entity;

import jakarta.persistence.*;


@Entity
@Table(name="case_sequence", schema="public")
public class CaseSequence {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(name="branch_code")
    private String branchCode;

    @Column(name = "sequence_number")
    private Integer sequenceNumber;

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
}
