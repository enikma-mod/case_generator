package com.caseGenerator.CaseNumberGenerator.Dto;

import jakarta.persistence.Column;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;

public class CaseMetaDataDTO {

    @Column (name = "case_number")
    private String caseNumber;

    @Column (name = "created_dtm")
    public ZonedDateTime createdDtm;

    public CaseMetaDataDTO() {
    }

    public CaseMetaDataDTO(String caseNumber, ZonedDateTime createdDtm) {
        this.caseNumber = caseNumber;
        this.createdDtm = createdDtm;
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
}
