package com.cgi.pojos;

public class ApprovalInfo {

	public ApprovalInfo() {

    }
	
    public ApprovalInfo(String approvalsRequired, String auditsRequired) {
        this.approvalsRequired = approvalsRequired;
        this.auditsRequired = auditsRequired;
    }    
    
    public String approvalsRequired;   
    public String auditsRequired;    
    
    public void setApprovalsRequired(String approvalsRequired) {
    	this.approvalsRequired = approvalsRequired;
    }
    
    public String getApprovalsRequired() {
    	return approvalsRequired;
    }    
    
    public void setAuditsRequired(String auditsRequired) {
    	this.auditsRequired = auditsRequired;
    }
    
    public String getAuditsRequired() {
    	return auditsRequired;
    }
}