package com.bupa.ohmb.indra.project.exception;

public class Message {
	
	private String code;
	private String message;
	

    
	public Message(String code, String message) {
		super();
		this.code = code;
		this.message = message;
		
	}
	
	
	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public String getMessage() {
		return message;
	}

	public void setMessege(String message) {
		this.message = message;
	}


}
