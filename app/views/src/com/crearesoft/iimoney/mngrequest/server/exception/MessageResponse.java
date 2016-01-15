package com.crearesoft.iimoney.mngrequest.server.exception;


public class MessageResponse {
	private String codError;
	private String message;
	private String detail;
	
	
	public MessageResponse(String code, String msg){
		this.codError = code;
		this.message = msg;	
	}
	
	public String getCodError() {
		return codError;
	}


	public void setCodError(String codError) {
		this.codError = codError;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}

	
	
	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public MessageResponse addDetail(String detail){
		this.detail = detail;
		return this;
	}
	public String getJsonMessage(){
		return "{ \"mensaje\":\""+getMessage()+"\""+
				",\"codigo\":\""+getCodError()+"\""+
				((null==getDetail())?"}":",\"detail\":\""+getDetail()+"\"}");
	}

}
