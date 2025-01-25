package com.caseGenerator.CaseNumberGenerator.Entity;

import jakarta.persistence.*;

import java.time.ZonedDateTime;

@Entity
@Table (name = "case_data", schema = "public")
public class CaseData {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="id", nullable = false)
    public Long id;

    @Column(name = "case_number", length = 3)
    public String caseNumber;

    @Column(name = "created_dtm")
    public ZonedDateTime createdDtm;


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

    public ZonedDateTime getCreatedDtm() {
        return createdDtm;
    }

    public void setCreatedDtm(ZonedDateTime createdDtm) {
        this.createdDtm = createdDtm;
    }

    public CaseData() {
    }
}



