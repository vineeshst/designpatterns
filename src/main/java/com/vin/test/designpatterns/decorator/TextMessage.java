package com.vin.test.designpatterns.decorator;

public class TextMessage implements Message {
	
	private String msg;
	

	public TextMessage(String msg) {		
		this.msg = msg;
	}


	public String getContent() {		
		return msg;
	}

}
