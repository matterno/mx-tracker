package de.timoklostermann.mxtracker.dto;

import java.util.Date;

public class MessageDTO {

	private String message;
	private Date created;
	
	public MessageDTO() {};
	
	public MessageDTO(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}
	
}
