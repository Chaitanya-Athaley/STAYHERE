package com.stayhere.common;

import java.io.Serializable;

public enum SuccessCodes implements Serializable{

	SUCCESS_CREATED("202","created");
	
	final private String code;
	final private String message;
	
	private SuccessCodes(String code, String message) {
		this.code = code;
		this.message = message;
	}

	public String getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}
	
	public static String getCodeMessage(String code) {
		if(code.equals(SUCCESS_CREATED.getCode())) {
			return SUCCESS_CREATED.getMessage();
		}
		return code;
	}
}
