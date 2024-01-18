package com.cgi.pojos;

public class DocumentInfo {
	
	public DocumentInfo() {

    }

	public String customerId;	
	
    public void setCustomerId(String customerId) {
    	this.customerId = customerId;
    }	
	
    public String getCustomerId() {
    	return customerId;
    }	
	
	public String customerName;	
	
    public void setCustomerName(String customerName) {
    	this.customerName = customerName;
    }	
	
    public String getCustomerName() {
    	return customerName;
    }	
	
	public Integer amount;	
	
    public void setAmount(Integer amount) {
    	this.amount = amount;
    }
    
    public Integer getAmount() {
    	return amount;
    }	
	
	public String submitter;	
	
    public void setSubmitter(String submitter) {
    	this.submitter = submitter;
    }
    
    public String getSubmitter() {
    	return submitter;
    }	
    
    public String customerEmail;
    
    public void setCustomerEmail(String customerEmail) {
    	this.customerEmail = customerEmail;
    }
    
    public String getCustomerEmail() {
    	return customerEmail;
    }
	
	public String overrideFlag;	
	
    public void setOverrideFlag(String overrideFlag) {
    	this.overrideFlag = overrideFlag;
    }
    
    public String getOverrideFlag() {
    	return overrideFlag;
    }	
	
	public String workUnitIdentity;	
	
    public void setWorkUnitIdentity(String workUnitIdentity) {
    	this.workUnitIdentity = workUnitIdentity;
    }
    
    public String getWorkUnitIdentity() {
    	return workUnitIdentity;
    }	
	
	public String workUnitClass;	
	
    public void setWorkUnitClass(String workUnitClass) {
    	this.workUnitClass = workUnitClass;
    }
    
    public String getWorkUnitClass() {
    	return workUnitClass;
    }	
	
	public String shouldVerify;	
	
    public void setShouldVerify(String shouldVerify) {
    	this.shouldVerify = shouldVerify;
    }
    
    public String getShouldVerify() {
    	return shouldVerify;
    }	
	
	public String shouldProcess;	
	
    public void setShouldProcess(String shouldProcess) {
    	this.shouldProcess = shouldProcess;
    }
    
    public String getShouldProcess() {
    	return shouldProcess;
    }	
	
	public String shouldApprove;	
    
    public void setShouldApprove(String shouldApprove) {
    	this.shouldApprove = shouldApprove;
    }
    
    public String getShouldApprove() {
    	return shouldApprove;
    }	
	
	public String shouldAudit;	
    
    public void setShouldAudit(String shouldAudit) {
    	this.shouldAudit = shouldAudit;
    }
    
    public String getShouldAudit() {
    	return shouldAudit;
    }	
	
	public String shouldCorrect;
	   
    public void setShouldCorrect(String shouldCorrect) {
    	this.shouldCorrect = shouldCorrect;
    }
    
    public String getShouldCorrect() {
    	return shouldCorrect;
    }
    
	public int numberOfAssignments;
	   
    public void setNumberOfAssignments(int numberOfAssignments) {
    	this.numberOfAssignments = numberOfAssignments;
    }
    
    public int getNumberOfAssignments() {
    	return numberOfAssignments;
    }
        
    public ApprovalInfo approvalInfo;
        
    public void setApprovalInfo(ApprovalInfo approvalInfo) {
    	this.approvalInfo = approvalInfo;
    }
    
    public ApprovalInfo getApprovalInfo() {
    	return approvalInfo;
    }
}