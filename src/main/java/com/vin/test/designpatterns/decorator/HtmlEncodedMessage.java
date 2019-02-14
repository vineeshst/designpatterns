package com.vin.test.designpatterns.decorator;
import org.apache.commons.text.StringEscapeUtils;

public class HtmlEncodedMessage implements Message {
	
	private Message msg;
	
	public HtmlEncodedMessage(Message msg) {		
		this.msg = msg;
	}
	
	public String getContent() {		
		return StringEscapeUtils.escapeHtml4(msg.getContent());
	}

}
