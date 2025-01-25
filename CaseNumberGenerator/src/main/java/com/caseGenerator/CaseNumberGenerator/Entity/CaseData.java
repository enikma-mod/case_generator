package com.caseGenerator.CaseNumberGenerator.Entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table (name = "case_data", schema = "public")
public class CaseData {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(name = "case_number", length = 3)
    public String caseNumber;

    @Column(name = "created_dtm")
    public LocalDateTime createdDtm;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCaseNumber() {
        return caseNumber;
    }

    public void setCaseNumber(String caseNumber) {
        this.caseNumber = caseNumber;
    }

    public LocalDateTime getCreatedDtm() {
        return createdDtm;
    }

    public void setCreatedDtm(LocalDateTime createdDtm) {
        this.createdDtm = createdDtm;
    }

    public CaseData() {
    }
}



