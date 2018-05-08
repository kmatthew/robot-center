package com.fdc.trr.rules.model;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;


public class GetRulesResponse {
	
	private String detail;
    private String returnCode;
    private List<String> rulesList;
	
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getReturnCode() {
		return returnCode;
	}
	public void setReturnCode(String returnCode) {
		this.returnCode = returnCode;
	}
	public List<String> getRulesList() {
		return rulesList;
	}
	public void setRulesList(List<String> rulesList) {
		this.rulesList = rulesList;
	}


}
