package com.caseGenerator.CaseNumberGenerator.Payload;

public class CaseCreateRequestPayload {
    private String branchCode;
    private Integer sequenceNumber;

    public CaseCreateRequestPayload() {
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
