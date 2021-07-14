package com.bupa.ohmb.indra.project.exception;

public class HttpClientErrorException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	private String message;

	public HttpClientErrorException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
